package ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyFirstStream2 {

    public static void main(String[] args) {

        // 문자열 리스트 생성
        List<String> list = Arrays.asList("alice", "bob", "charlie");
        System.out.println("원본 문자열 리스트: " + list);

        // 1. 대문자로 출력
        System.out.println("대문자 변환 후 출력:");
        list.stream()
            .map(str -> str.toUpperCase())
            .forEach(System.out::println);

        // 2. 대문자로 변환한 값을 리스트로 저장
        List<String> upperCaseNames = list.stream()
                                          .map(String::toUpperCase)
                                          .collect(Collectors.toList());
        System.out.println("대문자 리스트: " + upperCaseNames);

        // 정수 배열 생성
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("원본 배열: " + Arrays.toString(arr));

        // 3. 짝수만 필터링 후 출력
        System.out.print("짝수 출력: ");
        Arrays.stream(arr)
              .filter(n -> n % 2 == 0)
              .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 4. 필터링된 짝수를 boxed()로 Integer로 변환
        List<Integer> iList = Arrays.stream(arr)
                                    .filter(n -> n % 2 == 0)
                                    .boxed()
                                    .collect(Collectors.toList());
        System.out.println("짝수 리스트: " + iList);

        // 5. 리스트에 값 추가 및 제거
        iList.add(10);
        iList.add(100);
        iList.remove(0); // 첫 번째 요소 제거
        System.out.println("수정된 리스트: " + iList);
    }
}
