package dp;

import java.io.File;
import java.io.IOException;

public abstract class Observer {
	protected String observerName;
	protected ConcreteSubject subject;

    public Observer(ConcreteSubject subject ,String observerName) {
    	this.subject = subject;
        this.observerName = observerName;
    }

    public abstract void update();
   

}