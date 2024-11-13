package pkg08_BankAccount;

public class BankAccountEx {

  public static void main(String[] args) {
    // BankAccount 타입의 인스턴스 2개 생성하기

    BankAccount myAcc = new BankAccount("010-1111-1111", 500_000);
    BankAccount momAcc = new BankAccount("010-9999-9999", 1_000_000);   
    
//    momAcc.transfer(myAcc, -10_000);
//    myAcc.inquiry();
//    momAcc.inquiry();
//    System.out.println();
//
//    momAcc.transfer(myAcc, 10_000_000);
//    myAcc.inquiry();
//    momAcc.inquiry();
//    System.out.println();
//
//    momAcc.transfer(myAcc, 100_000);    
//    myAcc.inquiry();
//    momAcc.inquiry();
    
    try {
      myAcc.inquiry();
      // myAcc.deposit(-100000);
      myAcc.deposit(100000);
      myAcc.inquiry();
      System.out.println("--------------------");
      System.out.println("--------------------");
      
      myAcc.inquiry();
      // myAcc.withdrawal(-100000);
      // myAcc.withdrawal(1000000);
      myAcc.withdrawal(100000);
      myAcc.inquiry();
      System.out.println("--------------------");
      System.out.println("--------------------");
      
      
      myAcc.inquiry();
      momAcc.inquiry();
      // momAcc.transfer(myAcc, -100000);
      momAcc.transfer(myAcc, 100000);
      myAcc.inquiry();
      momAcc.inquiry();
      System.out.println("--------------------");
      System.out.println("--------------------");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
