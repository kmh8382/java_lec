package pkg03_one_dimension_ex;

import java.util.Arrays;

public class Ex04 {

  public static void main(String[] args) {
    
    // 10진수를 2진수로 변환한 결과를 배열에 저장하기
    
    // 10진수
    int number = 35;            // 2 | 35
                                //   └----
                                // 2 | 17  ... 1 → binary[0]
                                //   └----
                                // 2 |  8  ... 1 → binary[1]
                                //   └----
                                // 2 |  4  ... 0 → binary[2]
                                //   └----
                                // 2 |  2  ... 0 → binary[3]
                                //   └----
                                // 2 |  1  ... 0 → binary[4]
                                //   └----
                                //      0  ... 1 → binary[5]
    
    // 2진수                    //   ┌---------------------------------------┐
    int[] binary = new int[10]; //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
                                //   └---------------------------------------┘
    
//    int index = 0;
//    for(int i = 0; i < binary.length; i++) {
//      if(number % 2 == 1) {
//        binary[i] = 1;
//      }
//      else {
//        binary[i] = 0;
//      }
//      number /= 2;
//      
//      if(number > 0)
//        index++;
//    }
//    System.out.println(Arrays.toString(binary));
//    // System.out.println(index);
//    
//    int[] temp = new int[index+1];
//    int j = 0;
//    for(int i = index; i >= 0; i--) {
//      // System.out.println(binary[i]);
//      temp[j++] = binary[i];
//    }
//    //System.out.println(Arrays.toString(temp));
//    binary = temp;
//    System.out.println(Arrays.toString(binary));
    
//    int index = 0;
//    
//    while(number > 0) {
//      if(number % 2 == 1) {
//        binary[index] = 1;
//      }
//      else {
//        binary[index] = 0;
//      }
//      number /= 2;      
//      index++;
//    }    
//    System.out.println(Arrays.toString(binary));
//    // System.out.println(index);
//   
//    int[] temp = new int[index];
//    
//    for(int i = index-1, j = 0; i >= 0; i--) {
//      // System.out.println(i);
//      // System.out.println("  " + j);
//      temp[j++] = binary[i];
//    }
//    System.out.println(Arrays.toString(temp));
    
    int i = 0;
    while(number > 0) {
      binary[i++] = number % 2;
      number /= 2;
    }
    
    for(int j = i-1; j >= 0; j--) {
      System.out.print(binary[j]);
    }
  }

}
