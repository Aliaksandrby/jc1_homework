 /*
 * Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещается ли эти
 * дома на данном участоке. Стороны домов - параллельны сторонам участка, в остальном размещение может быть любым.
 */

package by.exercise10;

 import by.common.OutData;
 import by.common.exercise10.AreaData;
 import by.common.exercise10.CalcSquare;

 public class Main {
    public static void main(String[] args) {
        AreaData arguments = new AreaData(99.0,20.0,30.0,40.0,100.0,300.0);
        boolean check = new CalcSquare().checkSquare(arguments);
        new OutData().outCheckSquare(check);
    }
}
