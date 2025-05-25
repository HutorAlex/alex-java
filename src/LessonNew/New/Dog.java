package LessonNew.New;

public class Dog {
    private int age;
    private String name;
    private String breed;

    public Dog(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    public int getAge() { return age; }
    public String getName() { return name; }
    public String getBreed() { return breed; }

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }

    public void print() {
        System.out.println("Вік : " + age + ",Кличка :" + name + ",Порода :" + breed);
    }
}
