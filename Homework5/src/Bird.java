public abstract class Bird {
    String feather;
    int  LayEggs;

    public Bird(String feather, int layEggs) {
        this.feather = feather;
        LayEggs = layEggs;
    }

    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public int getLayEggs() {
        return LayEggs;
    }

    public void setLayEggs(int layEggs) {
        LayEggs = layEggs;
    }

    public abstract boolean fly();

}
