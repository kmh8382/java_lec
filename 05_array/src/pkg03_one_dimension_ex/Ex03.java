package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex03 {

  public static void main(String[] args) {
    
    // 배열 요소 수정하기 (배열 ary 의 마지막 3개 요소를 배열 numbers 값으로 수정하기)
    int[] ary = {10, 20, 30, 0, 0, 0};
    int[] numbers = {40, 50, 60};
    
//    for(int i = 3; i < ary.length; i++) {
//      ary[i] = numbers[i-3];
//    }
//    System.out.println(Arrays.toString(ary));

    // 배열 복사
    System.arraycopy(numbers, 0, ary, 3, numbers.length);
    System.out.println(Arrays.toString(ary));
  }

}
