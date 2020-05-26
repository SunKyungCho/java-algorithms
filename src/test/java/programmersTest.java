import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class programmersTest {


    @Test
    void ridiTest() {

        int[] paper = {0,0,0,0,0,0,0,0,4,4};
//        int[] paper = {7,5,8,10,6,9,5};

        int i = solution1(paper);
        System.out.println();
    }

    private boolean isGindex(int totalNumber, int count) {
        return totalNumber >= (count * count);
    }

    private int solution1(int[] paper)  {
        int result = 0;
        int sum = Arrays.stream(paper).sum();

        Arrays.sort(paper);
        if(isGindex(sum, paper.length)) {
            return paper.length;
        }

        int count = paper.length - 1;
        for (int i = 0; i < paper.length; i++) {
            if(isGindex(sum - paper[i], count - i)){
                result = count - i;
                break;
            }
        }
        return result;
    }



    @Test
    void ridiTest2() {

//        assertThat(solution2(5)).isEqualTo(1);
//        assertThat(solution2(10)).isEqualTo(1);
        long fact = fact(100);

        String s = String.valueOf(fact);

        char last = s.charAt(s.length() - 1);

        int result = 0;
        for (int i = s.length() - 2; i > 0; i--) {
            if(s.charAt(i) != last) {
                result = (s.length()-1) - i;
                break;
            }
        }

        System.out.println();

    }

    private int solution2(int n){





        System.out.println();

        return 0;
    }

    private long fact(int n) {
        long fac = 1;
        for (int i = n; i >= 1; i--) {
            fac = fac * i;
        }
        return fac;
    }


    @Test
    void test3() {

        int[] arr = {3, 1, 2};

        int before = arr[0];
        boolean result = true;
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i] > arr[i+1] && Math.abs(arr[i] - arr[i+1]) >= 2)) {
                result = false;
            }
        }

        System.out.println();

    }

    @Test
    void test4() {

        int[] foods = {1,2,3,0,3};

        int total = Arrays.stream(foods).sum();
        int result = 0;
        if(total%3 > 0) {
            result = 0;
        }

        int div = total/3;
        int foodCount = foods.length;
        int divMethod = 0;

        List<Integer> pigDivIndexList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < foodCount; i++) {
            sum += foods[i];
            if(sum == div) {
                pigDivIndexList.add(i);
            }
        }

        for (int i = 0; i < pigDivIndexList.size(); i++) {
            Integer index = pigDivIndexList.get(i);
            int pig2Sum = 0;
            for (int j = index + 1; j < foodCount; j++) {
                pig2Sum += foods[j];
                if(pig2Sum == div) {
                    divMethod++;
                }
            }
        }
        System.out.println();
    }


}
