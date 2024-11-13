package pkg09_BankAccount;

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
   * @throws 마이너스 금액 불가(코드 1000).
   */
  public void deposit(long money) throws DepositException {
    if(money < 0)
      throw new DepositException(money + " 마이너스 금액!! 입금불가", 1000);
    balance += money;
  }
  
  /**
   * 출금 처리.
   * @param money 희망 출금액.  
   * @return 실제 출금액.
   * @throws 마이너스 출금 불가(코드 2000). 잔액보다 큰 금액 출금 불가(코드 2001).
   */
  public long withdrawal(long money) throws WithdrawalException {
    if(money < 0)
      throw new WithdrawalException(money + " 마이너스 금액!! 출금불가", 2000);
    if(money > balance)
      throw new WithdrawalException(money + " 잔액보다 큰 금액!! 출금불가", 2001);
    balance -= money;
    return money;
  }
  
  /**
   * 이체 처리.
   * @param bankAccount 이체할 계좌 정보.
   * @param money 이체할 금액.
   * @throws DepositException 입금예외.
   * @throws WithdrawalException 출금예외.
   */
  public void transfer(BankAccount bankAccount, long money) throws DepositException, WithdrawalException {
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
