package Study0401;

import java.util.ArrayList;

public class de {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // 요소 가져오기
        System.out.println("Element at index 0: " + list.get(0)); // 출력: Apple

        // 요소 수정
        list.set(1, "Grapes");

        // 요소 제거
        list.remove(2);

        // 리스트 크기
        System.out.println("Size of the list: " + list.size()); // 출력: 2

        // 전체 리스트 출력
        System.out.println("Elements in the list: " + list); // 출력: [Apple, Grapes]
    }
    }
