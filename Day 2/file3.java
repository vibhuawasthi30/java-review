import java.util.Scanner;

class A
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A: ");
        int a = scan.nextInt();
        System.out.print("B: ");
        int b = scan.nextInt();

        int c = a;
         a = b;
         b = c; 
        
         System.out.println("A: " + a);
         System.out.println("B: " + b);


    }
}