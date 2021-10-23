package Service;


import Common.BaseRequest;
import Model.KhachHangModel;
import Model.TourLoaiModel;

import java.util.List;

public class KhachHangService implements Service{
    private static String url = "http://localhost:8080/api/khachhangs";
    private static BaseRequest<KhachHangModel> instance;
    private static List<KhachHangModel> data;
    public static BaseRequest<KhachHangModel> getInstance(){
        if(instance==null){
            instance = new BaseRequest<>(url,KhachHangModel.class,KhachHangModel[].class);
        }
        return instance;
    }

    public List<KhachHangModel> getData() {
        if(data == null){
            data = getInstance().get();
        }
        return data;
    }

    public static void main(String[] args) {
        BaseRequest<TourLoaiModel> request = new BaseRequest<>(url,TourLoaiModel.class,TourLoaiModel[].class);
        List<TourLoaiModel> list = request.get();
        System.out.println(request.get(6));
    }
}
