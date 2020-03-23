package com.lss.observer.observerable;

import com.lss.observer.observer.Observer;

/**
 * @author lishengsheng
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
