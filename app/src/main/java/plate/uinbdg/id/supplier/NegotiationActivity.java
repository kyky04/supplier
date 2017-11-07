package plate.uinbdg.id.supplier;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class NegotiationActivity extends AppCompatActivity {
    EditText interval, harga, financial, tranportas, trackrecord;
    Spinner status, ketersediaan, kualitas;
    Button btnTest;
    List<Suppplier> listSupllier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negotiation);

        interval = (EditText) findViewById(R.id.et_interval);
        harga = (EditText) findViewById(R.id.et_interval);
        financial = (EditText) findViewById(R.id.et_interval);
        tranportas = (EditText) findViewById(R.id.et_interval);
        trackrecord = (EditText) findViewById(R.id.et_track_record);
        status = (Spinner) findViewById(R.id.sp_status);
        ketersediaan = (Spinner) findViewById(R.id.sp_ketersediaan);
        kualitas = (Spinner) findViewById(R.id.sp_kualitas);
        btnTest = (Button) findViewById(R.id.btn_test);

        listSupllier = new ArrayList<>();

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listSupllier = getSupplier();

//                hitungInterval(listSupllier);
                hitungStatus(listSupllier);
            }
        });
    }

    public List<Suppplier> getSupplier() {
        List<Suppplier> list = new ArrayList<>();

        Suppplier suppplier = new Suppplier(45, 1, 500, 1, 1, 300, 5, 12700000);
        suppplier.setNamaSuplier("Bapak Opan");
        list.add(suppplier);

        suppplier = new Suppplier(30, 1, 300, 1, 2, 114, 3, 14035000);
        suppplier.setNamaSuplier("Bapak Beben");
        list.add(suppplier);


        suppplier = new Suppplier(30, 2, 300, 1, 2, 81, 4, 14031000);
        suppplier.setNamaSuplier("Bapak Komar");
        list.add(suppplier);

        suppplier = new Suppplier(15, 2, 130, 1, 2, 84, 2, 17000871);
        suppplier.setNamaSuplier("Bapak Rohman");
        list.add(suppplier);

        suppplier = new Suppplier(14, 3, 250, 1, 2, 78, 3, 11305000);
        suppplier.setNamaSuplier("Bapak Atep");
        list.add(suppplier);

        suppplier = new Suppplier(40, 3, 300, 1, 2, 57, 3, 16066000);
        suppplier.setNamaSuplier("ibu Rina");
        list.add(suppplier);

        suppplier = new Suppplier(20, 3, 100, 1, 2, 30, 2, 14504000);
        suppplier.setNamaSuplier("Bapak Yaman");
        list.add(suppplier);

        suppplier = new Suppplier(30, 1, 600, 1, 1, 149, 6, 12437000);
        suppplier.setNamaSuplier("Ibu Intan");
        list.add(suppplier);

        return list;
    }


    public List<Interval> hitungInterval(List<Suppplier> suppplierList) {
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < suppplierList.size(); i++) {
            listInteger.add(suppplierList.get(i).getStatus());
        }

        int nilaiTerbesar = Collections.max(listInteger);
        int rangeSatu = nilaiTerbesar / 1;
        int rangeDua = nilaiTerbesar / 2;
        int rangeTiga = nilaiTerbesar / 3;

        List<Interval> listInterval = new ArrayList<>();
        for (int i = 0; i < listInteger.size(); i++) {
            Interval interval = new Interval();
            if (listInteger.get(i) > rangeDua) {
                interval.setNamaInterval("Sangat Penting");
                interval.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) > rangeTiga && listInteger.get(i) < rangeSatu) {
                interval.setNamaInterval("Sedikit Lebih Penting");
                interval.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) < rangeSatu) {
                interval.setNamaInterval("Sama Penting");
                interval.setNilai(listInteger.get(i));
            }
            listInterval.add(interval);
        }

        for (int i = 0; i < listInterval.size(); i++) {
            Log.d("listInterval", listInterval.get(i).getNamaInterval() + " " + String.valueOf(listInterval.get(i).getNilai()));
        }

        return listInterval;
    }


    public List<Status> hitungStatus(List<Suppplier> suppplierList) {
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < suppplierList.size(); i++) {
            listInteger.add(suppplierList.get(i).getStatus());
        }

        List<Status> listStatus = new ArrayList<>();
        for (int i = 0; i < listInteger.size(); i++) {
            Status status = new Status();
            if (listInteger.get(i) == 1) {
                status.setNamaStatus("Sangat Penting");
                status.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) == 2) {
                status.setNamaStatus("Sedikit Lebih Penting");
                status.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) == 3) {
                status.setNamaStatus("Sama Penting");
                status.setNilai(listInteger.get(i));
            }
            listStatus.add(status);
        }

        for (int i = 0; i < listStatus.size(); i++) {
            Log.d("listStatus", listStatus.get(i).getNamaStatus() + " " + String.valueOf(listStatus.get(i).getNilai()));
        }

        return listStatus;
    }

    public List<Financial> hitungFinancial(List<Suppplier> suppplierList) {
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < suppplierList.size(); i++) {
            listInteger.add(suppplierList.get(i).getFinancial());
        }

        int nilaiTerbesar = Collections.max(listInteger);
        int rangeSatu = nilaiTerbesar / 1;
        int rangeDua = nilaiTerbesar / 2;
        int rangeTiga = nilaiTerbesar / 3;

        List<Financial> financialList = new ArrayList<>();
        for (int i = 0; i < listInteger.size(); i++) {
            Financial financial = new Financial();
            if (listInteger.get(i) > rangeDua) {
                financial.setFinancial("Sangat Penting");
                financial.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) > rangeTiga && listInteger.get(i) < rangeSatu) {
                financial.setFinancial("Sedikit Lebih Penting");
                financial.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) < rangeSatu) {
                financial.setFinancial("Sama Penting");
                financial.setNilai(listInteger.get(i));
            }
            financialList.add(financial);
        }

        for (int i = 0; i < financialList.size(); i++) {
            Log.d("listInterval", financialList.get(i).getFinancial() + " " + String.valueOf(financialList.get(i).getNilai()));
        }

        return financialList;
    }

    public List<Ketersediaan> hitungKetersediaan(List<Suppplier> suppplierList) {
        List<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < suppplierList.size(); i++) {
            listInteger.add(suppplierList.get(i).getKetersediaan());
        }


        List<Ketersediaan> ketersediaanList = new ArrayList<>();
        for (int i = 0; i < listInteger.size(); i++) {
            Ketersediaan ketersediaan = new Ketersediaan();
            if (listInteger.get(i) == 0) {
                ketersediaan.setNilaiKetersediaan("Tidak Terpenuhi");
                ketersediaan.setNilai(listInteger.get(i));
            } else if (listInteger.get(i) == 1) {
                ketersediaan.setNilaiKetersediaan("Terpenuhi");
                ketersediaan.setNilai(listInteger.get(i));
            }
            ketersediaanList.add(ketersediaan);
        }

        for (int i = 0; i < ketersediaanList.size(); i++) {
            Log.d("listInterval", ketersediaanList.get(i).getNamaKetersediaan() + " " + String.valueOf(ketersediaanList.get(i).getNilai()));
        }

        return ketersediaanList;
    }
}
