package pkg05_upcasting;

public class UpcastingEx {

  public static void main(String[] args) {

    
    Tablet tab = new Tablet();
    tab.internet();
    tab.screenTouch();
    
    // Computer computer = new Tablet();
    Computer computer = tab;  // 업캐스팅
    computer.internet();      // 업캐스팅 된 인스턴스는 부모 메소드만 호출 가능
    // computer.screenTouch();   // 호출 불가

    Computer[] ary = new Computer[5];
    ary[0] = new Computer();
    ary[1] = new Tablet();
    ary[2] = new Tablet();
    ary[3] = new Computer();
    ary[4] = new Tablet();
  }

}
