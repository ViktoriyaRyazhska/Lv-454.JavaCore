package Task1;

public class Eagle extends FlyingBird {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Eagle(String feathers, int layEggs, String type) {
        super(feathers, layEggs);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Eagle {" +
                "type '" + type + '\''  + " have " +getFeathers()+", bears "
                + getLayEggs()+ " eggs," + " can fly = "+canFly()+ '}';
    }

    @Override
    public boolean canFly() {
        super.canFly();
        return true;
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle("dark brown feathers", 2,"Vulture");
        Eagle eagle1 = new Eagle("brownish black feathers", 2,"Sea eagle");
        Eagle eagle2 = new Eagle("light ochrous feathers", 2,"Common buzzard");
    }
}
