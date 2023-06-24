package BehaivoralDP.MediatorDP;

public class Professor implements Actor{

    public String name;

    public Dispatcher dispatcher;

    //parametreli constructor
    public Professor(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }

    @Override //dispatcher tarafindan iletilen mesaji alacak
    public void receiveMessage(String message) {
        System.out.println(this.name + " mesaji cevapliyor: " + message);
    }

    @Override //prof soruyu ilgili katilimciya yonlendirmesin icin dispatcher i kullanacak
    public void sendMessage(String topic, String message) {
        dispatcher.dispatch(topic,message);
    }
}
