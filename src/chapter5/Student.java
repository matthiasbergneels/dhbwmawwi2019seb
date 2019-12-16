package chapter5;

public class Student {

    private int matrikelNo;
    private String familyname;
    private String name;


    public Student(int matrikelNo, String familyname, String name){
        this.matrikelNo = matrikelNo;
        this.familyname = familyname;
        this.name = name;
    }


    public void drink(float amount){
        // TODO: was alles beim trinken so passiert
        System.out.println(name + " trinkt " + amount + "ml");
    }

    public void drink(float amount, float alcoholInPercentage){
        this.drink(amount);
        System.out.println(" und wird betrunken");
    }

    protected void drink(float amount, double poissonInPercentage){
        this.drink(amount);
        System.out.println(" und stirbt");
    }
}
