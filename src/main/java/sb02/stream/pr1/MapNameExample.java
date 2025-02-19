package sb02.stream.pr1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MapNameExample {
    public static void main(String[] args){
        // 각 이름들의 길이를 출력하는 것을 만들 것
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Function<String, Integer> nameLength = new Function<String, Integer>(){
            @Override
            public Integer apply(String name) {
                return name.length();
            }
        };

        names.stream()
                .map(nameLength)
                .forEach(length -> System.out.println("Name length: " + length));

        names.stream()
                .map(s -> s.length())// s 대신 그냥 의미 있는 단어 넣어도 됨
                .forEach(length -> System.out.println("Name length: " + length));

    }
}
