package zad1;

public class Main {

    public static boolean solution(int T[]) {

        int sum = T[0] + T[T.length - 1];
        for (int i = 1; i < T.length - 1; i++) {

            if (sum == T[i])
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] tab = {3, 2, 8, 5};
        System.out.println(solution(tab));
    }

}
