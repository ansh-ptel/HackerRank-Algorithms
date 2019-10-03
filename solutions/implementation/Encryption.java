package implementation;

import java.util.Scanner;

public class Encryption {
    static String encryption(String s) {
        String str = s.replaceAll(" ", "");
        char[] srr = str.toCharArray();
        int x = (int) Math.sqrt(srr.length);
        int y = (int) Math.ceil(Math.sqrt(srr.length));
        if (x * y < srr.length) {
            x = y;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x && i + y * j < srr.length; j++) {
                sb.append(srr[i + y * j]);
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();
        String result = encryption(s);
        System.out.println(result);
        scanner.close();
    }
}
