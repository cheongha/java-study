package singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args){
        // Company company1 = new Company();
        // Company company2 = new Company();

        // 프로그램 내에서 인스턴스를 1개만 생성되도록 하자!

        // Company 를 가져다 쓰기 위해서 Company 내부에 선언
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        System.out.println(c1);
        System.out.println(c2);
        // 결과 : 동일한 주소값이 출력됨

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
    }
}
