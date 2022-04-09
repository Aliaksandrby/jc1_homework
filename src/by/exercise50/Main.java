/*
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

package by.exercise50;

public class Main {
    public static void main(String[] args) {
        FileFolder fileFolder = new FileFolder(3,5);
        fileFolder.create("folder","file","fileCommon","fileInfo");
    }
}
