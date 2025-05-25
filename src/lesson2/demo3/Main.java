package lesson2.demo3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URL;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Post> posts = mapper.readValue(
                    new URL("https://jsonplaceholder.typicode.com/posts"),
                    new TypeReference<List<Post>>() {});


            List<Comment> comments = mapper.readValue(
                    new URL("https://jsonplaceholder.typicode.com/comments"),
                    new TypeReference<List<Comment>>() {});

            // Створення мапи для швидкого доступу до постів за ID
            Map<Integer, Post> postMap = new HashMap<>();
            for (Post post : posts) {
                postMap.put(post.getId(), post);
            }

            // Додавання коментарів до відповідних постів
            for (Comment comment : comments) {
                Post post = postMap.get(comment.getPostId());
                if (post != null) {
                    post.getComments().add(comment);
                }
            }

            // Виведення результату
            for (Post post : posts) {
                System.out.println("Пост ID: " + post.getId());
                System.out.println("Заголовок: " + post.getTitle());
                System.out.println("Коментарі:");
                for (Comment comment : post.getComments()) {
                    System.out.println("- " + comment.getBody());
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();


        }
    }
}
