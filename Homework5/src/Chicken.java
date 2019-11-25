public abstract class Chicken extends NonFlyingBird{
    public Chicken(String feather, int layEggs){
        super(feather, layEggs);
    }

    @Override
    public boolean fly(){
        return super.fly();
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "feather='" + feather + '\'' +
                ", LayEggs=" + LayEggs +
                '}';
    }

}
