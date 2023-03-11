public class Product {
    private String name;
    private int price;
    public Product(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }
    public String display(){
        return getName()+"($"+getPrice()+")";
    }
    public String display1(){
        return getName()+": $"+getPrice();
    }


    public void setPrice(int price) {
        this.price = price;
    }
}
