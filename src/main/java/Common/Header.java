package Common;

public class Header {
    public static final String khachhang = "ID#Tên Khách Hàng#Số điện thoại#Ngày sinh#Email#CMND";
    public static final String TourLoai="ID#Tên Loại#Mô tả";
    public static final String Tour="ID#Mô tả#Tên Tour";
    public static String getHeader(String header){
        switch (header){
            case "KhachHangModel":{
                return khachhang;
            }
            case "TourLoaiModel":{
                return TourLoai;
            }
            case "TourModel" :{
                return Tour;
            }
            default:{
                return "";
            }
        }
    }
}
