package Common;

import Model.KhachHangModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import java.util.List;

public class BaseRequest<T>{
    String url;
    public static final String FAIL = "FAIL";
    private final Class<T> type;
    public BaseRequest(String url,Class<T> type) {
        this.type = type;
        this.url = url;
    }
    public List<T> get(){
        ClientConfig clientConfig = new DefaultClientConfig();
        Client client = Client.create(clientConfig);
        WebResource webResource = client.resource(url);
        Builder builder = webResource.accept(MediaType.APPLICATION_JSON) //
                .header("content-type", MediaType.APPLICATION_JSON);
        ClientResponse response = builder.get(ClientResponse.class);
        if (response.getStatus() != 200) {
            System.err.println("Failed with HTTP Error code: " + response.getStatus());
            String error= response.getEntity(String.class);
            System.err.println("Error: "+error);
            return null;
        }

        String data = response.getEntity(String.class);
        return new Gson().fromJson(data, new TypeToken<List<KhachHangModel>>(){}.getType());
    }
    public T get(int id){
        ClientConfig clientConfig = new DefaultClientConfig();
        Client client = Client.create(clientConfig);

        WebResource webResource = client.resource(url+"/"+id);

        Builder builder = webResource.accept(MediaType.APPLICATION_JSON) //
                .header("content-type", MediaType.APPLICATION_JSON);

        ClientResponse response = builder.get(ClientResponse.class);
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error= response.getEntity(String.class);
            System.out.println("Error: "+error);
            return null;
        }
        String data = response.getEntity(String.class);
        System.out.println("ABS"+data);
        return new Gson().fromJson(data,type);
    }
    public boolean post(T model){
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        String data = gson.toJson(model);
        ClientResponse response = webResource.type("application/json").post(ClientResponse.class, data);
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return false;
        }
        return true;
    }
    public boolean put(T model,int id){
        Client client = Client.create();
        WebResource webResource = client.resource(url+"/"+id);
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
        String data = gson.toJson(model);
        ClientResponse response = webResource.type("application/json").put(ClientResponse.class, data);
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return false;
        }
        return true;
    }
    public boolean delete(int id){
        Client client = Client.create();
        WebResource webResource = client.resource(url+"/"+id);
        ClientResponse response = webResource.type("application/json").delete(ClientResponse.class);
        if (response.getStatus() != 200) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return false;
        }
        return true;
    }
}
