package unhas.informatics.monitoringapp.Model;

import com.google.firebase.database.Exclude;

import java.io.Serializable;

public class Barang implements Serializable {
    private String nama;
    private String daya;
    private String key;

    public Barang(String nama, String daya) {
        this.nama = nama;
        this.daya = daya;
    }

    public Barang() {
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDaya() {
        return daya;
    }

    public void setDaya(String daya) {
        this.daya = daya;
    }

    @Exclude
    public String getKey() {
        return key;
    }

    @Exclude
    public void setKey(String key) {
        this.key = key;
    }
}
