package excersise.chapter4;

public class FakultaetRecursive {

    public static void main(String[] args) {
        System.out.println(fak(5));
    }

    static int fak(int  n){
        if(n > 0){
            return n * fak(n-1);
        }

        return 1;

        /*if(n > 1){
            return n * fak(n-1);
        } if(n == 1){
            return 1;
        }else{
            return 0;
        }

         */


    }
}
