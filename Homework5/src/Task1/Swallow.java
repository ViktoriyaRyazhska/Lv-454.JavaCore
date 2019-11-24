package Task1;

public class Swallow extends FlyingBird {

    private String type;

    public Swallow(String feathers, int layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Swallow {" +
                "type '" + type + '\''  + " have " +getFeathers()+", bears "
                + getLayEggs()+ " eggs," + " can fly = "+canFly()+ '}';
    }

    @Override
    public boolean canFly() {
        super.canFly();
        return true;
    }

    public static void main(String[] args) {
        Swallow swallow = new Swallow("blue and steel feathers",4,"Swallows");
        Swallow swallow1 = new Swallow("black and white feathers",5,"Martins");
        Swallow swallow2 = new Swallow("black and white feathers",6,"Saw-wings");
    }
}
