package Model;

import java.util.Date;
public class KhachHangModel {
    private Integer Id;
    private String khTen;
    private String khSdt;
    public Date khNgaysinh;
    private String khEmail;
    private String khCmnd;

    public KhachHangModel() {
    }

    public KhachHangModel(Integer id, String khTen, String khSdt, Date khNgaysinh, String khEmail, String khCmnd) {
        Id = id;
        this.khTen = khTen;
        this.khSdt = khSdt;
        this.khNgaysinh = khNgaysinh;
        this.khEmail = khEmail;
        this.khCmnd = khCmnd;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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
}