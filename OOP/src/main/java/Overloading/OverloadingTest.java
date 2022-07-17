package Overloading;

class OverloadingTest {
    public static void main(String[] args) {
        OverloadingMethods olMethods = new OverloadingMethods();

        olMethods.print();
        olMethods.print(1);
        olMethods.print(2,3);
        olMethods.print(4.0);
    }
}
class OverloadingMethods {
    public void print() {
        System.out.println("난 오버로딩");
        System.out.println("-".repeat(15));
    }
    public void print(int a) {
        System.out.println("이 몸이 오버로딩이시다!");
        System.out.println(a);
        System.out.println("-".repeat(15));
    }
    public void print(int b, int c) {
        System.out.println("꿇어라. 이것이 오버로딩이다.");
        System.out.println(b +","+ c);
        System.out.println("-".repeat(15));
    }
    public void print(double d) {
        System.out.println("오버로딩은 이렇답니당");
        System.out.println(d);
        System.out.println("-".repeat(15));
    }
}