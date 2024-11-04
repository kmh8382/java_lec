package pkg03_casting;

public class CastionEx {

  public static void main(String[] args) {
    // 1. 자동 형 변환 (묵시적 형변환, promotion)
    // 값의 도메인(값의 범위)이 작은 타입이 큰 타입으로 변환된다.
    // byte < short < int < long < float < double
    int a = 10;
    long b = a;
    double c = b + 1.5;   // 변수 b 를 double 다입으로 변환한 뒤 더한다.
    System.out.println(c);

  }

}
