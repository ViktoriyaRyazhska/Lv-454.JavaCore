package Task1;
public class Penguin extends NonFlyingBird {
    private String type;

    public Penguin(String feathers, int layEggs, String type) {
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
        return "Penguin {" +
                "type '" + type + '\'' +  " have " +getFeathers()+", bears "
                + getLayEggs()+ " eggs," + " can fly = "+canFly()+ '}';
    }

    @Override
    public boolean canFly() {
        return super.canFly();
    }

    public static void main(String[] args) {
        Penguin penguin = new Penguin("bLack and white feathers",2,"Galapagos penguin");
        Penguin penguin1 = new Penguin("slate-blue and white feathers",3,"Little blue penguin");
        Penguin penguin2 = new Penguin("black and white feathers",4,"Emperor penguin ");
    }
}
