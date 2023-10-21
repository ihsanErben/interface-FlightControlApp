


public class KisiBilgileri {
    private String isim;
    private String tc;
    private int yas;
    
    private int harc;
    private String vize;
    private String sabika;
    private String yasak;

    public KisiBilgileri(String isim, String tc, int yas) {
        this.isim = isim;
        this.tc = tc;
        this.yas = yas;
    }

    public KisiBilgileri(int harc, String vize, String sabika, String yasak) {
        this.harc = harc;
        this.vize = vize;
        this.sabika = sabika;
        this.yasak = yasak;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getHarc() {
        return harc;
    }

    public void setHarc(int harc) {
        this.harc = harc;
    }

    public String getVize() {
        return vize;
    }

    public void setVize(String vize) {
        this.vize = vize;
    }

    public String getSabika() {
        return sabika;
    }

    public void setSabika(String sabika) {
        this.sabika = sabika;
    }

    public String getYasak() {
        return yasak;
    }

    public void setYasak(String yasak) {
        this.yasak = yasak;
    }
    
    
}
