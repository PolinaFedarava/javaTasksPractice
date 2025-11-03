package Class6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListLesson {
    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
        task8();
    }

    public static void task1() {
        //1.1.Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
//1.2Добавить  пару записей (Привет, Как дела, Праздник, Суфле)
//1.3	Вывести все записи.
//1.4	Проверить, содержит ли коллекция слово Конфета
//1.5 Посчитать количество элементов в коллекции
        List<String> words = new ArrayList<>();
        words.add("Привет");
        words.add("Как дела");
        words.add("Праздник");
        words.add("Суфле");
        System.out.println("Список: ");
        for (String word : words) {
            System.out.println(word);
        }
        String searchWord = "Конфета";
        boolean contains = words.contains(searchWord);
        System.out.println("Проверить, содержит ли коллекция слово Конфета " + contains);
        int size = words.size();
        System.out.println("Посчитать количество элементов в коллекции " + size);
    }

    public static void task2() {
        //2. Условие: Создайте ArrayList<String> для хранения списка покупок.
// Добавь в него 5 товаров. Затем выведите весь список на экран,
// а после — удалите один товар по названию и снова выведите обновлённый список.
        ArrayList<String> shoppingList = new ArrayList<>();
        shoppingList.add("Хлеб");
        shoppingList.add("Молоко");
        shoppingList.add("Яйца");
        shoppingList.add("Сыр");
        shoppingList.add("Овощи");

        System.out.println("Список покупок: ");
        for (String item : shoppingList) {
            System.out.println(item);
        }
        shoppingList.remove("Сыр");
        System.out.println("Новый список покупок: ");
        printList(shoppingList);
    }

    public static void task3() {
//        3. Условие: Создай класс Book с полями:
//•	String title
//•	String author
//        3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
//        3.2 Переоперделите метод equals на книгах так,чтобы он всегда возвращал false
//        3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.
//        4. Условие: Создай ArrayList<Integer> и заполни его числами от 1 до 10. Затем создай новый список, в который добавь только чётные числа из первого списка. Выведи оба списка.
        Book book1 = new Book("Винни-Пух", "Эрнест Шепард");
        Book book2 = new Book("Белоснежка", "Братья Гримм");
        Book book3 = new Book("Красная Шапочка", "Шарля Перро");
        //List<Book> books = List.of(book1, book2, book3);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.remove(book1);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void printList(List<String> purchases) {
        for (String purch : purchases) {
            System.out.println(purch);
        }
    }

    public static void task8() {
        Set<Book> bookSet = new HashSet<>();

        bookSet.add(new Book("Книга1", "Автор1"));
        bookSet.add(new Book("Книга2", "Автор2"));
        bookSet.add(new Book("Книга3", "Автор3"));
        bookSet.add(new Book("Книга4", "Автор4"));
        bookSet.add(new Book("Книга2", "Автор2"));

        System.out.println("Содержимое множества:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
