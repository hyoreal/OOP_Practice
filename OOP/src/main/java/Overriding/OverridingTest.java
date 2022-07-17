package Overriding;

public class OverridingTest {
    int age;
    String name;
    Address address;

    public OverridingTest(int age, String name, Address address){
        this.age = age;
        this.name = name;
        this.address = address;
    }
    void showInfo() {
        System.out.println("저는 " + name + "이고 나이는 " + age + "살 입니다.");
        System.out.println("나라는 " + address.country + "이고, 지역은 " + address.city + "입니다.");
    }

    public static void main(String[] args){
        Address address1 = new Address("한국", "서울");
        Address address2 = new Address("미국", "워싱턴 D.C");

        OverridingTest dotdot = new OverridingTest(20 , "김땡땡", address1);
        OverridingTest nana = new OverridingTest(30, "박나나", address2);

        dotdot.showInfo();
        System.out.println("-".repeat(15));
        nana.showInfo();
    }
}
class Address {
    String city, country;

    public Address(String country, String city) {
        this.city = city;
        this.country = country;
    }
}
