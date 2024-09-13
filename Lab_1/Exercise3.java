import java.util.Scanner;

public class Exercise3 {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        remainder();
    }

    static void remainder(){
        System.out.print("Nhap so thu nhat: ");
        double so1 = sc.nextDouble();
        System.out.print("Nhap so thu 2: ");
        double so2 = sc.nextDouble();
        double division = so1 % so2;
        System.out.println("remainder of division: "+ division);
    }
}
