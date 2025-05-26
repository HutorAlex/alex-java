package lesson2.demo31.app;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lesson2.demo31.model.*;

import java.net.URL;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        // Приклад користувача
        User user = new User(
                1,
                "Vasya",
                "Pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)
                ),
                new Car("Toyota", 2021, 250)
        );

        // Завантаження постів і коментарів
        ObjectMapper mapper = new ObjectMapper();

        List<Post> posts = mapper.readValue(
                new URL("https://jsonplaceholder.typicode.com/posts"),
                new TypeReference<List<Post>>() {}
        );

        List<Comment> comments = mapper.readValue(
                new URL("https://jsonplaceholder.typicode.com/comments"),
                new TypeReference<List<Comment>>() {}
        );

        // Створення мапи постів
        Map<Integer, Post> postMap = new HashMap<>();
        for (Post post : posts) {
            postMap.put(post.getId(), post);
        }

        // Додавання коментарів
        for (Comment comment : comments) {
            Post post = postMap.get(comment.getPostId());
            if (post != null) {
                post.getComments().add(comment);
            }
        }

        // Виведення результату
        for (Post post : posts) {
            System.out.println("Post ID: " + post.getId());
            System.out.println("Title: " + post.getTitle());
            System.out.println("Comments:");
            for (Comment comment : post.getComments()) {
                System.out.println(" - " + comment.getName() + " (" + comment.getEmail() + "): " + comment.getBody());
            }
            System.out.println();
        }
    }
}
