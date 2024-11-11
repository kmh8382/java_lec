package pkg00_Bus;

public class BusEx {

  public static void main(String[] args) {
    
    Bus bus = new Bus(5);
    
    bus.on(new Man("남자1"));
    bus.on(new Man("남자2")); 
    bus.on(new Man("남자3")); 
    bus.on(new Man("남자4")); 
    bus.on(new Man("남자5"));               
    bus.info();
    System.out.println("");

    bus.on(new Woman("여자1"));
    bus.off(3);    
    bus.info();
    System.out.println("");
    
    bus.on(new Woman("여자2"));
    bus.info();
    System.out.println("");    
  }

}
