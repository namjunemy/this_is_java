public class Ex01 {
  /**
   * 01. 중첩 멤버 클래스에 대한 설명으로 틀린 것은 무엇입니까?
   *
   * 1. 인스턴스 멤버 클래스는 바깥 클래스의 객체가 있어야 사용될 수 있다.
   * 2. 정적 멤버 클래스는 바깥 클래스의 객체가 없어도 사용될 수 있다.
   * 3. 인스턴스 멤버 클래스 내부에는 바깥 클래스의 모든 필드와 메소드를 사용할 수 있다.
   * 4. 정적 멤버 클래스 내부에는 바깥 클래스의 인스턴스 필드를 사용할 수 있다.
   * (없다. static 메소드에서 인스턴스필드 사용은 불가하다.
   * 정적 멤버 클래스는 바깥 클래스의 인스턴스가 생성되지 않아도 접근할 수 있다.
   * 클래스가 메모리에 올라갈 때, 이미 static 키워드가 붙은 메소드는 자동적으로 생성된다.
   * static 메소드를 사용한다고 했을 시점에 인스턴스 필드가 생성되었는지 여부에 대해 알 수 없다.
   * 따라서, static 메소드에서 인스턴스 필드의 사용을 허용 하지 않는다.)
   */
}

