
public class CarTest {
    public static void main(String[] args) {
        Car Audi = new Car(); //Car 클래스로부터 Audi 인스턴스 생성
        Car Nissan = new Car(); //Car 클래스로부터 Nissan 인스턴스 생성
        Car Volvo = new Car(); //Car 클래스로부터 Volvo 인스턴스 생성
    }
//

//        Car car1 = new Car();
//        Car car2 = new Car();
//
//
//        car1.iv = "나는야 인스턴스 변수"; //인스턴스변수는 각자의 속성 갖음.
//        System.out.println(car1.iv);
//        System.out.println(car2.iv);



//        car1.cv = "저는 클래스변수"; //static으로 선언된class변수는 하나의 메모리만 갖고있기때문에 모든 객체에서 변경한 변수 공유.
//        System.out.println(car1.cv);
//        System.out.println(car2.cv);
//        System.out.println(Car.cv);


//        System.out.println(Car.cv);
//        System.out.println(Car.iv); //인스턴스참조불가능 오류 발생.



//        Car tesla = new Car("Model 3", "빨강"); // 객체 생성.
//
//        System.out.println("내 차의 모델은 " + tesla.model + "이고 " + "색은 " + tesla.color + "입니다."); // 필드 호출
//        tesla.power(); // 메서드 호출
//        tesla.accelerate();
//        tesla.stop();
//
//        Car lamborghini = new Car("Model Aventador LP 700-4", "노랑");
//
//        System.out.println("내 차의 모델은 " + lamborghini.model + "이고 " + "색은" + lamborghini.color + "입니다.");
    }
//}


class Car { // Car 클래스 정의
    private String model; // 속성
    private int wheels; // 속성
    private int doors; // 속성
    private String color; // 속성

    void power(){ // 기능
        System.out.println("시동걸기");
    }
    void accel(){ // 기능
        System.out.println("가속하기");
    }
    void stop(){ // 기능
        System.out.println("정지하기");
    }

//    private String modelName;
//    private String color;
//    private int maxSpeed;
//
//    public Car(String modelName, String color, int maxSpeed) {
//        this.modelName = modelName;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//    }
//
//    public String getModelName() {
//        return modelName;
//    }
//
//    public String getColor() {
//        return color;
//    }
}