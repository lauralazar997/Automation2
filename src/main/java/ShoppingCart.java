import java.util.ArrayList;

public class ShoppingCart {
    double totalPrice;


    public ShoppingCart(double totalPrice){
        this.totalPrice = totalPrice;
    }

    public void addProduct(double price){
        this.totalPrice = this.totalPrice + price;
        System.out.println("Pretul total dupa ce produsul a fost adaugat este: " + this.totalPrice);
    }

    public void removeProduct(double price){
        this.totalPrice = this.totalPrice - price;
        System.out.println("Pretul total dupa ce produsul a fost scos este: " + this.totalPrice);
    }

    public void getTotal() {
        if (this.totalPrice >= 0) {
            System.out.println("Totalul este: " + this.totalPrice);
        } else {
            System.out.println("Totalul are o valoare negativa");
        }
    }


    //nu face ce trebuie main-ul dar nu imi dau seama daca trebuia sa folosesc o lista aici de fapt
    public static void main(){
        ShoppingCart product1 = new ShoppingCart(100);
        ShoppingCart product2 = new ShoppingCart(100);
        ShoppingCart product3 = new ShoppingCart(100);
        product1.addProduct(20.5);
        product2.addProduct(10.2);
        product3.addProduct(5);
        product1.removeProduct(20.5);
        System.out.println(product1.totalPrice);

    }
}
