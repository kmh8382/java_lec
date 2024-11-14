package pkg13_Cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  
  private List<Product> products;
  
  public Cart() {
    products = new ArrayList<Product>();
  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public void addProduct(Product product) {
    
    if(product == null) {
      System.out.println("cart 에 담을 product 이 없습니다.");
      return;
    }
    
    products.add(product);
    
  }
  
  public Product removeProduct(int removeIdx) {
    int size = products.size();   
    
    if(size == 0) {
      System.out.println("cart 가 비어 있습니다.");
      return null;
    }

    if(size < 0 || size <= removeIdx) {
      System.out.println("존재하지 않는 인덱스입니다.");
      return null;
    }
           
    return products.remove(removeIdx);
  }
}
