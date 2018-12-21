package homework.lesson8.com.company.professions;

public class Driver extends Person {
    private int expDriving;

    public Driver(int expDriving) {
        this.expDriving = expDriving;
    }

    public Driver(String fullName, int age, int expDriving) {
        super(fullName, age);
        this.expDriving = expDriving;
    }

    public int getExpDriving() {
        return expDriving;
    }

    public void setExpDriving(int expDriving) {
        this.expDriving = expDriving;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "expDriving=" + expDriving +
                "} " + super.toString();
    }
}
