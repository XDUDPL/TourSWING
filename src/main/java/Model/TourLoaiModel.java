package Model;

public class TourLoaiModel {
    private Integer id;
    private String loaiTen;
    private String loaiMota;

    public TourLoaiModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoaiTen() {
        return loaiTen;
    }

    public void setLoaiTen(String loaiTen) {
        this.loaiTen = loaiTen;
    }

    public String getLoaiMota() {
        return loaiMota;
    }

    public void setLoaiMota(String loaiMota) {
        this.loaiMota = loaiMota;
    }

    @Override
    public String toString() {
        return id +
                "#" + loaiTen +
                "#" + loaiMota;
    }
}