import java.util.Date;

class TenagaKerja extends TimPekerja {
    public TenagaKerja(String id, String nama, Date tanggalMasuk, String detail) {
        super(id, nama, tanggalMasuk, detail);
    }

    @Override
    public int Gaji(int durationProject) {
        return 3000000 + (durationProject * 100000);
    }
}
