public abstract class Penguin extends NonFlyingBird{
    public Penguin(String feather, int layEggs){
        super(feather, layEggs);
    }

    @Override
    public boolean fly(){
        return super.fly();
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feather='" + feather + '\'' +
                ", LayEggs=" + LayEggs +
                '}';
    }
}
