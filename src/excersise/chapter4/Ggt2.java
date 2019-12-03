package excersise.chapter4;

public class Ggt2 {
    public static void main(String[] args) {

        int ggt1 = 256;
        int ggt2 = 86;


        while(ggt1 != ggt2){

            // int erg = (ggt1 > ggt2) ? (ggt1 -= ggt2) : (ggt2 -= ggt1);

            if(ggt1 > ggt2){
                ggt1 = ggt1 - ggt2; // ggt1 -= ggt2;
            }else{
                ggt2 = ggt2 - ggt1; // ggt2 -= ggt2;
            }
        }

        System.out.println("Der GGT ist: " + ggt1);
    }
}
