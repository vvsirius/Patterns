import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Maze maze = new Maze();
            Player player = new Player(maze, 0);
            Scanner in = new Scanner(System.in);
            while(true){
                System.out.println("What to do?");
                switch(in.next()){
                    case "GE": player.goEast();
                    case "OE": player.openEast();
                }
                player.printLocation();
            }
        }
}
