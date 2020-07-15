package homework2;

import java.util.Arrays;
import java.util.Random;

public class example2 {
    public static void main(String[] args) {
       int[] array=new int[1000];
       Random rand=new Random();
       for(int i=0;i<1000;i++)
           array[i]=rand.nextInt(1000)+1;
       System.out.println(Arrays.toString(array));

    }
}
