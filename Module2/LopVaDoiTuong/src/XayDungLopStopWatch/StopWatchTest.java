package XayDungLopStopWatch;


import java.util.Arrays;

public class StopWatchTest {
    public static void main(String[] args) {
        int[] array = new int[100000];
        StopWatch count = new StopWatch();
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        System.out.println(Arrays.toString(array));
        int max = array[0];
        count.start();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
        count.end();
        System.out.println(count.getElapsedTime());
    }
}
