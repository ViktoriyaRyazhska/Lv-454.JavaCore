package Task1;

public class FlyingBird extends Bird {

    public FlyingBird(String feathers, int layEggs) {
        super(feathers, layEggs);
    }


    @Override
    public boolean canFly() {
        return true;
    }
}
