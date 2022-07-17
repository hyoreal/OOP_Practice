package Interface;

interface Cover { // 인터페이스 정의
    void call();
}

public class Interface4 {
    public static void main(String[] args){
        User user = new User();

        user.callProvider(new Provider2());
    }
}

class User {
    public void callProvider(Cover cover){
        cover.call();
    }
}

class Provider implements Cover {
    public void call(){
        System.out.println("무양홍");
    }
}

class Provider2 implements Cover {
    public void call(){
        System.out.println("무한 야홍");
    }
}
