package sb02.stream.pr1;

import java.util.Arrays;
import java.util.List;

public class ForEachVsForExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 전통적인 for
        System.out.println("=== Using for loop ===");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                continue;  // 홀수 건너뛰기
            }
            System.out.println("Even number: " + numbers.get(i));
        }

        // 향상된 for
        // 이터러블, 순차 탐색이 가능한 자료구조에 대한 탐색
        System.out.println("\\n=== Using enhanced for ===");
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                continue;
            }
            System.out.println("Even number: " + num);
        }

        // 스트림 forEach
        System.out.println("=== Using Stream filter + forEach ===");
        numbers.stream()
                .filter(n -> n % 2 == 0) // filter 조건을 만족할 때만 넘겨줌
                .forEach(n -> System.out.println("Even number: " + n));
    }
}
