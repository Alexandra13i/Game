import java.io.IOException;

public class Check {
    public static void main(String[] args) {}
    public static int counter=1;
    public static String trial="";
    public static void CheckNumber() throws IOException {

        DateOfGame.DateOfGame1();
        GenerateNumber.Generate();
        WorkingWithFile.CreatingFile();
        WorkingWithFile.ReadingFromFile();
        WorkingWithFile.WritingToFile("Game №"+WorkingWithFile.number+" "+DateOfGame.str+" ");
        WorkingWithFile.WritingToFile("Загаданная строка "+GenerateNumber.str+"\n");
        boolean win = false;
        while (!win) {
            if (counter==1){
                trial="попытку";
            }
            else if (counter>=2 && counter<=4){
                trial="попытки";
            }
            else trial="попыток";

            System.out.println("Введите число");
            Console.Scan();
            CountingBullsAndCows.arr= CountingBullsAndCows.Counting();
            if (CountingBullsAndCows.arr[1] == 4) {
                win = true;
                System.out.println("Поздравляю! Вы победили!");
                WorkingWithFile.WritingToFile("Строка была угадана за "+counter +" "+ Check.trial+"\n");
            } else {
                Console.Print1();
                WorkingWithFile.WritingToFile("Запрос "+Console.strings+ " Ответ:");
                WorkingWithFile.WritingToFile(Console.answer+Console.answer1);
                counter++;
            }
        }
    }
}
