

public class NOD {
    public static void main(String[] args) {
        System.out.println("Наибольший общий делитель: " + getNod2(18, 35));
        System.out.println("Наибольший общий делитель: " + getNod2(14159572, 63967072));
        System.out.println("Наибольший общий делитель: " + getNod(14159572, 63967072));
    }

    public static int getNod(int a, int b) {
        int n = 1;

        for (int i = 1; (i <= a / 2) && (i <= b / 2); i++) {
            if ((a % i == 0) && ((b % i) == 0)) n = i;
        }
        return n;
    }

    public static int getNod2(int a, int b) {
        int n = Math.min(a, b);
        int m = Math.max(a, b);
        int result = 1;
        for (int i = 1; i <= n/2; i++) {
            if ((m % (n / i) == 0) && (n % (n / i) == 0)) {
                result = n / i;
                break;
            }
        }
        return result;
    }
}


