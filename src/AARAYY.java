import java.util.Scanner;
public class AARAYY {
    public static void main(String[]args){

        int[] numbers = new int[10];//declares an array of length 10//
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++){
            System.out.print("Enter a value for index" + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nValues entered by the user:");
        for(int num : numbers){
            System.out.println(num);
        }

        scanner.close();

    }
}
