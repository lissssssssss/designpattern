package com.lss.observer;

import com.lss.observer.observer.Observer;
import com.lss.observer.observer.impl.Observer1;
import com.lss.observer.observer.impl.Observer2;
import com.lss.observer.observerable.Subject;
import com.lss.observer.observerable.impl.SubjectImpl;
import org.junit.Test;

/**
 * @author lishengsheng
 */
public class ObserverTest {
    @Test
    public void test() {
        SubjectImpl subject = new SubjectImpl();
        Observer1 observer1 = new Observer1(subject);
        Observer2 observer2 = new Observer2(subject);
        subject.changeData(3, 2);
        System.out.println("-------------------------");
        subject.changeData(6, 3);
        observer1.removeSubject();
        System.out.println("-------------------------");
        subject.changeData(6, 3);
        System.out.println("-------------------------");
        observer2.removeSubject();
        subject.changeData(6, 3);
    }
}
