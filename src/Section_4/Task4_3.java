package Section_4;

import java.util.Scanner;

public class Task4_3 {
    public static Scanner in = new Scanner(System.in);

    public static String reverse(int a){
        String str = Integer.toString(a);
        char [] ch = str.toCharArray();

        return ch[1] + " "+ch[0];
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Введите двухзначное число");
        num = in.nextInt();

        System.out.println("Вывод");
        System.out.println(reverse(num));
    }
}
