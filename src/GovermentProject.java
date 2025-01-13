class GovermentProject extends Proyek {
    private String namaLembaga;

    public GovermentProject(String idProyek, String namaProyek, String lokasi, int anggaran, String status, String namaLembaga) {
        super(idProyek, namaProyek, lokasi, anggaran, status);
        this.namaLembaga = namaLembaga;
    }

    @Override
    public void displayProject() {
        super.displayProject();
    }

    public void displayProjectGovernment() {
        System.out.println("Proyek: " + namaProyek + ", Lokasi: " + lokasi + ", Anggaran: " + anggaran + ", Status: " + status);
    }
}