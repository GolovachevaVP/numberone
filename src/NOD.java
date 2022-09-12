import java.util.Scanner;

public class NOD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print ("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();

        System.out.print("Наибольший общий делитель: "+getNod(a,b));
    }

    public static int getNod(int a, int b){
        int n=1;
        for (int i =1; i<=(a/2 & b/2); i++){
            if ((a%i==0) & ((b%i)==0)) n=i;
        }
        return n;
    }
}


