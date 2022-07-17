package CoffeeTestOfPolymorphism;

public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}

class Coffee {
    int price;

    public Coffee(int price){
        this.price = price;
    }
}

class Americano extends Coffee{
    public Americano(){
        super(4000); // 상위 클래스 Coffee 의 생성자 호출
    }

    public String toString(){return "아메리카노";} //Object 클래스 toString()메서드 오버라이딩. 안하면 주소값출력됨.
}
class CaffeLatte extends Coffee{
    public CaffeLatte(){
        super(5000);  // 상위 클래스 Coffee 의 생성자 호출
    }

    public String toString(){return "카페라떼";} //Object 클래스 toString()메서드 오버라이딩
}

class Customer {
    int money = 50000;

//    void buyCoffee(Americano americano){ //메뉴가 늘어날수록 매번 추가하기 힘듦
//        money -= americano.price;
//    }
//
//    void buyCoffee(CaffeLatte caffeLatte){
//        money -= caffeLatte.price;
//    }
//
    void buyCoffee(Coffee coffee){ //매개변수의 다형성
        if(money < coffee.price){ // 커피가격보다 돈이 모자를때
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money -= coffee.price;
        System.out.println(coffee + "를 구입했습니다.");
    }
}
