package Interface;

abstract class Animal2 { // 추상클래스
    public abstract void cry();
}
interface Pet2 { // 인터페이스
    public abstract void play();
}

class Dog2 extends Animal2 implements Pet2 {
    public void cry(){
        System.out.println("왈왈");
    }
    public void play() {
        System.out.println("터그놀이");
    }
}

class Cat2 extends Animal2 implements Pet2 {
    public void cry(){
        System.out.println("깱꽁");
    }
    public void play(){
        System.out.println("스크래쳐");
    }
}

public class MultiInheritance2 {
    public static void main(String[] args){
        Dog2 dog2 = new Dog2();
        Cat2 cat2 = new Cat2();

        dog2.cry();
        dog2.play();
        cat2.cry();
        cat2.play();
    }
}
