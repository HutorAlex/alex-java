package lesson2.demo3;

import java.util.ArrayList;
import java.util.List;

public class Post {
    private int userId;
    private int id;
    private String title;
    private String body;
    private List<Comment> comments = new ArrayList<>();

    public int getUserId() {
        return userId;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getBody() {
        return body;
    }
    public List<Comment> getComments() {
        return comments;
    }
}


