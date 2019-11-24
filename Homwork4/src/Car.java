public class Car {
    String type;
    int year;
    int capasity;

    public Car(String type, int year, int capasity) {
        this.type = type;
        this.year = year;
        this.capasity = capasity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapasity() {
        return capasity;
    }

    public void setCapasity(int capasity) {
        this.capasity = capasity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", capasity=" + capasity +
                '}';
    }
}
