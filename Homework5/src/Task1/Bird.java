package Task1;

public abstract class Bird {
    private String feathers;
    private int layEggs;

    public Bird(String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public abstract boolean canFly();

    public static void main(String[] args) {
    Bird [] listOfBirds = new Bird[12];
        listOfBirds[0] = new Chicken("white feathers", 150,"Leghorn");
        listOfBirds[1] = new Chicken("ripple  feathers", 120,"Italian partridge ");
        listOfBirds[2] = new Chicken("grey feathers", 80,"Broiler");
        listOfBirds[3] = new Penguin("bLack and white",2,"Galapagos penguin");
        listOfBirds[4] = new Penguin("slate-blue and white",3,"Little blue penguin");
        listOfBirds[5] = new Penguin("black and white",4,"Emperor penguin ");
        listOfBirds[6] = new Eagle("dark brown feathers", 2,"Vulture");
        listOfBirds[7] = new Eagle("brownish black feathers", 2,"Sea eagle");
        listOfBirds[8] = new Eagle("light ochrous feathers", 2,"Common buzzard");
        listOfBirds[9] = new Swallow("blue and steel feathers",4,"Swallows");
        listOfBirds[10] = new Swallow("black and white feathers",5,"Martins");
        listOfBirds[11] = new Swallow("black and white feathers",6,"Saw-wings");
        for (int i = 0; i < listOfBirds.length; i++) {
            listOfBirds[i].canFly();
        }
        for (int i = 0; i <listOfBirds.length ; i++) {
            System.out.println(listOfBirds[i]);
        }
    }
}