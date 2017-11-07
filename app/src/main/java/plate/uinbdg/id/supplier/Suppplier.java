package plate.uinbdg.id.supplier;

/**
 * Created by Comp on 11/8/2017.
 */

public class Suppplier {
    String namaSuplier;
    Integer interval;
    Integer status;
    Integer financial;
    Integer ketersediaan;
    Integer kualitas;
    Integer trackrecord;
    Integer transportasi;
    Integer harga;

    public Suppplier() {
    }

    public Suppplier(Integer interval, Integer status, Integer financial, Integer ketersediaan, Integer kualitas, Integer trackrecord, Integer transportasi, Integer harga) {
        this.interval = interval;
        this.status = status;
        this.financial = financial;
        this.ketersediaan = ketersediaan;
        this.kualitas = kualitas;
        this.trackrecord = trackrecord;
        this.transportasi = transportasi;
        this.harga = harga;
    }

    public String getNamaSuplier() {
        return namaSuplier;
    }

    public void setNamaSuplier(String namaSuplier) {
        this.namaSuplier = namaSuplier;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFinancial() {
        return financial;
    }

    public void setFinancial(Integer financial) {
        this.financial = financial;
    }

    public Integer getKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(Integer ketersediaan) {
        this.ketersediaan = ketersediaan;
    }

    public Integer getKualitas() {
        return kualitas;
    }

    public void setKualitas(Integer kualitas) {
        this.kualitas = kualitas;
    }

    public Integer getTrackrecord() {
        return trackrecord;
    }

    public void setTrackrecord(Integer trackrecord) {
        this.trackrecord = trackrecord;
    }

    public Integer getTransportasi() {
        return transportasi;
    }

    public void setTransportasi(Integer transportasi) {
        this.transportasi = transportasi;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }
}
