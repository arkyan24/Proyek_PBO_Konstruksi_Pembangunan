public class CivilService implements service {
   private String NamaTenagaAhli;
   private double TarifPerDesain;

   public CivilService(String NamaTenagaAhli,double TarifPerDesain){
    this.NamaTenagaAhli = NamaTenagaAhli;
    this.TarifPerDesain = TarifPerDesain;
   }

   @Override
   public void serviceTambahan(){
    System.out.println("Service Tambahan untuk Layanan Sipil.");
   }

   public void totalCost(int jumlahDesain){
        double total = JumlahDesain * TarifPerDesain;
        System.out.println("Total Biaya: " + total);
   }

   public void displayService(){
        System.out.println("Nama Tenaga Ahli: "+ NamaTenagaAhli);
        System.out.println("Tarif Per Desain: "+ TarifPerDesain);
   }
}