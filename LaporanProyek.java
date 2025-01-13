import java.util.Date;
import java.util.Scanner;

class LaporanProyek {
    private Proyek proyek;
    private String laporanTanggal;
    private String laporanDetailProyek;
    private String progressDetails;

    public LaporanProyek(Proyek proyek, String laporanTanggal, String laporanDetailProyek) {
        this.proyek = proyek;
        this.laporanTanggal = laporanTanggal;
        this.laporanDetailProyek = laporanDetailProyek;
        this.progressDetails = "";
    }

    // Overloading constructor
    public LaporanProyek(Proyek proyek, String laporanTanggal) {
        this(proyek, laporanTanggal, "Tidak ada detail yang diberikan.");
    }

    public void SimpanProgress(String detail) {
        progressDetails += (progressDetails.isEmpty() ? "" : "\n") + detail;
    }

    // Overloading SimpanProgress untuk menyimpan dengan detail dan tanggal
    public void SimpanProgress(String detail, String tanggal) {
        progressDetails += (progressDetails.isEmpty() ? "" : "\n") + "[" + tanggal + "] " + detail;
    }

    // Overloading SimpanProgress untuk menyimpan progress dalam format array
    public void SimpanProgress(String[] details) {
        for (String detail : details) {
            SimpanProgress(detail);
        }
    }

    public void DisplayProject() {
        System.out.println("Proyek:");
        System.out.println("ID Proyek: " + proyek.getIdProyek());
        System.out.println("Nama Proyek: " + proyek.getNamaProyek());
        System.out.println("Lokasi: " + proyek.getLokasi());
        System.out.println("Anggaran (Miliar): " + proyek.getAnggaran());
        System.out.println("Status: " + proyek.getStatus());
        System.out.println("\nLaporan Proyek:");
        System.out.println("Tanggal: " + laporanTanggal);
        System.out.println("Detail Proyek: " + laporanDetailProyek);
        System.out.println("Progress Details:");
        System.out.println(progressDetails);
    }

    // Overloading DisplayProject untuk menampilkan proyek berdasarkan filter tertentu
    public void DisplayProject(boolean showProgressOnly) {
        if (showProgressOnly) {
            System.out.println("Progress Details:");
            System.out.println(progressDetails);
        } else {
            DisplayProject();
        }
    }
}
