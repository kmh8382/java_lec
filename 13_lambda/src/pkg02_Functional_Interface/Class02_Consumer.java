package pkg02_Functional_Interface;

import java.util.function.Consumer;

/*
 * package java.util.function;
 * 
 * @FunctionalInterface
 * public interface Consumer<T> {
 *   void accept(T t);                                        // <-- 인자값만 받음, 리턴 없음
 * }
 */

public class Class02_Consumer {

  public static void main(String[] args) {
    
    // Lambda Expression
    
    // Consumer<String> consumer = (String t) -> System.out.println(t);
    Consumer<String> consumer = t -> System.out.println(t);
    consumer.accept("hello world");
    
    // Consumer 타입의 매개변수로 Lambda Expression 전달하기
    a(number -> System.out.println(number));                  // <-- 10 을 출력한다

  }

  public static void a(Consumer<Integer> consumer) {
    consumer.accept(10);                                      // <-- 10 이 인자값 
  }
}
