package pkg09_BankAccount;

public class BankAccountException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = 1604586914095000871L;

  // 예외 코드
  private int code;
  
  // constructor
  public BankAccountException(String message, int code) {
    super(message);
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

}
