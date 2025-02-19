package sb02.stream.pr1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class MapEntryTransformationExample {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 92);

        // Function은 2개의 타입을 적용시켜야함(Function<input, output>)
        Function<Map.Entry<String, Integer>, String> entryToString =
                new Function<Map.Entry<String, Integer>, String>(){
                    @Override
                    public String apply(Map.Entry<String, Integer> entry) {
                        return entry.getKey() + ": " + entry.getValue();
                        //
                    }
                };

        scores.entrySet().stream()
                .map(entryToString)
                .forEach(result -> System.out.println(result));

        // 맵에 포함된 내용을 2차원이 아닌 1차원으로 변경. 어떤 자료형이든 stream은 1차원
        // scores 맵을 가지고 Entryset으로 변환시키는 것 까지는 맵이 아니다.
//        List<Map.Entry<String, Integer>> scoreEntries
//                = scores.entrySet().stream().toList(); // entrySet으로 1차원으로 변경
//        System.out.println(scoreEntries);

    }
}
