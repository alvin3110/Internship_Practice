import java.text.*;
import java.util.*;

class Currentdatetime{
    public static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();
        sd.setTimeZone(TimeZone.getTimeZone("IST"));
        System.out.println(sd.format(date));
   }
}