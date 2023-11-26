package CS.study.note._1_DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {
    private List<Observer> observers;   // 토픽(주체)에게 알람을 받는 옵저버 목록
    private String message;

    public Topic() {
        this.observers = new ArrayList<>();
        this.message = "";
    }

    @Override
    public void register(Observer obj) {
        if(!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(Observer::update);
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("message sended to Topic: " + msg);
        this.message = msg;
        notifyObservers();
    }
}
