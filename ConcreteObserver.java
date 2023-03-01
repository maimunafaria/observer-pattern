package dp;

import java.io.File;
import java.io.IOException;

public class ConcreteObserver extends Observer {
	   public ConcreteObserver(ConcreteSubject subject, String observerName) {
		   	super(subject, observerName);
	    }

	    public void update() {
	        System.out.println(observerName + " has been notified of a file change: " + subject.getFile().getName());
	    }
	}