public class StaticFieldTest {
    public static void main(String[] args){
        StaticField staticField1 = new StaticField(); //객체1 생성
        StaticField staticField2 = new StaticField(); //객체2 생성

        staticField1.num1 = 100; //인스턴스필드는 각자의 고유성을 갖음
        staticField1.num1 = 1000;

        System.out.println(staticField1.num1);
        System.out.println(staticField2.num1);

        staticField1.num2 = 150; // 정적필드는 값이 공유됨
        staticField1.num2 = 1500;
        System.out.println(staticField1.num2);
        System.out.println(staticField2.num2);
    }
}

class StaticField {
    int num1 = 10; //인스턴스필드
    static int num2 = 15; //정적필드
}

