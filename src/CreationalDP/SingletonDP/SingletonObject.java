package CreationalDP.SingletonDP;

public class SingletonObject {

    public String message = "Merhaba; ";

    private SingletonObject() {   }

    private static SingletonObject instance; //ilk kez cagrildiginda SingletonObject

    public static SingletonObject getInstance(){

        if (instance==null){ //method ilk kez cagrildiginida constructor ile obje uretilir
            instance=new SingletonObject();
        }
        return instance;
    }

    public void changeMessage(){
        this.message+=" Batch 153...157";
    }
}
