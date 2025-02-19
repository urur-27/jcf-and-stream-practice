package sb02.stream.pr1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterMapExample {
    public static void main(String[] args) {
        // MAP은 키와 밸류 페어
        Map<String, Integer> scores = new HashMap<>();
        // put을 통해 키, 밸류 넣기
        scores.put("Kim", 90);
        scores.put("Lee", 75);
        scores.put("Park", 88);
        // 같은 Key값을 넣으면 덮어쓴다.
        scores.put("Kim", 100);

        // 높은 점수만 걸러내는 Predicate 작성
        //Map.Entry<K, V>란?
        //Map.Entry<K, V>는 Map 내부에서 (Key, Value) 쌍을 다룰 수 있도록 제공하는 인터페이스입니다.
        //주요 메서드:
        //entry.getKey() → 해당 entry의 키 반환.
        //entry.getValue() → 해당 entry의 값 반환.

//        Predicate<Map.Entry<String, Integer>> highScore =
//                new Predicate<Map.Entry<String, Integer>>() {
//                    @Override
//                    public boolean test(Map.Entry<String, Integer> entry) {
//                        return entry.getValue() > 80;
//                    }
//                };

        // entrySet을 통하여 맵 객체를 1차원 구조로 변경(stream을 실행하기 위한 조치)
        // 람다식을 통하여 간편화
        scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 80)
                .forEach(entry ->
                        System.out.println("High score: " + entry.getKey() + ": " + entry.getValue()));

        System.out.println("-------");

        Map<String, Integer> filterdScores = scores.entrySet().stream()
                .filter(entry -> entry.getValue() > 80)
                .collect(
                        Collectors.toMap(
                                entry -> entry.getKey(),
                                entry -> entry.getValue()
                        )
                );
    }
}
