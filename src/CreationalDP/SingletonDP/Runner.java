package CreationalDP.SingletonDP;

public class Runner {

    public static void main(String[] args) {

        /*SingletonObject object1 = new SingletonObject();
        SingletonObject object2 = new SingletonObject();
        System.out.println(object1==object2); //farkli referanslar*/

        SingletonObject object3 = SingletonObject.getInstance();
        SingletonObject object4 = SingletonObject.getInstance();
        System.out.println(object3==object4); //ayni referanslar

        System.out.println(object3.message); //Merhaba;
        object3.changeMessage(); //Merhaba; Batch 153...157
        System.out.println(object3.message);

        System.out.println("----------------------------------------");

        System.out.println(object4.message); //Merhaba; Batch 153...157

        //SingletonObject object5 = new SingletonObject();
        //default constructor private yapilir ki farkli ref ile obje olusturulamasin
    }
}
