package pkg13_Cart;

public class Product {

  private String mane;
  private int price;
  
  public Product() {
    
  }
  
  public Product(String mane, int price) {
    super();
    this.mane = mane;
    this.price = price;
  }

  public String getMane() {
    return mane;
  }

  public void setMane(String mane) {
    this.mane = mane;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
  
  
}
