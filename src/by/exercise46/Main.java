/*
* Вывести список файлов и каталогов выбранного каталога на диске.
* Файлы и каталоги должны быть распечатаны отдельно.
*
* c:\Users\Hello\Desktop\workspace\java\education\HomeWork\
* c:/Users/Hello/Desktop/workspace/java/education/HomeWork
*/

package by.exercise46;

public class Main {
    public static void main(String[] args) {
        Console.invitation();
        String path = Console.inputPath();
        FoldersFiles foldersFiles = new FoldersFiles(path);
        foldersFiles.separate();
        Console.show(foldersFiles.getFiles());
        Console.show(foldersFiles.getFolders());
    }
}
