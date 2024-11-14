package pkg12_Carrier;

public class Carrier {

  private Cup[] cups;  
  private int idx;
  
  public Carrier() {
    
  }

  public Carrier(int cupCnt) {
    cups = new Cup[cupCnt];
  }
  
  public void addCup(Cup cup) {
    if(idx == cups.length) {
      System.out.println("캐리어가 가득 찼습니다.");
      return;
    }
    cups[idx++] = cup;
  }
  
  public void info() {
    if(idx == 0) {
      System.out.println("캐리어가 비어 있습니다.");
    }
    
    for(Cup cup : cups) {
      System.out.print(cup.getCoffee().getName() + ", ");
    }
  }
}
