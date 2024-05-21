public class LA_3 {    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int n = 10;
        int a = 0, b = 1;
        int i = 1;   
        while (i <= n) {
            System.out.print(a + " ");
            int sum = a +b;
            a = b;
            b = sum;
            i++;
        }
    }
} 


