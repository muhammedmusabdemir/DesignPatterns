package BehaivoralDP.ChainOfResponsibilityDP;

public class Mudur extends Approver{

    public Mudur(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if (amount<10000){
            System.out.println("Mudur onayladi.");
            System.out.println("******************************");
            return true;
        } else if (chief!=null) {
            System.out.println("Mudurun bu miktari onaylama yetkisi yok, sefe yonlendiriliyorsunuz..");
            return chief.approveLoan(amount);
        }
        return false;
    }
}
