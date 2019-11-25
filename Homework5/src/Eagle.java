public abstract class Eagle extends FlyingBird{
    public Eagle(String feather, int layEggs){
        super(feather, layEggs);
    }

    @Override
    public boolean fly(){
        super.fly();
        return true;
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feather='" + feather + '\'' +
                ", LayEggs=" + LayEggs +
                '}';
    }
}
