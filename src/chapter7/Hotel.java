package chapter7;

public class Hotel extends Object implements Bookable{

    private int roomCount;
    private int bookedRoomCount;

    public Hotel(int roomCount){
        this.roomCount = roomCount;
        bookedRoomCount = 0;
    }

    protected void cleanRooms(){
        System.out.println("Säubern aller Zimmer ...");
    }

    @Override
    public int freeSlots() {
        return roomCount - bookedRoomCount;
    }

    @Override
    public void book(int slots) throws NotEnoughFreeSlots{
        if(freeSlots() >= slots){
            bookedRoomCount += slots;
        }else{
            throw new NotEnoughFreeSlots(slots, freeSlots());
        }
    }
}
