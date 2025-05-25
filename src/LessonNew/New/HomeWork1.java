package LessonNew.New;

import java.util.ArrayList;
import java.util.List;

public class HomeWork1 {
    public static void main(String[] args) {
        User [] user = {
                new User(1, "Alex"),
                new User(2, "Marta"),
                new User(3, "Ira"),
                new User(4, "Vlad"),
                new User(5, "Olga")
        };
        for (User u : user) {
            u.printInfo();
        }

        List<Comment> comments = new ArrayList<>();

        comments.add(new Comment(1, 101, "Alex", "alex@example.com", "Це перший коментар"));
        comments.add(new Comment(1, 102, "Marta", "marta@example.com", "Друге повідомлення"));
        comments.add(new Comment(2, 103, "Ivan", "ivan@example.com", "Третій текст"));
        comments.add(new Comment(2, 104, "Olga", "olga@example.com", "Ще один коментар"));
        comments.add(new Comment(3, 105, "Nazar", "nazar@example.com", "Пʼятий коментар"));

        for (Comment c : comments) {
            c.print();
        }

        List<Book> books = new ArrayList<>();

        books.add(new Book("Гаррі Поттер", "Дж. Роулінг", 1997));
        books.add(new Book("451° за Фаренгейтом", "Рей Бредбері", 1953));
        books.add(new Book("Місто", "Валер’ян Підмогильний", 1927));

        for (Book b : books) {
            b.print();
        }

        List<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog(3, "Барсик", "Хаскі"));
        dogs.add(new Dog(5, "Шарік", "Лабрадор"));
        dogs.add(new Dog(2, "Джек", "Такса"));

        for (Dog d : dogs) {
            d.print();
        }

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2022, "Tesla Model S", "Червоний"));
        cars.add(new Car(2021, "BMW X5", "Чорний"));
        cars.add(new Car(2020, "Mazda 6", "Синій"));

        for (Car c : cars) {
            c.print();
        }

    }
}

