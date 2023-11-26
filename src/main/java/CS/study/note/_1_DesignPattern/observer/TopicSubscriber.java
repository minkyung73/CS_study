package CS.study.note._1_DesignPattern.observer;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TopicSubscriber implements Observer {
    private String name;
    private Subject topic;

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        System.out.println(name + ":: got message >> " + msg);
    }
}
