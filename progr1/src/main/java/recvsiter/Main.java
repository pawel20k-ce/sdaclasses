package recvsiter;

public class Main {

    private static int fibRec(int n) {
        if (n < 3) {
            return 1;

        }
        return fibRec(n - 2) + fibRec(n - 1);

    }

    private static int fibIter(int n) {
        int f1 = 1;
        int f2 = 1;
        int sum = 0;

        if (n < 3)
            return 1;
        for (int i = 2; i < n; i++) {

            sum = f1 + f2;
            f1 = f2;
            f2 = sum;


        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println(fibRec(3));
        System.out.println(fibIter(3));
    }
}
