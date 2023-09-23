import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String result = "";
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        if(n % 2 == 1){
            result = "Weird";
        }if(n % 2 == 0){
            for(int i = 2; i <= 5; i++){
                if(n == i){
                    result = "Not Weird";
                }
            }
            for(int i = 6; i <= 20; i++){
                if(n == i){
                    result = "Weird";
                }
            }
            if(n > 20){
                result = "Not Weird";
            }
        }
        System.out.println(result);
    }
}
