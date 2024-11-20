package pkg02_Functional_Interface;

import java.util.function.Predicate;

/*
 * package java.util.function;
 * 
 * @FunctionalInterface
 * public interface Predicate<T> {
 *   boolean test(T t);                                       // <-- 인자값 있고, 리턴은 boolean
 * }
 */

public class Class04_Predicate {

  public static void main(String[] args) {
    
    // Lambda Expression
    
    Predicate<Integer> predicate = number -> number %2 == 0;
    System.out.println(predicate.test(11) ? "짝" : "홀");

    // Predicate 타입의 매개변수로 Lambda Expression 전달하기
    a(number -> number >= 0, 5);
    
  }

  public static void a(Predicate<Integer> predicate, int number) {
    System.out.println(predicate.test(number) ? "양" : "음");
  }
}
