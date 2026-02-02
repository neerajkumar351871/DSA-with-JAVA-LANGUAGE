import java.util.*;

public class ShortestPath {

    public static float ShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // North
            if (dir == 'N') {
                y++;
            } //south
            else if (dir == 'S') { 
                y--;
            } //West  
            else if (dir == 'W') {
                x--;
            } //East
            else {
                x++;
            }
         
        }
       int xsqr= x*x;
       int ysqr= y*y;
        return (float)Math.sqrt(xsqr + ysqr);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
}
