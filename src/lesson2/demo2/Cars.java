package lesson2.demo2;


public class Cars {
    private Engine engine;
    private Transmission transmission;
    private Dashboard dashboard = new Dashboard();
    private Wheels wheels = new Wheels();

    private String color;
    private String model;

    public Cars(String color, String model, Engine engine, Transmission transmission) {
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
    }

    public void start() {
        engine.startEngine();
        System.out.println("🚗 Автомобіль " + model + " поїхав!");
        dashboard.displaySpeed();
        wheels.rotate();
    }

}
