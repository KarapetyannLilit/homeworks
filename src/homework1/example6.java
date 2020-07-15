package homework1;

public class example6 {
        static void maxProduct(int array[], int n) {
            if (n < 2)
            {
                System.out.println("No pairs exists");
                return;
            }

            // Initialize max product pair
            int a = array[0], b = array[1];

            // Traverse through every possible pair
            // and keep track of max product
            for (int i = 0; i < n; i++)
                for (int j = i + 1; j < n; j++)
                    if (array[i] * array[j] > a * b){
                        a = array[i];
                        b = array[j];
                    }

            System.out.println("Max product pair is {" +
                    a + ", " + b + "}");
        }


        public static void main(String[] args)
        {
            int array[] = {1,4,3,6,5,78,12,46,798,7,0};
            int n = array.length;
            maxProduct(array, n);

        }
}

