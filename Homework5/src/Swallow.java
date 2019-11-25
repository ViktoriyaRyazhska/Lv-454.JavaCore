public abstract class Swallow extends FlyingBird{
    public Swallow(String feather, int layEggs){
        super(feather, layEggs);
    }

    @Override
    public boolean fly(){
        super.fly();
        return true;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feather='" + feather + '\'' +
                ", LayEggs=" + LayEggs +
                '}';
    }
}
