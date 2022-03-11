  /*
* Введите с клавиатуры текст. Подсчитать количество слов в тексте.
* Учесть, что слова могут разделяться несколькими пробелами, в начале
* и конце текста также могут быть пробелы, но могут и отсутствовать.

* Истина в том, что нет хороших или плохих людей.
* Добро и зло не в людях, а в их поступках.
* Люди остаются просто людьми, а с добром или злом их связывает то, что они делают – или отказываются делать.
*
* Больше всего мне хочется стать таким человеком, который сумел бы сделать мир немного лучше.
*
* Больше-всего-- мне :хочется;    стать. (таким человеком,     ) !который? сумел бы сделать мир а немного лучше... 16 @ // 16
*/

package by.exercise27;

import by.common.exercise27.ReadConsole;
import by.common.exercise27.TransformText;

  public class Main {
    public static void main(String[] args) {
        String textToString = new ReadConsole().textToString("@"); // str the end of our text;
        String[] arrayWord = new TransformText().textToWordArray(textToString);
        System.out.println("количество слов в тексте = " + arrayWord.length);
    }
}