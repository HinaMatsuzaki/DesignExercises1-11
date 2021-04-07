import java.util.Queue;

public interface DisneyLand {
	
	public void putToMap(int lineNumber, Queue<Integer> lineQueue);
	
	public Queue<Integer> getQueue(int lineName);
	
	public void add(int person, int lineName);
	
	public int getSize(int key);
	
	public int shortest(boolean fastPass);
}
