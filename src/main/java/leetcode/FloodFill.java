package leetcode;


/*

## 문제
m * n 정수된 image 격자가 있다.
시작 픽셀이 주어 졌을때 sr, sc
첫 시작 의 4면 위, 아래, 왼쪽, 오른쪽이 첫 시작점과 같다면 계속 변경해 나간다.

sr=1, sc=1, newColor=2
1,1,1     2,2,2
1,1,0  => 2,2,0
1,0,1     2,0,1

## 풀이
DFS로 풀면 되지 않을까 싶다.

changeColor(image, int sr, int sc newColor)

중단점.
sr 이 0보다 작거나 image[][] 길이보다 크거나 같다;
sc 이 0보다 작거나 image[] 길이보다 크거나 같다;

* 왼쪽 색상을 변경한다.
* 오른쪽 색상을 변경한다.
* 아래 색상을 변경한다.
* 위 색상을 변경한다.

*/

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        changeColor(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void changeColor(int[][] image, int sr, int sc, int color, int newColor) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color || image[sr][sc] == newColor) {
            return ;
        }
        image[sr][sc] = newColor;
        changeColor(image, sr - 1, sc, color, newColor);
        changeColor(image, sr + 1, sc, color, newColor);
        changeColor(image, sr, sc -1 , color, newColor);
        changeColor(image, sr, sc + 1, color, newColor);
    }
}
