package Section_2;

public class Task2_10 {

    public static int mul(int a, int b) {
        return a+b;
    }
    public static  int sum (int c, int d){
        return c+d;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        System.out.println(a+" Это первое число  "+b+" Это второе");
        System.out.println(mul(a,b)+ " Это произведение чисел");
        System.out.println(sum(a,b)+" Это сумма чисел");
    }
}
