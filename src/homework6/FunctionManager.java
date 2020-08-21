package homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static jdk.nashorn.internal.objects.NativeMath.max;
import static jdk.nashorn.internal.runtime.ScriptObject.toPropertyDescriptor;

public class FunctionManager {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(
                Arrays.asList(10,5,7,4,23,55,9,21,74,12,6655,1,27,56,852));

        //1
        for (int i : myNumbers)
            System.out.println(i);
        //2
        Integer max = Collections.max(myNumbers);
          System.out.println("Max is "+max);
          //3
        Integer min =Collections.min(myNumbers);
        System.out.println("Min is "+min);
        //4
        int iMax= myNumbers.indexOf(Collections.max(myNumbers));
        System.out.println("Index of Max is "+iMax);
        //5
        int iMin= myNumbers.indexOf(Collections.min(myNumbers));
        System.out.println("Index of Min is "+iMin);
        //6
        Collections.sort(myNumbers);
        System.out.println("Smallest to largest "+myNumbers);
        //7
        Collections.sort(myNumbers,Collections.reverseOrder());
        System.out.println("Largest to smallest "+myNumbers);
        //8
        for (int i = 0; i < myNumbers.size(); i++)
        if(myNumbers.get(i)%3==0){
            Collections.sort(myNumbers,Collections.reverseOrder());
            System.out.println("Divisible by 3 "+myNumbers.get(i));
            // 4 hatov a berum chem haskanum et pahy
        }
        //9
        /*ArrayList<String> myString= new ArrayList<>(
        Arrays.asList("Masha","Gor","Aren","Arev","Emili","Elen"));
        System.out.println(myString);
        boolean n=myString.contains("a");
        if(n=true) {
            System.out.println(myString);
        }*/
        //10
        /*Collections.sort(myString);
        System.out.println(myString);*/
        //11
        //ArrayList<Student> students=new ArrayList<Student>();



    }
}
