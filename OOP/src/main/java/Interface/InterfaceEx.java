package Interface;

public interface InterfaceEx {
    public static final int rock = 1; // 인터페이스 인스턴스 변수
    final int scissors = 2; // public static 생략
    static int paper = 3; // public & final 생략

    public abstract String getPlayingNum();
        void call(); // public abstract 생략
}

