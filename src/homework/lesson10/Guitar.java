package homework.lesson10;

import java.util.Objects;

public class Guitar implements Instrument {
    private int chord;

    public Guitar(int chord) {
        this.chord = chord;
    }

    public int getChord() {
        return chord;
    }

    public void setChord(int chord) {
        this.chord = chord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return chord == guitar.chord;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chord);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "chord=" + chord +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн: " + getChord());
    }
}
