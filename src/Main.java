import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создание коллекции экземпляров "Newspaper"
        List<Newspaper> newspapers = new ArrayList<>();

        // Создание объектов класса "Newspaper" и инициализация полей
        Newspaper newspaper1 = new Newspaper();
        newspaper1.init("Вечерняя Москва", 100000, 12);

        Newspaper newspaper2 = new Newspaper();
        newspaper2.init("Комсомольская Правда", 150000, 16);

        Newspaper newspaper3 = new Newspaper();
        newspaper3.init("Российская Газета", 200000, 20);

        // Добавление газет в коллекцию
        newspapers.add(newspaper1);
        newspapers.add(newspaper2);
        newspapers.add(newspaper3);

        // Получение полной информации обо всех объектах
        for (Newspaper newspaper : newspapers) {
            System.out.println(newspaper.info());
        }

        // Изменение названия и количества полос одного объекта
        newspaper1.changeName("Московский Комсомолец");
        newspaper1.changeNumber(14);

        // Получение полной информации об измененном объекте
        System.out.println("\nИнформация об измененной газете:");
        System.out.println(newspaper1.info());
    }
}