import java.util.Date;

abstract class TimPekerja {
    private String id;
    private String nama;
    private Date tanggalMasuk;
    private String idProyek;
    private String detail;

    public TimPekerja(String id, String nama, Date tanggalMasuk, String detail) {
        this.id = id;
        this.nama = nama;
        this.tanggalMasuk = new Date();
        this.detail = detail;
    }

    public abstract int Gaji(int durationProject);

    public void TambahProyek(String idProyek) {
        this.idProyek = idProyek;
    }

    public void HapusProyek() {
        this.idProyek = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(Date tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getIdProyek() {
        return idProyek;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
