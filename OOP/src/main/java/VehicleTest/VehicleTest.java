package VehicleTest;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Vehicle vehicle = car; //상위 클래스 Vehicle타입으로 변환(생략가능
        Car car2 = (Car) vehicle; //하위 클래스 Car타입으로 변환(생략불가
//        MotorBike motorBike = (MotorBike) car; //상속관계아님.타입변환불가 -> 에러
    }
}

class Vehicle {
    String model;
    String color;
    int wheels;

    void startEngine(){
        System.out.println("시동");
    }

    void accelerate(){
        System.out.println("속도 up");
    }

    void brake(){
        System.out.println("브레이크");
    }
}

class Car extends Vehicle {
    void giveRide() {
        System.out.println("다른사람 태우기");
    }
}
class MotorBike extends Vehicle {
    void performance(){
        System.out.println("묘기 부리기");
    }
}