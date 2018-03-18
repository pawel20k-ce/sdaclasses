package zad2;

public class Main {
    private static int binConvert(int n) {
        int count = 0, max = 0, b = 0;

        while (n > 0) {
            int bit = n % 2;

            if (bit == 0) {

                if (b == 1) {

                    count++;
                }
            } else {
                b = 1;

                if (count > max) {
                    max = count;
                }
                count = 0;

            }
            n = n / 2;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(binConvert(1041));
    }

}
