package sb02.stream.pr3;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodRefDemo {

    // Consumer 형태. 아무것도 돌려주지 않는
    // 객체 범위에 포함되는 멤버 변수
    public void printString(String s){
        System.out.println("String: "+s);
    }

    public static void main(String[] args) {
        // 멤버 변수이기에 객체화를 시켜서 참조 가능
        InstanceMethodRefDemo demo = new InstanceMethodRefDemo();
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");


        // 람다
        // list.forEach(s -> demo.printString(s));

        // 인스턴스 메서드 참조
        list.forEach(demo::printString);
    }
}
