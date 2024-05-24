class Solution {
    public String solution(String my_string, String letter) {
        // 문자열 my_string에서 문자 letter를 제거한 새로운 문자열을 저장할 변수
        StringBuilder answer = new StringBuilder();

        // my_string의 각 문자를 순회하면서 letter와 다른 경우에만 answer에 추가
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) != letter.charAt(0)) {
                answer.append(my_string.charAt(i));
            }
        }

        // StringBuilder를 String으로 변환하여 반환
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution solutionObj = new Solution();
        String my_string = "Hello World";
        String letter = "l";
        String result = solutionObj.solution(my_string, letter);
        System.out.println("Result: " + result); // 출력: Heo Word
    }
}
