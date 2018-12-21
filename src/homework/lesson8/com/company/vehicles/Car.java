package homework.lesson8.com.company.vehicles;

import homework.lesson8.com.company.details.Engine;
import homework.lesson8.com.company.professions.Driver;

import java.util.Objects;

public class Car {
    private String carModel, carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car(String carModel, String carClass, double weight, Driver driver, Engine engine) {
        this.carModel = carModel;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.weight, weight) == 0 &&
                Objects.equals(carModel, car.carModel) &&
                Objects.equals(carClass, car.carClass) &&
                Objects.equals(driver, car.driver) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carModel, carClass, weight, driver, engine);
    }

    public void printInfo() {
        System.out.println("Information about Car{" +
                "carModel='" + carModel + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}');
    }

    public void start() {
        System.out.println("Поехали ");
    }

    public void stop() {
        System.out.println("Останавливаемся ");
    }

    public void turnRight() {
        System.out.println("Поворот направо ");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

}
