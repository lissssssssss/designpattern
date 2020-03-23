package com.lss.observer.observer.impl;

import com.lss.observer.observer.Observer;
import com.lss.observer.observer.ObserverDisplay;
import com.lss.observer.observerable.Subject;
import com.lss.observer.observerable.impl.SubjectImpl;

/**
 * @author lishengsheng
 */
public class Observer1 implements Observer, ObserverDisplay {
    private Subject subject;
    private Integer result;

    public Observer1(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    public void removeSubject() {
        subject.removeObserver(this);
    }

    @Override
    public void update() {
        if (subject instanceof SubjectImpl) {
            result = ((SubjectImpl) subject).getA() + ((SubjectImpl) subject).getB();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Observer1 a+b = " + result);
    }
}
