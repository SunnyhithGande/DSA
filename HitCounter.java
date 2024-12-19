import java.util.LinkedList;
import java.util.Queue;

public class HitCounter 
{
    private Queue<Integer> hits;
    public HitCounter() 
    {
        hits = new LinkedList<>();
    }
    public void hit(int timestamp) 
    {
        hits.add(timestamp);
    }
    public int getHits(int timestamp)
     {
        while (!hits.isEmpty() && hits.peek() <= timestamp - 300) 
        {
            hits.poll();
        }
        return hits.size();
    }
    public static void main(String[] args) 
    {
        HitCounter counter = new HitCounter();
        counter.hit(1);
        counter.hit(2);
        counter.hit(300);
        counter.hit(400);
        counter.hit(430);
        counter.hit(500);
        counter.hit(600);
        counter.hit(700);
        counter.hit(800);
        counter.hit(900);
        counter.hit(1000);
        counter.hit(1100);
        System.out.println("Hits at timestamp 300: " + counter.getHits(300)); // Output: 3
        System.out.println("Hits at timestamp 301: " + counter.getHits(301)); // Output: 2

        counter.hit(600);
        System.out.println("Hits at timestamp 600: " + counter.getHits(600)); // Output: 2
    }
}
