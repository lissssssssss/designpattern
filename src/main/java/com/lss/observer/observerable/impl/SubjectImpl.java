package com.lss.observer.observerable.impl;

import com.lss.observer.observer.Observer;
import com.lss.observer.observerable.Subject;

import java.util.ArrayList;

/**
 * @author lishengsheng
 */
public class SubjectImpl implements Subject {
    private Integer a;

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    private Integer b;
    private ArrayList<Observer> observers;

    public SubjectImpl() {
        this.observers = new ArrayList<Observer>();
        a = 0;
        b = 0;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    public void changeData(Integer a, Integer b) {
        this.a = a;
        this.b = b;
        notifyObservers();
    }
}
