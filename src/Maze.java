import java.util.HashMap;

public class Maze {
    HashMap<Integer, Room> map = new HashMap<>();
    Room getRoom(int roomNumber){
        return map.get(roomNumber);
    }
    Maze()
    {
        map.put(0, new Room(0));
    }

}
