package Interface;

//카페를 운영하는 사람이 있습니다.
//단골손님들은 매번 마시는 음료가 정해져있습니다.
//단골A는 항상 아아를 마십니다.
//단골B는 매일 아침 딸기라떼를 마십니다.

//카페손님
interface Customer{
    //추상메서드
    String getOrder(); // public abstract 생략
    //상수
}

//class CafeCustomer {
//    public String CafeCustomerName;
//
//    public void setCafeCustomerName(String CafeCustomerName) {
//        this.CafeCustomerName = CafeCustomerName;
//    }
//}

//cafeCustomer 클래스로부터 단골 A, 단골 B 상속
class CafeCustomerA implements Customer{
    @Override
    public String getOrder() {
        return "a glass of iced americano";
    }
}
class CafeCustomerB implements Customer{
    @Override
    public String getOrder() {
        return "a glass of strawberry latte";
    }
}

//class CafeCustomerA extends CafeCustomer {
//
//}
//
//class CafeCustomerB extends CafeCustomer {
//
//}

//카페사장
class CafeOwner {
    public void giveMenu(Customer customer){
        System.out.println("Menu : " + customer.getOrder());
    }
}

//class CafeOwner {
//    public void giveMenu(CafeCustomerA cafeCustomerA) {
//        System.out.println("give a glass of iced americano to CafeCustomer A");
//    }
//
//    public void giveMenu(CafeCustomerB cafeCustomerB) {
//        System.out.println("give a glass og strawberry latte to CafeCustomer B");
//    }
//}


//메뉴주문
public class OrderExample {
    public static void main(String[] args) throws Exception {
        CafeOwner cafeowner = new CafeOwner();
        Customer cafeCustomerA = new CafeCustomerA();
        Customer cafeCustomerB = new CafeCustomerB();

        cafeowner.giveMenu(cafeCustomerA);
        cafeowner.giveMenu(cafeCustomerB);
    }
}
//public class OrderExample {
//    public static void main(String[] args){
//        CafeOwner cafeOwner = new CafeOwner();
//        CafeCustomerA a = new CafeCustomerA();
//        CafeCustomerB b = new CafeCustomerB();
//
//        cafeOwner.giveMenu(a);
//        cafeOwner.giveMenu(b);
//    }
//}