/*
* Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
* Иерархия должна иметь хотя бы три уровня
*
* Какие поля должны быть показаны? pinCod? codCvc2?
*/

package by.exercise33;

import by.exercise33.card.*;

public class Main {
    public static void main(String[] args) {
        String[] cardHolder = {"John","Doe"};
        PlasticCard plasticCard = new PlasticCard("BELARUSBANK", "VISA",
                "0000111122223333", "123", "1234", "Classic",
                cardHolder,4,true);
        System.out.println(plasticCard);
    }
}


