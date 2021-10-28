package Service;

import Common.BaseRequest;
import Model.TourModel;

import java.util.List;

public class TourService implements Service{
    private static String url = "http://localhost:8080/api/tour";
    private static BaseRequest<TourModel> instance;
    private static List<TourModel> data;

    public static BaseRequest<TourModel> getInstance(){
        if(instance==null){
            instance = new BaseRequest<>(url,TourModel.class,TourModel[].class);
        }
        return instance;
    }

    public  List<TourModel> getData() {
        if(data == null){
            data = getInstance().get();
        }
        return data;
    }
}
