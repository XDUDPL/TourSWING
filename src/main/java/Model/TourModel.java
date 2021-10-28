package Model;

public class TourModel {
    private Integer id;
    private String tourMota;
    private String tourTen;
    private TourLoaiModel tourLoaiModel;
    public TourModel(Integer id, String tourMota, String tourTen , TourLoaiModel tourLoaiModel) {
        this.id = id;
        this.tourMota = tourMota;
        this.tourTen = tourTen;
        this.tourLoaiModel = tourLoaiModel;
    }

    public TourModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTourMota() {
        return tourMota;
    }

    public void setTourMota(String tourMota) {
        this.tourMota = tourMota;
    }

    public String getTourTen() {
        return tourTen;
    }

    public void setTourTen(String tourTen) {
        this.tourTen = tourTen;
    }

    public TourLoaiModel getTourLoaiModel() {
        return tourLoaiModel;
    }

    public void setTourLoaiModel(TourLoaiModel tourLoaiModel) {
        this.tourLoaiModel = tourLoaiModel;
    }

    @Override
    public String toString() {
        return id +
                "#" + tourMota +
                "#" + tourTen +
                "#" + tourLoaiModel ;
    }
}
