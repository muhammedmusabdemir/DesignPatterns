package CreationalDP.PrototypeDP;

public class Runner {

    public static void main(String[] args) {

        Soldier soldierAvailable = new Soldier(100,20,60,"Kilic",true); //prototip
        Soldier soldierNotAvailable = new Soldier(100,20,60,"Kilic",false);

        //bir tane askeri prototip olarak alsak ve klonlasak, sadece farkli olan ozelligini sonradan degistirsek

        Soldier soldier3 = soldierAvailable.clone();
        soldier3.setAvailable(false);

        Soldier soldier4 = soldierAvailable.clone();
        soldier4.setHealth(90);

        System.out.println("********* prototip *********");
        soldierAvailable.printInfo();
        System.out.println("********* 3 *********");
        soldier3.printInfo();
        System.out.println("********* 4 *********");
        soldier4.printInfo();

    }
}
