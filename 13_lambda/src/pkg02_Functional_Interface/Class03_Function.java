package pkg02_Functional_Interface;

import java.util.function.Function;

/*
 * package java.util.function;
 * 
 * @FunctionalInterface
 * public interface Function<T, R> {
 *   R apply(T t);                                            // <-- 인자값 있고, 리턴도 있음
 * }
 */

public class Class03_Function {

  public static void main(String[] args) {

    // Lambda Expression
    
    // Function<String, Integer> function = (String str) -> { return Integer.parseInt(str); }    
    Function<String, Integer> function = str -> Integer.parseInt(str);
    System.out.println(function.apply("10") + 10);
    
    // Function 타입의 매개변수로 Lambda Expression 전달하기
    a(name -> name + "님");
  }

  public static void a(Function<String, String> function) {
    System.out.println(function.apply("홍길동"));
  }
  
}
