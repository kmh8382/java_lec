package pkg02_generic;

/**
 * 제네릭 타입 T : Container 인스턴스 생성 시 전달되는 타입
 * @param <T> 오직 Rafarance Type 만 전달할 수 있다.
 */
public class Container<T> {

  // field
  private T itme;

  public T getItme() {
    return itme;
  }

  // getter & setter
  public void setItme(T itme) {
    this.itme = itme;
  }
  
  
}
