package by.exercise50;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileFolder {

    private int numOfFolders;
    private int numOfFiles;
    private final ArrayList<String> dataFromOtherFiles;

    public FileFolder(int numOfFolders,int numOfFiles) {
        setNumOfFolders(numOfFolders);
        setNumOfFiles(numOfFiles);
        this.dataFromOtherFiles = new ArrayList<>();
    }

    private void setNumOfFolders(int numOfFolders) {
        checkInt(numOfFolders);
        this.numOfFolders = numOfFolders;
    }

    private void setNumOfFiles(int numOfFiles) {
        checkInt(numOfFiles);
        this.numOfFiles = numOfFiles;
    }

    private void checkInt(int value) {
        if(value < 1) {
            System.out.println("WRONG ARGUMENT");
            System.exit(0);
        }
    }

    private ArrayList<String> createFiles(String pathToFile,String fileName) {
        ArrayList<String> fileNames = new ArrayList<>();
        for (int i = 0; i < numOfFiles; i++) {
            fileNames.add(createFile(pathToFile, fileName + (i+1) + ".txt"));
        }
        return fileNames;
    }

    private String createFile(String pathToFile,String fileName) {
        try {
            pathToFile = pathToFile+"/" + fileName;
            new FileWriter(pathToFile);
            System.out.println("file is created");
        } catch (IOException exc) {
            System.out.println("Can't create a file");
        }
        return pathToFile;
    }

    private String createFolder(String folderName,int nesting) {
        folderName += "/";
        String path = "";
        for (int i = nesting; i > 0; i--) {
            path += folderName;
            File folder = new File(path);
            if(folder.mkdir()) System.out.println("folder is created");
            else System.out.println("folder isn't created");
        }
        return path;
    }

    public void create(String folderName,String fileName, String fileCommon,String fileInfo) {
        String pathToInnerFolder = createFolder(folderName,numOfFolders);
        ArrayList<String> fileNames = createFiles(pathToInnerFolder,fileName);

        for (String pathToFile : fileNames) writeFile(pathToFile,RandomNumber.randomNumbers(10)," ");
        for (String pathToFile : fileNames) readFile(pathToFile);
        fileCommon += ".txt";
        fileInfo += ".txt";
        createFile(pathToInnerFolder,fileCommon);
        writeFile(pathToInnerFolder + "/" + fileCommon,dataFromOtherFiles,"\n");
        createFile(pathToInnerFolder,fileInfo);
        writeFile(pathToInnerFolder + "/" + fileInfo,listFilesSelectedFolder(pathToInnerFolder),"\n");
    }

    private ArrayList<String> listFilesSelectedFolder(String pathToFolder) {
        ArrayList<String> contentFolder = new ArrayList<>();
        String[] listContent = new File(pathToFolder).list();
        if(listContent == null) {
            System.out.println("check content the most inner folders");
            System.exit(2);
        }
        contentFolder.addAll(Arrays.asList(listContent));
        return contentFolder;
    }

    private <T> void writeFile(String pathToFile,ArrayList<T> numbers,String symbol) {
        try(FileWriter writer = new FileWriter(pathToFile)) {
            for (T number : numbers) {
                writer.write(number + symbol);
            }
        } catch (IOException exc) {
            System.out.println("ERROR write: " + exc);
        }
    }

    private void readFile(String pathToFile) {
        try(BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String number;
            while((number = reader.readLine())!=null) {
                dataFromOtherFiles.add(number);
            }
        } catch (IOException exc) {
            System.out.println("ERROR read: " + exc);
        }
    }
}
