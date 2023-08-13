import java.util.LinkedList;
import java.util.Queue;

class asteroid_collison{
    public static int[] asteroidCollision(int[] asteroids) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < asteroids.length-1; i++) {
            if (asteroids[i+1]<0) {
                if (asteroids[i]-asteroids[i+1]>0) {
                    q.add(asteroids[i]);
                }
                else if(asteroids[i]-asteroids[i+1]<0){
                    q.add(asteroids[i+1]);
                }
                else{
                    continue;
                }
            }
            else{
                q.add(asteroids[i]);
            }
        }
        return asteroids;
    }
    public static void main(String[] args) {
        int [] asteroids = {5,10,-5};
    }
}