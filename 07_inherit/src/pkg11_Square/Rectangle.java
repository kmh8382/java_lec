package pkg11_Square;

public class Rectangle {

  private int width;
  private int heigth;
  
  public Rectangle() {
    
  }
  
  public Rectangle(int width, int heigth) {
    super();
    this.width = width;
    this.heigth = heigth;
  }
  
  public int getArea() {
    System.out.println();
    return width * heigth;
  }
  
  
}
