package pkg04_throws;

public class ThrowsEx {

  public static void main(String[] args) {
    
    String a = "10";
    String b = "0";
    
    // 예외 처리 된 Calculator 클래스    
    Calculator calc = new Calculator();
    System.out.println(calc.add(a, b));
    System.out.println(calc.subract(a, b));
    System.out.println(calc.muliply(a, b));
    System.out.println(calc.quotient(a, b));
    System.out.println(calc.modular(a, b));
    System.out.println("----------");

    
    // 예외 회피 된 Computer 클래스
    try {
      Computer com = new Computer();
      System.out.println(com.add(a, b));
      System.out.println(com.subract(a, b));
      System.out.println(com.muliply(a, b));
      System.out.println(com.quotient(a, b));
      System.out.println(com.modular(a, b));      
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
