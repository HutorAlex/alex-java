package LessonNew.New;

public class Car {
    private int id;
    private String model;
    private String color;

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }
    public int getId() { return id; }
    public String getModel() { return model; }
    public String getColor() { return color; }

    public void setId(int id) {this.id = id; }
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }

    public void print() {
        System.out.println("Рік : " + id + ",Модель : " + model + ",Колір : " + color);
    }
}

