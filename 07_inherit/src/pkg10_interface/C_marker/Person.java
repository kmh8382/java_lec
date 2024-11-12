package pkg10_interface.C_marker;

public class Person {

//  public void eat(Food food) {
//    food.eat();
//  }
  
  public void eat(Eatable food) {
    ((Food)food).eat();
  }
}
