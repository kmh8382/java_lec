package pkg02_generic;

public class GenericEx {

  public static void main(String[] args) {
    
    // 정수 저장 Container
    Container<Integer> container1 = new Container<Integer>();
    container1.setItme(10);
    System.out.println(container1.getItme());
    
    // 실수 저장 Container
    Container<Double> container2 = new Container<Double>();
    container2.setItme(10.0);
    System.out.println(container2.getItme());

    
    // Car 저장 Container
    Container<Car> container3 = new Container<Car>();
    container3.setItme(new Car("bmw", "x7"));
    System.out.println(container3.getItme().getBrand());
    System.out.println(container3.getItme().getModel());
    System.out.println(container3.getItme());

    
  }

}
