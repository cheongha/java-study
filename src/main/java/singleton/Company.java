package singleton;

public class Company {

    // 외부에서 이 constructor를 생성할수 없도록 private
    private Company(){

    }

    // => class 내부에서만 생성
    // 값이 변경되면 안되기 때문에 private
    // 단하나만 있을 거기 때문에 static
    private static Company instance = new Company();

    // public 한 메서드를 static으로 선언해야
    // 접근 가능, 객체 생성없이 클래스 이름으로 참조해서 사용 가능
    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }
        return instance;
    }
    // 그런데, 이 메서드가 일반 메서드이기 때문에 객체를 생성한 후에 호출이 가능
    // => static 으로 선언하면 가능!
}
