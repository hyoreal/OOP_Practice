package Interface;

interface Animal { // 인터페이스 선언. public abstract 생략
    public abstract void cry();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet { // Animal 과 Pet 다중구현
    public void cry(){ // 메서드 오버라이딩
        System.out.println("멍멍");
    }
    public void play(){ // 메서드 오버라이딩
        System.out.println("원반놀이");
    }
}

class Cat implements Animal, Pet { // Animal 과 Pet 다중구현
    public void cry() { // 메서드 오버라이딩
        System.out.println("앩옹");
    }
    public void play() { // 메서드 오버라이딩
        System.out.println("털실놀이");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }
}
