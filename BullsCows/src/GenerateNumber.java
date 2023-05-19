import java.util.Random;

public class GenerateNumber {
    public static int[] numbers = new int[4];
    public static String str="";
    public static void main(String[] args) {
        Generate();
    }
    public static void Generate() {
        Random random = new Random();
        int rand = random.nextInt(10);
        for (int i = 0; i < 4; i++) {
            while (!checkOnRepeat(numbers, rand))
                rand = random.nextInt(10);
            numbers[i] = rand;
            rand = random.nextInt(10);
        }

        for (int i = 0; i <numbers.length; i++) {
            String[] strings = new String[4];
            strings[i] = String.valueOf(numbers[i]);
            str += strings[i];
        }
        System.out.println(str);
    }

    public static boolean checkOnRepeat(int[] num, int rand) {
        for (int i : num)
            if (i == rand)
                return false;

        return true;
    }
}


