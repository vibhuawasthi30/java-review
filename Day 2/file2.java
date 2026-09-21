import java.util.Scanner;

class B{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner(System.in);
       System.out.println("Number:");
       int num1 = scan.nextInt();
       float num2 = (float)num1;
       System.out.println("Number Float: " + num2);
       double num3 = (double)num1;
       System.out.println("Number Double: " + num3);
       int num4 = (int)num2;
       System.out.println("Number Int: " + num4);
    }
}