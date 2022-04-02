/*
* Вывести список файлов и каталогов выбранного каталога на диске.
* Файлы и каталоги должны быть распечатаны отдельно.
* c:\Users\Hello\Desktop\workspace\java\education\HomeWork\
*
* not done yet, need thinking
*/

package by.exercise46;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        //String pathToFolder = "c:/Users/Hello/Desktop/workspace/java/education/HomeWork";
        //UserOut.showFilesAndFolders(pathToFolder);

        File pathToFolder = new File("c:/Users/Hello/Desktop/workspace/java/education/HomeWork");
        File[] listFilesFolders = pathToFolder.listFiles();

        for (File f : listFilesFolders) {
            System.out.println(f.isFile() + " : " + f.getName());
        }

    }
}
