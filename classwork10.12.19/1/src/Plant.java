public class Plant {
    private int size;
    private Color color;
    private Type type;
    public Plant(String type,String color,int size)throws ColorException,TypeException{
        Color c=colorStrtoenum(color);
        Type t=typeStrToEnum(type);
        this.size=size;
        this.type=t;
        this.color=c;
    }
    private Color colorStrtoenum(String color)throws ColorException{
        switch (color.toLowerCase()){
            case "white":return Color.White;
            case "black":return Color.Black;
            case "yellow":return Color.Yellow;
            case "red":return Color.RED;
            case"blue":return Color.Blue;
            default: throw new ColorException("Input only color white, black, Yellow, Red or Blue");
        }
    }
    private Type typeStrToEnum(String type)throws TypeException{
        switch (type.toLowerCase()){
            case "rose":return Type.Rose;
            case"tulip":return Type.Tulip;
            case "chrysanthemum":return Type.Chrysanthemum;
            case"dahlia":return Type.Dahlia;
            case"lily":return Type.Lily;
            default: throw new TypeException("Input only type rose,tulip,Chrysanthemum,Dahlia or Lily");
        }
    }
    @Override
    public String toString() {
        return "Color: "+color+", type: "+type+", size: "+size;
    }
}
