package chapter5;

public class Singleton {

    private static Singleton mySingleton = null;


    private Singleton(){

    }

    public static Singleton createSingleton(){
        if(mySingleton == null){
            System.out.println("singleton wird erzeugt!");
            mySingleton = new Singleton();
        }else{
            System.out.println("singleton existiert schon!");
        }

        return mySingleton;
    }

}
