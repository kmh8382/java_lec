package pkg03_constructor;

import java.util.Arrays;

public class Constructor {

  public static void main(String[] args) {
 
    Develper develper1 = new Develper(new String[] {"자바", "파이썬"});
    develper1.setName("홍길동");
    System.out.println(develper1.getName());
    System.out.println(Arrays.toString(develper1.getSkills()));
    
    Develper develper2 = new Develper("고길동", new String[] {"노드", "자바스크립트"});
    System.out.println(develper2.getName());
    System.out.println(Arrays.toString(develper2.getSkills()));
  }
 
}
