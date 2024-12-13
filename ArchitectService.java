public class ArchitectService implements Service{
    private String NamaTenagaAhli;
    private double TarifPerDesain;


    public ArchitectService(String NamaTenagaAhli, double TarifPerDesain){
     this.NamaTenagaAhli = NamaTenagaAhli;
     this.TarifPerDesain = TarifPerDesain;
    }

    @Override
    public void serviceTambahan(){
       System.out.println("Service Tambahan untuk layanan Arsitek");
    }

}
