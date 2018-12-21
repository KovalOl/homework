package homework.lesson10;

public class Main {
    public static void main(String[] args) {
        Instrument[] instrument = {new Guitar(6), new Drum(40), new Trumpet(10)};
        for (Instrument instrument1 : instrument) {
            instrument1.play();
        }
    }
}
