package codility;

/*

Array가 주어지고 [1..(N + 1)] 를 갖는다. 하나가 비어 있는데 그 빈값을 찾아내어라.
    A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

* */

class PermMissingElem {

    public int solution(int[] A) {
// write your code in Java SE 8
        int[] check = new int[A.length + 2];
        for (int number : A) {
            check[number] = 1;
        }

        int result = 0;
        for (int i = 1; i < check.length; i++) {
            if (check[i] == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}
