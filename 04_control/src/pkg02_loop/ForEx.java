package pkg02_loop;

public class ForEx {

  public static void main(String[] args) {
    
    // 5,4,3,2,1 출력하기
    for(int i = 5; i >= 1; i--) {
      System.out.println(i);
    }
    
    // 1~10 사이 홀수의 평균 (합계 / 개수)
    int cnt = 0;
    int tot = 0;
    for(int i = 1; i <= 10; i++) {
      if(i % 2 == 1) {        
        cnt++;
        tot += i;
        System.out.println("홀수 : " + i);
        System.out.println(" 개수 : " + cnt);
        System.out.println(" 합계 : " + tot);
      }
    }
    System.out.println("   평균 : " + (double)tot / cnt);
        
    // 구구단 3단 출력하기
    for(int i = 1; i <= 9; i++) {
      System.out.println("3 * " + i + " = " + 3*i);
    }
    
    
  }

}
