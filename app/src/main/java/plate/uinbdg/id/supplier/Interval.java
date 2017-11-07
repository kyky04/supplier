package plate.uinbdg.id.supplier;

/**
 * Created by Comp on 11/8/2017.
 */

public class Interval {
    Integer nilai;
    String namaInterval;

    public Interval() {
    }

    public Interval(Integer nilai, String namaInterval) {
        this.nilai = nilai;
        this.namaInterval = namaInterval;
    }

    public Integer getNilai() {
        return nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

    public String getNamaInterval() {
        return namaInterval;
    }

    public void setNamaInterval(String namaInterval) {
        this.namaInterval = namaInterval;
    }
}
