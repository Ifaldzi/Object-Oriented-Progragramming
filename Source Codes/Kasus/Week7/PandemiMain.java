package Kasus.Week7;

public class PandemiMain {
    public static void main(String[] args) {
    Manusia OrangKe_1 = new Manusia();
    Covid19 corona = new Covid19();
    corona.setActive(true);
    OrangKe_1.setCovid19(corona);
    OrangKe_1.setImun(30);
   
    Manusia OrangKe_2 = new Manusia();
    OrangKe_2 = OrangKe_1.clone();
    OrangKe_2.setCovid19(corona.clone());
    OrangKe_2.setImun(120);
   
    OrangKe_1.setStatusCovid19();
    OrangKe_2.setStatusCovid19();
   
    System.out.println("Orang ke-1 : ");
    System.out.println("Status Virus : "+OrangKe_1.getCovid19().getActive());
    System.out.println("Status Terinfeksi : "+OrangKe_1.getCovid19().getStatus());
    System.out.println("======================================");
    System.out.println("Orang ke-2 : ");
    System.out.println("Status Virus: "+OrangKe_2.getCovid19().getActive());
    System.out.println("Status Terinfeksi : "+OrangKe_2.getCovid19().getStatus());
   
    }
}   