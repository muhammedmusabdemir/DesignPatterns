package BehaivoralDP.ChainOfResponsibilityDP;

public class GenelMudur extends Approver{

    public GenelMudur() {
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {

        System.out.println("Genel mudur onayladi.");
        System.out.println("*************************************");
        return true;
    }
}
