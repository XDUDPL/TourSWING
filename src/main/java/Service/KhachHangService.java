package Service;


import Common.BaseRequest;
import Model.KhachHangModel;
import Model.TourLoaiModel;

import java.util.List;

public class KhachHangService {
    private static String url = "http://localhost:8080/api/khachhangs";

    public static void main(String[] args) {
        BaseRequest<TourLoaiModel> request = new BaseRequest<>(url,TourLoaiModel.class,TourLoaiModel[].class);
        List<TourLoaiModel> list = request.get();
        System.out.println(request.get(6));
    }
}
