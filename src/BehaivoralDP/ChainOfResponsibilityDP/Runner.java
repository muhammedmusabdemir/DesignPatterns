package BehaivoralDP.ChainOfResponsibilityDP;

public class Runner {

    public static void main(String[] args) {

        Approver gm = new GenelMudur();
        Approver mudur = new Mudur(gm);
        Approver memur = new Memur(mudur);

        System.out.println("-------------------------------------------------");
        System.out.println("Musteri memurdan talep ettigi kredi miktari: 500");
        memur.approveLoan(500);

        System.out.println("-------------------------------------------------");
        System.out.println("Musteri memurdan talep ettigi kredi miktari: 5000");
        memur.approveLoan(5000);

        System.out.println("-------------------------------------------------");
        System.out.println("Musteri memurdan talep ettigi kredi miktari: 50000");
        memur.approveLoan(50000);



    }
}
