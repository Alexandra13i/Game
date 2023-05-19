import java.text.SimpleDateFormat;
import java.util.Date;

public class DateOfGame {

        public static String str= "";
        public static void main(String[] args) {}
        public static void DateOfGame1(){
            Date dateNow = new Date();
            SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            str= formatForDateNow.format(dateNow);
        }
}
