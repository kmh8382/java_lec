package pkg04_override;

public class MixCoffee extends BlackCoffee {
  
  @Override   // Annotation (부모의 매소드을 재정의하여 사용할때)
  public void taste() {
    System.out.println("믹스커피맛");
  }
  
  
}
