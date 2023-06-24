package BehaivoralDP.ChainOfResponsibilityDP;

public class Memur extends Approver{

    public Memur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if (amount<1000){
            System.out.println("Memur onayladi.");
            System.out.println("******************************");
            return true;
        } else if (chief!=null) {
            System.out.println("Memurun bu miktari onaylama yetkisi yok, sefe yonlendiriliyorsunuz..");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
