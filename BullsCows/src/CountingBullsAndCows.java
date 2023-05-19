public class CountingBullsAndCows {
    public static void main(String[] args) {}
    public static int[] arr = new int[2];
    public static int[] Counting(){

        int cow = 0;
        int bull = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (GenerateNumber.numbers[i] == Console.numbers[j]) {
                if (i == j) bull++;
                else cow++;
                }
            }
        }
        arr[0] = cow;
        arr[1] = bull;
        return arr;
    }
}
