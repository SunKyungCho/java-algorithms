import jdk.internal.jline.WindowsTerminal;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.registerCustomDateFormat;
import static org.assertj.core.api.InstanceOfAssertFactories.ARRAY;

public class TestExample {

    @Test
    void test() {


        int u = 3;
        int l = 2;
        int checkCount = 0;
        int[] columns = {1, 1, 1, 1,1};
        int[] upper = new int[columns.length];
        int[] lower = new int[columns.length];
        int upperFillCount = 0;

        for (int i = 0; i < columns.length; i++) {
            if( columns[i] == 1) {
                if( u != upperFillCount) {
                    upper[i] = 1;
                    lower[i] = 0;
                    upperFillCount++;
                    checkCount++;
                }
                else {
                    lower[i] = 1;
                    upper[i] = 0;
                    checkCount++;
                }
            }
            else if (columns[i] == 2) {
                upper[i] = 1;
                lower[i] = 1;
                upperFillCount++;
                checkCount+=2;
            }
            else {
                upper[i] = 0;
                lower[i] = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : upper) {
            sb.append(i);
        }
        sb.append(",");
        for (int i : lower) {
            sb.append(i);
        }
        String s = sb.toString();

        System.out.println();

    }

    @Test
    void test2() {

        String s = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";
        int musicFileSize = 0;
        int imageFileSize = 0;
        int movieFileSize = 0;
        int otherFileSize = 0;

        String[] files = s.split("\n");
        for (String file : files) {
            if(isMusic(file)) {
                musicFileSize += getByteByFile(file.split(" ")[1]);
            }
            else if (isImage(file)) {
                imageFileSize += getByteByFile(file.split(" ")[1]);
            }
            else if (isMovie(file)) {
                movieFileSize += getByteByFile(file.split(" ")[1]);
            }
            else {  //others
                otherFileSize += getByteByFile(file.split(" ")[1]);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("music " + musicFileSize + "b\n");
        sb.append("images " + imageFileSize + "b");
        sb.append("movies " + movieFileSize + "b");
        sb.append("other " + otherFileSize + "b");


        String s1 = sb.toString();

        System.out.println();
    }

    private int getByteByFile(String fileSize) {
        String size = fileSize.split("b")[0];
        return Integer.parseInt(size);
    }

    private boolean isMovie(String file) {
        return file.indexOf(".mp4") > 0 || file.indexOf(".avi") > 0 || file.indexOf(".mkv") > 0;
    }

    private boolean isImage(String file) {
        return file.indexOf(".jpg") > 0 || file.indexOf(".bmp") > 0 || file.indexOf(".gif") > 0;
    }

    private boolean isMusic(String file) {
        return file.indexOf(".mp3") > 0 || file.indexOf(".aac") > 0 || file.indexOf(".flac") > 0;
    }

    @Test
    void test3() {

        int[] numbers = {1, 1,2,-1,2,-1};
        //가장 큰 정수를 리턴해야 한다.
//
//        int[] check = new int[100000];
        int biggestNumber = 0;
//
//        for (int number : numbers) {
//            int absNumber = Math.abs(number);
//            if(check[absNumber] > 0 == 1) {
//                biggestNumber = Math.max(biggestNumber, absNumber);
//            }
//            check[absNumber] = number;
//        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            if( map.containsKey(Math.abs(number))) {
                if(isBothValues(map.get(Math.abs(number)), number)) {
                    biggestNumber = Math.max(biggestNumber, Math.abs(number));
                }
            }
            map.put(Math.abs(number), number);
        }
        System.out.println();
    }

    private boolean isBothValues(int a, int b) {
        if (Math.abs(a) == Math.abs(b)) {
            return (a < 0 && 0 < b) || (b < 0 && 0 < a);
        }
        return false;
    }


}
