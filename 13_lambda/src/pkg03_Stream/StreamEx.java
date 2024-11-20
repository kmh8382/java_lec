package pkg03_Stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * package java.util.stream
 * 
 * public interface Stream<T> {
 *   Stream<T> filter(Predicate<T> predicate);  // Predicate 결과가 true 인 데이터만 Stream 으로 반환한다.
 *   Stream<R> map(Function<T, R> mapper);      // Function 의 반환 결과를 Stream 으로 반환한다.
 *   void forEach(Consumer<T> action);          // forEach 메소드를 호출한 Stream 의 모든 요소를 Consumer 로 하나씩 전달한다.
 * }
 */

public class StreamEx {

  public static void a() throws Exception {
    
    // Stream 인스턴스 생성
    Stream<String> s1 = Stream.of("캥거루", "코알라", "이구아나", "펭권");
    
    String[] array = {"사과", "바나나", "복숭아", "망고"};
    Stream<String> s2 = Arrays.stream(array);
    
    List<String> list = Arrays.asList("한국", "일본", "중국", "베트남");
    Stream<String> s3 = list.stream();
    
    
    // forEach 메소드 활용
//    s1.forEach(animal -> {
//      System.out.println(animal);
//    });
//-=  s1 에 저장되어 있는 "캥거루", "코알라", "이구아나", "펭권" 을 animal 인자에 넣어서 System.out.println(animal) 실행
    s1.forEach(animal -> System.out.println(animal));      
    s2.forEach(fruit -> System.out.println(fruit));
    s3.forEach(nation -> System.out.println(nation));
    

    // LICENSE 파일 내용 읽어서 출력하기
    File license = new File("C:\\Program Files\\Java\\jdk-17", "LICENSE");
    BufferedReader in = new BufferedReader(new FileReader(license));
    Stream<String> s4 =  in.lines();
    
    StringBuilder builder = new StringBuilder();
    s4.forEach(line -> builder.append(line).append("\n"));
    System.out.println(builder.toString());
    in.close();
    
    
    // 연습문제 javaHome폴더의 파일 이름 출력하기
    System.out.println("----------");
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");   
    File[] files = javaHome.listFiles(); 
    Stream<File> stream = Arrays.stream(files);
    stream.forEach(file -> System.out.println(file.getName()));

  }  
    
  public static void b() throws Exception {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Stream 인스턴스를 따로 선언 안함. 이 동작만 하고나면 사라짐.
    numbers.stream()
      .filter(number -> number % 3 == 0)                // 3, 6, 9 만 저장된 Stream
      .forEach(number -> System.out.println(number));   // 3, 6, 9 만 저장된 Stream 을 출력
   
    
    // Fruit.java 를 이용하여 Stream 활용
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000),
        new Fruit("포도", 2000),
        new Fruit("사과", 3000)
    );
    fruits.stream()
      .filter(fruit -> fruit.getPrece() >= 2000)
      .forEach(fruit -> System.out.println(fruit));

    
    // 연습문제 javaHome폴더의 디렉터리 이름 출력하기
    System.out.println("----------");
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");   
    Arrays.stream(javaHome.listFiles())
      .filter(file -> file.isDirectory())
      .forEach(file -> System.out.println(file.getName()));       
    
  }
  
  public static void c() throws Exception {
    
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    numbers.stream()
      .map(number -> number * number)
      .forEach(number -> System.out.println(number));
    
    List<Fruit> fruits = Arrays.asList(
        new Fruit("단감", 1000),
        new Fruit("포도", 2000),
        new Fruit("사과", 3000)
    );
    
    // 포도는 1000원 인상 (변수에 저장은 안됨 출력만 하고 끝임)
    fruits.stream()
      .filter(fruit -> fruit.getName().equals("포도"))
      .map(fruit -> new Fruit(fruit.getName(), fruit.getPrece() + 1000))
      .forEach(fruit -> System.out.println(fruit));
    
    
    // 연습문제 javaHome폴더의 파일 이름 뒤에 "폴더", "파일" 추가하여 출력하기
    System.out.println("----------");
    File javaHome = new File("C:\\Program Files\\Java\\jdk-17");   
    Arrays.stream(javaHome.listFiles())
      .map(item -> item.isDirectory() ? item.getName() + "  폴더" : item.getName() + "  파일")
      .forEach(item -> System.out.println(item));       
    
  }
  
  public static void d() throws Exception {
  
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    // Mutable List (수정 가능)
    List<Integer> evenNumbers = numbers.stream()
                                 .filter(number -> number % 2 == 0)
                                 .collect(Collectors.toList());
    evenNumbers.add(12);

    // Immutable List (수정 불가능)
    List<Integer> oddNumbers = numbers.stream()
                                .filter(number -> number % 2 == 1)
                                .toList();
    // oddNumbers.add(11);      // 불가능
    
    evenNumbers.stream().forEach(number -> System.out.println(number));
    oddNumbers.stream().forEach(number -> System.out.println(number));
  }
  
  public static void main(String[] args) throws Exception {
    
    // a();
    // b();
    // c();
    d();
   
  }

}
