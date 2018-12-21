package homework.lesson9.task5;

import java.util.Objects;

public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void areaOfCircle() {
        System.out.println("Площадь круга с радиусом: " + getRadius() + " равна: " + getRadius() * getRadius() * PI);
    }

    public void circleLength() {
        System.out.println("Длина окружности с радиусом: " + getRadius() + " равна: " + 2 * getRadius() * PI);
    }
}
