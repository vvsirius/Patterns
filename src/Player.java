public class Player {
    private Maze maze;
    private int roomNumber;
    private boolean hasKey;
    Player(Maze maze, int roomNumber){
        this.maze = maze;
        this.roomNumber = roomNumber;
    }
    void goEast(){
        Room room = maze.getRoom(roomNumber);
        if (room.getEast() instanceof Room){
            room = (Room)room.getEast();
            room.enter();
            roomNumber = room.getNumber();
        }
        if (room.getEast() instanceof Door){
            Door door = (Door)room.getEast();
            if (door.isOpen()){
                 room = maze.getRoom(door.toRoom);
                 room.enter();
            }
            else System.out.println("The door is locked!");
        }
    }
    void openEast(){
        if (!hasKey) return;
        Room room = maze.getRoom(roomNumber);
        if (room.getEast() instanceof Door){
            Door door = (Door)room.getEast();
            door.open();
        }
    }
    void printLocation(){
        System.out.println("I am in " + this.roomNumber + " room");
    }
}
