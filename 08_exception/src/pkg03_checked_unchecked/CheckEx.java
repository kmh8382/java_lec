package pkg03_checked_unchecked;

import java.net.URI;
import java.net.URISyntaxException;

public class CheckEx {

  // 예외 핸들링(예외 처리 or 회피)이 없어도 실행 가능한 예외
  // Unchecked Exception (RuntimeException 클래스와 그 하위 클래스)  
  public static void a() {
    
    // NumbreFormatException
    Integer.parseInt("");
    
    // ArithmeticException
    int mod = 10 / 0;
    System.out.println(mod);
    
  }
  
  // 예외 핸들링(예외 처리 or 회피)이 없어도 실행이 불가능한 예외
  // Checked Exception (RuntimeException 클래스를 제외한 모든 예외 클래스)
  public static void b() {
  
    // new URI("https://www.google.com/");
    
    try {
      new URI("https://www.google.com/");
    } catch (URISyntaxException e) { 
      e.printStackTrace();
    }
    
    
  }
  
  public static void main(String[] args) {
  
    a();
    b();
    
  }
}
