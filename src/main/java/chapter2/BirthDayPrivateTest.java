package chapter2;

public class BirthDayPrivateTest {
    public static void main(String[] args){
        BirthDay1 birthDay1 = new BirthDay1();
        birthDay1.day = 26;
        birthDay1.month = 5;
        birthDay1.year = 2023;

        BirthDay2 birthDay2 = new BirthDay2();
//        birthDay2.day = 26;
//        birthDay2.month = 5;
//        birthDay2.year = 2023;

        birthDay2.setYear(2023);
        birthDay2.setMonth(2);
        birthDay2.setDay(30);
    }
}

class BirthDay1 {
    public int day;
    public int month;
    public int year;
}

class BirthDay2 {
    // 같은 파일 내에서도 접근 X
    private int day;
    private int month;
    private int year;

    // => 접근 가능하도록 메서드 생성
    public void setDay(int day){
        if (month == 2){
            if (day < 1 || day > 28){
                System.out.println("날짜 오류입니다.");
            }
        } else{
            this.day = day;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}