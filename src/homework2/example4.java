package homework2;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        int year;
        Scanner num = new Scanner(System.in);
        year = num.nextInt();
       int century;
       if(year%100==0){
           century=year/100;

       }
       else
           century=year/100+1;
        System.out.println(century);

    }
}
