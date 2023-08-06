package chapter2;

public class Circle {

    // 참조 변수형
    // 클래스 안에서 다른 클래스 참조
    Point point;
    int radius;

    public Circle(){
        Point point = new Point();
    }
}
