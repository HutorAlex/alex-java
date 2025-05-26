package lesson2.demo31.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments = new ArrayList<>();
}
