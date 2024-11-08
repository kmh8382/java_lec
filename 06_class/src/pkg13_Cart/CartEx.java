package pkg13_Cart;

import java.util.Arrays;

public class CartEx {

  public static void main(String[] args) {

    Cart cart = new Cart(5);

    cart.addProduct(new Product("새우깡", 1000));
    cart.addProduct(new Product("감자깡", 2000));
    cart.addProduct(new Product("양파깡", 3000));
    cart.addProduct(new Product("고구마깡", 4000));
    cart.addProduct(new Product("옥수수깡", 5000));
    
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    // System.out.println(Arrays.toString(cart.getProducts()));
    
    for(int i = 0; i < cart.getIdx(); i++) {
      System.out.println(cart.getProducts()[i].getMane());
      System.out.println(cart.getProducts()[i].getPrice());
    }

  }

}
