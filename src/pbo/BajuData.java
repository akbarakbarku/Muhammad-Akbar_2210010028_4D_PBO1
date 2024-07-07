package pbo;

//Inheritance
public class BajuData extends Baju {
    // Constructor
    public BajuData(String namaPembeli, String kodePembeli, int harga) {
        super(namaPembeli, kodePembeli, harga);
    }
    
    public String getMerkBaju() {
        String kodeMerk = getKodePembeli().substring(0, 2);
        // Seleksi Percabangan Switch Case
        switch (kodeMerk) {
            case "01":
                return "LEVI'S";
            case "02":
                return "NIKE";
            case "03":
                return "GUCCI";
            case "04":
                return "CHANEL";
            case "05":
                return "HERMES";
            default:
                return "Merk Lain";
        }
    }
    
    public String getWarnaBaju() {
        String kodeWarna = getKodePembeli().substring(2, 4);
        switch (kodeWarna) {
            case "01":
                return "Merah";
            case "02":
                return "Kuning";
            case "03":
                return "Hijau";
            case "04":
                return "Biru";
            case "05":
                return "Hitam";
            default:
                return "Warna Lain";
        }
    }
    
    public String getUkuranBaju() {
        String kodeUkuran = getKodePembeli().substring(4, 6);
        switch (kodeUkuran) {
            case "01":
                return "S";
            case "02":
                return "M";
            case "03":
                return "L";
            case "04":
                return "XL";
            case "05":
                return "XXL";
            default:
                return "Ukuran Lain";
        }
    }
    
    // Polymorphism (Overriding)
    @Override
    public String info() {
        return super.info() +
                "\nMerk Baju: " + getMerkBaju() +
                "\nWarna Baju: " + getWarnaBaju() +
                "\nUkuran Baju: " + getUkuranBaju();
    }
}