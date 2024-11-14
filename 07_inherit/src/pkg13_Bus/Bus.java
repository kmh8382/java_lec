package pkg13_Bus;

public class Bus {

  private Seat[] seats;
  private int numOfParson;
  
  public Bus(int limit) {
    seats = new Seat[limit];
    for(int i = 0; i < limit; i++) {
      seats[i] = new Seat();
    }
  }
  
  // 버스 탑승 ( 빈 좌석 앞자리부터 채우기, 입석 금지)
  public void on(Person person) {
    if(numOfParson >= seats.length) {
      System.out.println("만석입니다.");
      return;
    }
            
    for(int i = 0; i < seats.length; i++) {
      if(seats[i].getPerson() == null) {
        seats[i].setPerson(person);
        numOfParson++;
        return;   // break 문도 가능하다.
      }
    }
    
  }
  
  // 버스 하차 (내릴는 사람의 좌석 번호를 이용해서 하차)
  public void off(int seatNo) {
    seatNo--;
    if(seatNo  < 0 || seatNo >= seats.length) {
      System.out.println("좌석 번호 잘못");
      return;
    }
      
    seats[seatNo].setPerson(null);
    numOfParson--;
  }
  
  // 버스 탑승 명단 (1번 죄석 : 홍길동, 21번 좌석 : 비어 있음, ...)
  public void info() {
    for(int i = 0; i < seats.length; i++) {
      if(seats[i].getPerson() == null) {
        System.out.println(String.format("%02d", i+1) + "번 좌석 : 비어 있음");
      } else {
        System.out.println(String.format("%02d", i+1) + "번 좌석 : " + seats[i].getPerson().getName());
      }
    }
  }
  
  
}
