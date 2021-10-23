package Service;


import Common.BaseRequest;
import Model.KhachHangModel;

public class KhachHangService {
    private static String url = "http://localhost:8080/api/khachhangs";

    public static void main(String[] args) {
        BaseRequest<KhachHangModel> request = new BaseRequest<>(url,KhachHangModel.class);
        if(request.delete(10)){
            System.out.println("Được");
        }else{
            System.out.println("Không");
        }
        System.out.println(request.get().size());
    }
}
