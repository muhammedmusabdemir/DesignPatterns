package BehaivoralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{

    //tum katilimcilari uzman oldugu topicle birlikte kayit edelim

    Map<String,Actor> registeredActors = new HashMap<>();

    public void register(Actor actor, String topic){
        registeredActors.put(topic,actor);
    }

    @Override
    public void dispatch(String topic, String message) {

        //topicle ilgili actoru bulmamaiz gerekiyor

        Actor actor = registeredActors.get(topic);

        if(actor==null){
            System.out.println("Bu konuda uzman katilimci yoktur.");
        }else {
            actor.receiveMessage(message); //actor mesaji alarak cevaplar..
        }





    }
}
