package by.exercise46;

import java.io.File;
import java.util.ArrayList;

public class FoldersFiles {
    private ArrayList<String> folders;
    private ArrayList<String> files;
    private final String path;

    public FoldersFiles(String path) {
        this.path = path;
        initArrayLists();
    }

    private void initArrayLists() {
        folders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public void separate() {
        File pathToFolder = new File(path);
        File[] listFilesFolders = pathToFolder.listFiles();
        if(listFilesFolders == null) {
            System.out.println("Folder doesn't exist!!!");
            System.exit(0);
        }
        for (File name : listFilesFolders) {
            if(name.isFile()) {
                files.add(name.getName());
                continue;
            }
            folders.add(name.getName());
        }
    }

    public ArrayList<String> getFolders() {
        System.out.println("FOLDERS: ");
        return folders;
    }

    public ArrayList<String> getFiles() {
        System.out.println("FILES: ");
        return files;
    }
}
