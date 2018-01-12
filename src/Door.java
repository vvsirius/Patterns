public class Door extends MazePart {
    int toRoom;
    boolean isOpen;

    public int getToRoom() {
        return toRoom;
    }

    public void setToRoom(int toRoom) {
        this.toRoom = toRoom;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open(boolean open) {
        System.out.println("Door is opened");
        isOpen = open;
    }

    void open(){}
    {
        isOpen = true;
    }
    void enter()
    {

        System.out.println("Door to " + toRoom);
    }

    public static class Player {
    }
}
