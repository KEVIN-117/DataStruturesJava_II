import java.util.Calendar;
import java.util.Date;

public class sumarData {
    public static void main(String[] args) {
        /*String names = "2.156-1.381-1.205-1.214-1.265-1.192-1.267-1.236-1.146-1.725";

        String[] array = names.split("-");
        double suma = 0;
        for (int i = 0; i <array.length ; i++) {
            suma +=  Double.parseDouble(array[i]);
        }
        System.out.println(suma/array.length);*/
        String birthDay = "17/12/2001";
        String[] listAge = birthDay.split("/");
        Date yearActuality = Calendar.getInstance().getTime();
        String[] year = String.valueOf(yearActuality).split(" ");
        int yearsOld = Integer.parseInt(String.valueOf(Integer.parseInt(year[year.length-1])-Integer.parseInt(listAge[listAge.length-1])));
        System.out.println(yearsOld);
    }
}
