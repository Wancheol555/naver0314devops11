package Study0401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

    public static void main(String[] args) {
        class Solution {
            public List<Integer> solution(int n) {
                List<Integer> answer = new ArrayList<>();

                for (int i = 1; i <= n; i++) {
                    if (i%2==1)
                    {
                        answer.add(i);
                    }

                }

                return answer;

            }
        }

        Solution a = new Solution();
        List<Integer> c = a.solution(100);
        for (int b : c) {
            System.out.println(b);
        }
    }
}
