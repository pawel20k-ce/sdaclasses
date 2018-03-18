package permcheck;

public class Main {
    public int solution(int[] A) {

        int maxvalue=A[0];
        for(int i=0; i < A.length;i++){
            if (A[i]>maxvalue)
                maxvalue=A[i];

        }
        if (maxvalue>A.length){
            return 0;

        }




        return 1;
    }

    public static void main(String[] args) {

    }
}
