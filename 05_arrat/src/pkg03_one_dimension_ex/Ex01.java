package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex01 {

  public static void main(String[] args) {
    
    // 구구단 3단의 결과 (3, 6, 9, ... 27) -> 배열에 저장하기
    int[] ary = new int[9];
    
    for(int i = 1; i <= ary.length; i++) {
      ary[i-1] = 3 * i;
      System.out.println("3 * " + i + " = " + ary[i-1]);      
    }
    System.out.println(Arrays.toString(ary));

  }

}
