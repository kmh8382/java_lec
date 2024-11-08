package pkg12_Bakery;

public class Customer {

  private int bread;  // 구매한 빵의 갯수
  private int money;  // 고객이 가진 돈
  
  public Customer(int bread, int money) {
    this.bread = bread;
    this.money = money;
  }
  public int getBread() {
    return bread;
  }
  public void setBread(int bread) {
    this.bread = bread;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  /**
   * 구매처리
   * @param bakery 구매할 빵집
   * @param bread  구매하려는 빵의 갯수
   * @param money  구매할 때 낼 돈
   */
  public void buy(Bakery bakery, int bread, int money) {
    
    // 가지고 있는 돈보다 더 많이 내려고할때
    if(this.money < money) {
      System.out.println("내가 가진 돈이 부족합니다. (" + (money - this.money) + "원 부족)");
      return;
    }
    
    // 구매 처리 (구매 == 빵집의 판매, 빵집의 판매 결과를 받는것이 곹 구매이다.)
    BreadNChange breadNChange = null;
    if(bakery != null) {
      breadNChange = bakery.sell(money, bread);
    }
    
    // 구매 결과 확인
    if(breadNChange != null) {    // 구매 성공
      this.bread += breadNChange.getBread();
      this.money -= (money - breadNChange.getChange());
      System.out.println("구매 완료");
    }
   
  }
}
