package homework.lesson9.task3;

import java.util.Objects;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Рисую круг с координатами " + getX() + ", " + getY() +
                " с радиусом " + getRadius() + " цветом " + getColor());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x &&
                y == circle.y &&
                radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle("Green", 3, 4, 6);
        Circle circle2 = new Circle("Red", 6, 9, 56);
        Shape[] shapes = {circle1, circle2};
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println(shape);
        }
        System.out.println(circle2.equals(circle1));
    }
}
