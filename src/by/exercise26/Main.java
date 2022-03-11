/*
* Введите с клавиатуры строку. Найдите в строке не только запятые, но и другие знаки препинания. Посчитать
* общее их колличество.
* Знаки препинания: '.' '?' '!' "..." ':' ';' ',' '-' "--" '(' ')' - может еще есть - я не знаю!!!
* ... : ? -- Тестовоя , . ... ? . строка ! с : ... : несколькими ; , ( знаками ) - препинания . 19 знаков
 */

package by.exercise26;

import by.common.exercise26.InputOutputData;
import by.common.exercise26.Marks;

public class Main {
    public static void main(String[] args) {
        InputOutputData data = new InputOutputData();
        String input = data.getStringLine();
        String[] marks = data.getMarks();
        Marks count = new Marks();
        data.outData(count,input,marks);
    }
}
