public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product copybook1 = new Product("Shkoljaryk",50,2.80);
        Product copybook2 = new Product("Tetrada",100,2.20);
        Product diary = new Product("1 Veresnja", 30,19.50);
        Product [] items = {copybook1, copybook2,diary};
        Product maxPriceProduct = items[0];
        Product maxQuantityProduct = items[0];
        for(int i = 1; i< items.length; i++){
            if (items[i].getPrice() > maxPriceProduct.getPrice()){
                maxPriceProduct = items[i];
            }
            if (items[i].getQuantity() > maxQuantityProduct.getQuantity()){
                maxQuantityProduct = items[i];
            }
        }
        System.out.println("Most expensive item: " + maxPriceProduct.getName() + ", quantity: "
                + maxPriceProduct.getQuantity());
        System.out.println("Product with biggest quantity: " + maxQuantityProduct.getName());
    }
}
