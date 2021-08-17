package MainPack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        System.out.println(randomPasswordGenerator());
    }

    private static String randomPasswordGenerator() {
        Random random = new Random();
        String Letters = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        String Special = "!@#$%^&*(){}[]/*-+/.,<>?`~";
        System.out.print("Please type the number of numbers you want in your password: ");
        Scanner scanner = new Scanner(System.in);
        String numbinput = scanner.nextLine();
        int numbers = Integer.parseInt(numbinput);
        System.out.print("Please type the number of letters you want in your password: ");
        String letterinput = scanner.nextLine();
        int letters = Integer.parseInt(letterinput);
        System.out.print("Please type the number of symbols you want in your password: ");
        String symbolinput = scanner.nextLine();
        int symbols = Integer.parseInt(symbolinput);
        ArrayList<String> FinalList = new ArrayList<String>();
        for(int i = 0; i < numbers; i++){
            String intt = Integer.toString(random.nextInt(9));
            FinalList.add(intt);
        }
        for(int i = 0; i < letters; i++){
            int randomInt = random.nextInt(Letters.length());
            char randomChar = Letters.charAt(randomInt);
            FinalList.add(Character.toString(randomChar));
        }
        for(int i = 0; i < symbols; i++){
            int randomInt = random.nextInt(Special.length());
            char randomChar = Special.charAt(randomInt);
            FinalList.add(Character.toString(randomChar));
        }
        String returned = null;
        for(int i = 0; i < FinalList.size(); i++){
            returned = returned + FinalList.get(i);
        }
        return "The password is: " + returned;
    }
}