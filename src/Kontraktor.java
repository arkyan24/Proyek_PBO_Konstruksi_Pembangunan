import java.util.Date;

class Kontraktor extends TimPekerja {
    public Kontraktor(String id, String nama, Date tanggalMasuk, String detail) {
        super(id, nama, tanggalMasuk, detail);
    }

    @Override
    public int Gaji(int durationProject) {
        return durationProject * 300000;
    }
}