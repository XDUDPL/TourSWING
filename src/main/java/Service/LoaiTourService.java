package Service;

import Common.BaseRequest;
import Model.TourLoaiModel;

import java.util.List;

public class LoaiTourService implements Service{
    private static String url = "http://localhost:8080/api/tourloai";
    private static BaseRequest<TourLoaiModel> instance;
    private static List<TourLoaiModel> data;

    public static BaseRequest<TourLoaiModel> getInstance(){
        if(instance==null){
            instance = new BaseRequest<>(url,TourLoaiModel.class,TourLoaiModel[].class);
        }
        return instance;
    }

    public  List<TourLoaiModel> getData() {
        if(data == null){
            data = getInstance().get();
        }
        return data;
    }
}
