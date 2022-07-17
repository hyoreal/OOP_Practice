public class StaticTest {
    public static void main(String[] args){
        StaticEx staticEx = new StaticEx();
        System.out.println("인스턴스 변수 : " + staticEx.num1);
        System.out.println("클래스 변수 : " + staticEx.num2);
    }
}

class StaticEx {
    int num1 = 10;
    static int num2 = -10;
}