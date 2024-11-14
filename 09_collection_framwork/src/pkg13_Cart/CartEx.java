package pkg13_Cart;

public class CartEx {

  public static void main(String[] args) {

    Cart cart = new Cart();

    cart.addProduct(new Product("새우깡", 1000));
    cart.addProduct(new Product("감자깡", 2000));
    cart.addProduct(new Product("양파깡", 3000));
    cart.addProduct(new Product("고구마깡", 4000));
    cart.addProduct(new Product("옥수수깡", 5000));
    
    cart.removeProduct(0);
    cart.removeProduct(0);
    
    // System.out.println(Arrays.toString(cart.getProducts()));
    
    for(int i = 0; i < cart.getProducts().size(); i++) {
      System.out.println(cart.getProducts().get(i).getMane());
      System.out.println(cart.getProducts().get(i).getPrice());
    }

    
    
  }

}
