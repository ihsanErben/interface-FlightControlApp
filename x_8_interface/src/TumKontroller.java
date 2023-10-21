

public class TumKontroller implements KisiselKontrol, UcusKontrol {

    @Override
    public boolean isim(KisiBilgileri kisi) {
        if (kisi.getIsim().equals("ihsan")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean tc(KisiBilgileri kisi) {
        if (kisi.getTc().equals("27517996848")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean yas(KisiBilgileri kisi) {
        if (kisi.getYas() < 18) {
            return false;
        }
        return true;
    }

    @Override
    public boolean harc(KisiBilgileri kisi) {
        if (kisi.getHarc() < 500) {
            return false;
        }
        return true;

    }

    @Override
    public boolean vize(KisiBilgileri kisi) {
        if (kisi.getVize().equals("evet")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean sabika(KisiBilgileri kisi) {
        if (kisi.getSabika().equals("hayir")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean yasak(KisiBilgileri kisi) {
        if (kisi.getYasak().equals("hayir")) {
            return true;
        }
        return false;
    }

}
