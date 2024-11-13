package pkg07_BankAccount;

public class BankAccount {

  private String accNo;
  private long balance;
  
  public BankAccount(String accNo, long balance) {
    this.accNo = accNo;
    this.balance = balance;
  }
  
  /**
   * 입금 처리.
   * @param money 입금액. 
   * @exception 마이너스 금액 불가.
   */
  public void deposit(long money) {
//    if(money < 0)
//      return;
//    balance += money;
    
    try {
      if(money < 0) {
        throw new RuntimeException(money + " 마이너스 금액!! 입금불가");
      }
      balance += money;        
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
  
  /**
   * 출금 처리.
   * @param money 희망 출금액. 
   * @return 실제 출금액.
   * @exception 마이너스 출금 불가. 잔액보다 큰 금액 출금 불가.
   */
  public long withdrawal(long money) {
//    if(money < 0 || money > balance)
//      return 0L;
//    balance -= money;
//    return money;

    try {
      if(money < 0 ) {
        throw new RuntimeException(money + " 마이너스 금액!! 출금불가");
      }
      if(money > balance) {
        throw new RuntimeException(money + " 잔액보다 큰 금액!! 출금불가");
      }
      balance -= money;
      return money;      
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return 0L;

  }
  
  /**
   * 이체 처리.
   * @param bankAccount 이체할 계좌 정보.
   * @param money 이체할 금액.
   */
  public void transfer(BankAccount bankAccount, long money) {
//    if(money < 0)
//      return;
//    if(bankAccount.accNo == null)
//      return;       
//    bankAccount.deposit(this.withdrawal(money));
    
      bankAccount.deposit(this.withdrawal(money));    
  }
  
  /**
   * 계좌 조회. 계좌번호와 통장잔액을 출력
   */
  public void inquiry() {
    System.out.println("BankAccount : " + accNo);
    System.out.println("Balance : " + balance);
  }
  
}
