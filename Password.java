import java.util.Random;

import javax.print.DocFlavor.STRING;

public class Password {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String specialcharacter = "<>!@#$%^&*()_+{}[]/*";
        String combination = upper + lower + number + specialcharacter;
        int length = 10;
        // arrays of character
        char[] password = new char[length];

        Random r = new Random();
        for (int i = 0; i < length; i++) {
            password[i] = combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("GENERATE PASSWORD ::" + new String(password));

    }
}
