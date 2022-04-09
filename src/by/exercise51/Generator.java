package by.exercise51;

import java.util.Random;

public class Generator {

    private final String[] names = {
            "Артур","Олег","Павел","Кирилл",
            "Артём","Макар","Вячеслав","Гордей",
            "Михаил","Денис"
    };
    private final String[] surnames = {
            "Смирнов","Иванов","Кузнецов","Соколов",
            "Попов","Лебедев","Козлов","Новиков",
            "Морозов","Соловьёв"
    };

    private int generateNum() {
        return (int)(new Random().nextDouble()*names.length);
    }

    public String generateName() {
        return names[generateNum()];
    }

    public String generateSurname() {
        return surnames[generateNum()];
    }

    public int generateAge() {
        return (int)(new Random().nextDouble()*80+1);
    }
}
