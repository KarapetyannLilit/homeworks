package homework2;

public class example3 {

    public static void main(String[] args) {
            float array[] = {5, 56, 87, 1, -54, 8, 32, 8, 7, 9, -1};
            float min = array[0];
            int k = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                    i = k;
                }
                System.out.println(k);
            }
    }

}
