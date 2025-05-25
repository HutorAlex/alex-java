package lesson2.demo2;


public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();

        Cars cars = new Cars("Червоний", "BMW M3", engine, transmission);
        cars.start();
    }
}
