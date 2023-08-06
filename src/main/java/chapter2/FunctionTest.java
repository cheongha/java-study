package chapter2;

public class FunctionTest {

    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;

        int result = add(num1, num2);
        System.out.println(result);

    }
    public static int add (int x, int y){
        int result;
        result = x + y;
        return result;
    }
}
