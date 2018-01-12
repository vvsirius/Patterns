public class Room extends MazePart {
    private MazePart north, east, south, west;
    boolean hasKey;
    final int number;

    Room(int number){
        this.number = number;
    }

    public boolean hasKey() {
        return hasKey;
    }

    public void putKey() {
        hasKey = true;
    }

    public boolean getKey() {
        if (!hasKey){
            System.out.println("No keys here...");
            return false;
        }
        System.out.println("You got the key!");
        hasKey = false;
        return true;
    }

    public MazePart getNorth() {
        return north;
    }

    public void setNorth(MazePart north) {
        this.north = north;
    }

    public MazePart getEast() {
        return east;
    }

    public void setEast(MazePart east) {
        this.east = east;
    }

    public MazePart getSouth() {
        return south;
    }

    public void setSouth(MazePart south) {
        this.south = south;
    }

    public MazePart getWest() {
        return west;
    }

    public void setWest(MazePart west) {
        this.west = west;
    }

    public int getNumber() {
        return number;
    }

    boolean enter()
    {

        System.out.println("Room " + number);
        if (hasKey) {
            hasKey = false;
            return true;
        }
        return false;
    }
}
