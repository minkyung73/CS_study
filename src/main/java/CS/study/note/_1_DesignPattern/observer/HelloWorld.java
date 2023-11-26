package CS.study.note._1_DesignPattern.observer;

public class HelloWorld {
    public static void main(String[] args) {
        Topic topic = new Topic();  // 주체

        // 옵저버
        Observer a = new TopicSubscriber("a", topic);
        Observer b = new TopicSubscriber("b", topic);
        Observer c = new TopicSubscriber("c", topic);

        topic.register(a);
        topic.register(b);
        topic.register(c);

        topic.postMessage("amumu is op champion!!");
    }
}
