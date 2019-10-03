import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) {
        char[] chars = s.toCharArray();
        String hours = ("" + chars[0] + chars[1]);
        int hoursInt = Integer.parseInt(hours);
        if ((chars[8] == 'P') && (hoursInt != 12)) hoursInt += 12;
        if ((chars[8] == 'A') && (hoursInt == 12)) hoursInt = 0;
        
        if (hoursInt < 10) {
            hours = "0" + hoursInt + chars[2] + chars[3] + chars[4] + chars[5] + chars[6] + chars[7];
        }
        else {
            hours = String.valueOf(hoursInt) + chars[2] + chars[3] + chars[4] + chars[5] + chars[6] + chars[7];
        }
        return hours;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
