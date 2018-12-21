package homework.lesson10;

import java.util.Objects;

public class Trumpet implements Instrument {
    private int diam;

    public Trumpet(int diam) {
        this.diam = diam;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trumpet trumpet = (Trumpet) o;
        return diam == trumpet.diam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diam);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diam=" + diam +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром: " + getDiam() + " см");
    }
}
