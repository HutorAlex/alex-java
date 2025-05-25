package LessonNew.New;

public class Comment {
    private int PostId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.PostId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
    //getters//
    public int getPostId() {return PostId;}
    public int getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getBody() {return body;}

    //setters//
    public void setPostId(int postId) {this.PostId = postId;}
    public void setId(int id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setEmail(String email) {this.email = email;}
    public void setBody(String body) {this.body = body;}

    public void print() {
        System.out.println("Post ID: " + PostId);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Body: " + body);
        System.out.println("_____________________________");
    }
}
