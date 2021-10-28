package Model;

import java.util.Date;
public class KhachHangModel {
    private Integer id;
    private String khTen;
    private String khSdt;
    public Date khNgaysinh;
    private String khEmail;
    private String khCmnd;

    public KhachHangModel() {
    }

    public KhachHangModel(Integer id, String khTen, String khSdt, Date khNgaysinh, String khEmail, String khCmnd) {
        this.id = id;
        this.khTen = khTen;
        this.khSdt = khSdt;
        this.khNgaysinh = khNgaysinh;
        this.khEmail = khEmail;
        this.khCmnd = khCmnd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKhTen() {
        return khTen;
    }

    public void setKhTen(String khTen) {
        this.khTen = khTen;
    }

    public String getKhSdt() {
        return khSdt;
    }

    public void setKhSdt(String khSdt) {
        this.khSdt = khSdt;
    }

    public Date getKhNgaysinh() {
        return khNgaysinh;
    }

    public void setKhNgaysinh(Date khNgaysinh) {
        this.khNgaysinh = khNgaysinh;
    }

    public String getKhEmail() {
        return khEmail;
    }

    public void setKhEmail(String khEmail) {
        this.khEmail = khEmail;
    }

    public String getKhCmnd() {
        return khCmnd;
    }

    public void setKhCmnd(String khCmnd) {
        this.khCmnd = khCmnd;
    }

    @Override
    public String toString() {
        return id +"#" + khTen +
                "#" + khSdt +
                "#" + khNgaysinh +
                "#" + khEmail +
                "#" + khCmnd;
    }
    public static String Header(){
        return "Id" +
                "#" + "Tên khách hàng" +
                "#" + "Số điện thoại" +
                "#" + "Ngày sinh" +
                "#" + "Email" +
                "#" + "CMND";
    }
}
