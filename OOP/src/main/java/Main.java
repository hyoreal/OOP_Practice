public class Main {
    public static void main(String [] args) {
//        Outer outer = new Outer();
//        System.out.println("외부클래스 사용하여 내부클래스기능 호출");
//        outer.testClass();

//        Outer.StaticInClass a = new Outer.StaticInClass();
//        a.test();

        Outer outer = new Outer();
        outer.test();
    }
}


//class Outer { // 외부클레스
//    private int num = 1; //외부클래스 인스턴스 변수
//    private static int sNum = 2; // 외부클래스 정적변수
//
//    private InClass inClass; //내부클래스 자료형 변수 선언
//
//    public  Outer() {
//        inClass = new InClass(); //외부클래스 생성자
//    }
//
//    class InClass { //인스턴스 내부 클래스
//        int inNum = 10; //내부클래스의 인스턴스변수
//
//        void Test() {
//            System.out.println("Outer num = " + num + "(외부클래스의 인스턴스변수)");
//            System.out.println("Outer sNum = " + sNum + "(외부클래스의 정적변수)");
//        }
//    }
//
//    public void testClass() {
//        inClass.Test();
//
//
//    }
//}

//class Outer { //외부클래스
//    private int num = 3; //내부클래스의 인스턴스 변수
//    private static int sNum = 4;
//
//    void getPrint() {
//        System.out.println("인스턴스 메서드");
//    }
//
//    static void getPrintStatic() {
//        System.out.println("스태틱 메서드");
//    }
//
//    static class StaticInClass { //정적내부클래스
//        void test() {
//            System.out.println("Outer num = " + sNum + "(외부클래스의 정적변수)");
//            getPrintStatic();
//        }
//    }
//}


class Outer { //외부클래스
    int num = 5;
    void test() {
        int num2 =6;
        class LocalInClass{ //지역내부클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}