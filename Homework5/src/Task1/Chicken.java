package Task1;

public class Chicken extends NonFlyingBird {
    private String type;

    public Chicken(String feathers, int layEggs, String type) {
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

        return "Chicken {" +
                "type '" + type + '\'' + " have " +getFeathers()+", bears "
                + getLayEggs()+ " eggs," + " can fly = "+canFly()+ '}';
        }

    @Override
    public  boolean canFly() {
        return super.canFly();

    }


    public static void main(String[] args) {
        Chicken chicken = new Chicken("white feathers", 150,"Leghorn");
        Chicken chicken1 = new Chicken("ripple  feathers", 120,"Italian partridge ");
        Chicken chicken2 = new Chicken("grey feathers", 80,"Broiler");
        System.out.println(chicken.canFly());
    }
}

