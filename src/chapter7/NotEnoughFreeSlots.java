package chapter7;

public class NotEnoughFreeSlots extends Exception{

    public NotEnoughFreeSlots(int slotsToBook, int freeSlotsLeft){
        super("Es wurde versucht " + slotsToBook + " Slots zu buchen; freie Slots " + freeSlotsLeft);
    }
}
