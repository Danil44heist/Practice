package homework2;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName(){
        return this.name;
    }

    double getPrice(){
        return this.price;
    }

    void setPrice(double newPrice){
        this.price = newPrice;
    }

    void applyDiscount(double discount){
        this.price = this.price - (this.price / 100 * discount);
    }

    void printInfo(){
        System.out.println("Товар: " + this.name + ", цена: " + this.price);
    }
}
