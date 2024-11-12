package pkg10_interface.B_extends;

public class ExtendsEx {

  public static void main(String[] args) {
    
    // SmartPhone 인터페이스가 가질 수 있는 타입
    // : Electronic, Computer, Phone, SmartPhone
    
    Electronic p1 = new SmartPhone();
    p1.powerOn();
    p1.powerOff();
    ((Computer)p1).game();
    ((Phone)p1).call();
    ((Phone)p1).sms();
    ((SmartPhone)p1).powerOn();
    ((SmartPhone)p1).powerOff();
    ((SmartPhone)p1).game();
    ((SmartPhone)p1).call();
    ((SmartPhone)p1).sms();
    System.out.println();

    Computer p2 = new SmartPhone();
    p2.powerOn();
    p2.powerOff();
    p2.game();
    ((Phone)p1).call();
    ((Phone)p1).sms();
    System.out.println();
    
    Phone p3 = new SmartPhone();
    ((Electronic)p3).powerOn();
    ((Electronic)p3).powerOff();
    ((Computer)p1).game();
    p3.call();
    p3.sms();
    System.out.println();
    
    SmartPhone p4 = new SmartPhone();
    p4.powerOn();
    p4.powerOff();
    p4.game();
    p4.call();
    p4.sms();
    System.out.println();

  }

}
