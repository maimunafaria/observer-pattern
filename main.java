package dp;

import java.io.File;

public class main {
    public static void main(String[] args) throws Exception {
    	        // Create a ConcreteSubject object
    	        File file = new File("C:\\Users\\User\\Desktop\\observerpattern.txt");
    	        ConcreteSubject fileSubject = new ConcreteSubject(file);

    	        // Register one or more ConcreteObserver objects to it
    	        ConcreteObserver observer1 = new ConcreteObserver(fileSubject, "Observer1");
    	        ConcreteObserver observer2 = new ConcreteObserver(fileSubject, "Observer2");
    	        fileSubject.addObserver(observer1);
    	        fileSubject.addObserver(observer2);

    	        // Simulate changes to the file being monitored and verify that the observers are notified of the changes
    	        fileSubject.monitorChanges();
    	    }
    	}