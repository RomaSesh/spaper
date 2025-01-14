public class Newspaper {
    // Поля класса
    private String title;
    private int circulation;
    private int numberOfPages;

    // Метод инициализации всех полей
    public void init(String title, int circulation, int numberOfPages) {
        this.title = title;
        this.circulation = circulation;
        this.numberOfPages = numberOfPages;
    }

    // Метод для получения полной информации о газете
    public String info() {
        return "Газета: " + title + ", Тираж: " + circulation + ", Количество полос: " + numberOfPages;
    }

    // Метод для изменения названия газеты
    public void changeName(String newName) {
        this.title = newName;
    }

    // Метод для изменения количества полос
    public void changeNumber(int newNumber) {
        this.numberOfPages = newNumber;
    }
}
