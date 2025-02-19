package sb02.stream.pr3;

import java.util.function.Function;

// 스태틱 메서드 사용 예시
public class StaticMethodRefDemo {
    public static int doubleValue(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        // 람다 식
        // Function<Integer, Integer> f1 = num -> StaticMethodRefDemo.doubleValue(num);

        // 정적 메서드 참조
        Function<Integer, Integer> f2 = StaticMethodRefDemo::doubleValue;

        System.out.println(f2.apply(10)); // 20
    }
}
