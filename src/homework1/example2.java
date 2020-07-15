package homework1;

import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {
            int[] array = {12, 54, -8, 78, 264, 0, -789,};
            int min = array[0];
            int max = array[0];
            char W='0';


            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("A or B?: ");
            String phrase1 = sc.next();

            if (phrase1 == String.valueOf('A')){
                System.out.println("Minimum = " + min);
            }

            if (phrase1 == String.valueOf('B')){
                System.out.println("Maximum = " + max);
            }
            else {
                System.out.println("Minimum = " + min);
                System.out.println("Maximum = " + max);
            }

            //  Scanner num= new Scanner(System.in);
            // W = num.nextLine();

            //System.out.println("Minimum = " + min);
            //System.out.println("Maximum = " + max);
        }
    }
