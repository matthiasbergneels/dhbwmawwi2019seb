package chapter7;

public class NotEnoughFreeSlots extends Exception{

    private int freeSlotsLeft;

    public NotEnoughFreeSlots(int slotsToBook, int freeSlotsLeft){
        super("Es wurde versucht " + slotsToBook + " Slots zu buchen; freie Slots " + freeSlotsLeft);
        this.freeSlotsLeft = freeSlotsLeft;
    }

    public int getFreeSlotsLeft(){
        return freeSlotsLeft;
    }
}
