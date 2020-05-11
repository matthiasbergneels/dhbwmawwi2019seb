package chapter7;

public class Hotel implements Bookable{

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
    public boolean book(int slots) {
        if(freeSlots() >= slots){
            bookedRoomCount += slots;
            return true;
        }else{
            return false;
        }
    }
}
