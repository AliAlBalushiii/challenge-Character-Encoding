import java.util.Scanner;

public class hasher {

    public static void main(String[] args) {
        System.out.println("Enter the hash in form 7A 2B 0D ...etc: ");
        Scanner sc = new Scanner(System.in);
        String hex = sc.nextLine();
        String finalResult ="";
        char[] chars = hex.toCharArray();
        for (int i = 0; i < chars.length; i+=3) {
            String temp = ""+chars[i] + "" + chars[i+1];
            char ch = (char)Integer.parseInt(temp, 16);
            finalResult += ch;

        }
        System.out.println(finalResult);
    }
}