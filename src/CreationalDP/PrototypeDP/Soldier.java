package CreationalDP.PrototypeDP;

public class Soldier implements Cloneable{

    private int health;

    private int maxLifeTime;

    private int power;

    private String weapon;

    private boolean isAvailable;

    //parametreli constructor
    public Soldier(int health, int maxLifeTime, int power, String weapon, boolean isAvailable) {
        this.health = health;
        this.maxLifeTime = maxLifeTime;
        this.power = power;
        this.weapon = weapon;
        this.isAvailable = isAvailable;
    }

    //getter-setter


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public Soldier clone() {
        try {
            Soldier cloneSoldier = (Soldier) super.clone();

            return cloneSoldier;
        } catch (CloneNotSupportedException e) {
            System.out.println("Asker kopyalanirken hata olustu.");
            e.printStackTrace();
        }
        return null;
    }

    public void printInfo(){

        System.out.println("Yasam suresi: " + this.maxLifeTime);
        System.out.println("Saglik: " + this.health);
        System.out.println("Silah: " + this.weapon);
        System.out.println("Gucu: " + this.power);

        if (isAvailable){
            System.out.println("Asker savasmak icin hazir..");
        }else {
            System.out.println("Bu asker savasamaz!!");
        }

    }
}
