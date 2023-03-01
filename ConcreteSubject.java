package dp;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.ArrayList;

public class ConcreteSubject extends Subject {
	
    public ConcreteSubject(File file) {
        super(file);
    }

    public void monitorChanges() {
        long lastModifiedTime = getFile().lastModified();

        while (true) {
            long newModifiedTime = getFile().lastModified();
            if (newModifiedTime != lastModifiedTime) {
                lastModifiedTime = newModifiedTime;
                notifyObservers();
            }
        }
    }

}
