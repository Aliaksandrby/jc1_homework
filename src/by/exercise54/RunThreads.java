package by.exercise54;

import java.io.File;

public class RunThreads {
    private final String filename;
    private final String threadName;
    private final int sizeArray;

    public RunThreads(String filename, String threadName, int sizeArray,int countThread) {
        //delFileIfExists();
        this.filename = filename;
        this.threadName = threadName;
        this.sizeArray = sizeArray;
        go(countThread);
    }

    private void go(int countThread) {
        if(countThread < 1) {
            System.out.println("check parameter countThread '1 or more'");
            System.exit(2);
        }
        for (int i = 0; i < countThread; i++) {
            new ThreadWriterFile(filename,threadName + " " + (i+1),sizeArray);
        }
    }

    private void delFileIfExists() {
        File file = new File(filename);
        if(file.exists()) {
            if(file.delete()) System.out.println("file was deleted");
        } else {
            System.out.println("file will be created");
        }
    }
}
