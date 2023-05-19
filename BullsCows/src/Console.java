
import java.text.SimpleDateFormat;
import java.util.*;

public class Console {
    public static int[] numbers = new int[4];
    public static String strings="";
    public static void main(String[] args) {
    }

    public static void Scan() {
        Scanner scanner=new Scanner(System.in);
        strings=scanner.nextLine();
        char[] arr= strings.toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=Integer.parseInt(String.valueOf(arr[i]));
        }
    }

    public static String answer="";
    public static String answer1="";
    public static void Print1(){

        int[] arr1= CountingBullsAndCows.Counting();
        if (arr1[1]==1){
            answer="1 бык ";
        }
        else if (arr1[1]==0){
           answer="нет быков ";
        }
        else answer=arr1[1]+" быка ";

        if (arr1[0]==1){
            answer1="1 корова\n";
        }
        else if (arr1[0]==0){
            answer1="нет коров\n";
        }
        else {answer1=arr1[0]+" коровы\n";
        }
        System.out.println(answer+answer1);
    }
}
