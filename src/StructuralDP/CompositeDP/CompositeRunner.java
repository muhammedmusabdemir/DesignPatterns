package StructuralDP.CompositeDP;

public class CompositeRunner {

    public static void main(String[] args) {

        //tum calisanlari listele

        HeadDepartment head = new HeadDepartment();
        Finance finance = new Finance();
        Sales sales = new Sales();
        Arge arge = new Arge();

        head.add(finance);
        head.add(sales);
        head.add(arge);

        System.out.println("Tum depatmanlar: " + head.getName());
        System.out.println("Tum calisanlar: " + head.getEmployees());




    }
}
