import java.util.Date;

class PengawasProyek extends TimPekerja {
    public PengawasProyek(String id, String nama, Date tanggalMasuk, String detail) {
        super(id, nama, tanggalMasuk, detail);
    }

    @Override
    public int Gaji(int durationProject) {
        return 5000000 + (durationProject * 200000);
    }
}
