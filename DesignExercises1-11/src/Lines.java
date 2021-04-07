import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Lines implements DisneyLand{
	
	int lineName;
	
	Map<Integer, Queue<Integer>> line=new HashMap<>();
	
	//fastPass: 11 and 12, regular: 21, 22, and 23
	public void putToMap(int lineNumber, Queue<Integer> lineQueue) {
		lineQueue=new LinkedList<>();
		line.put(lineNumber, lineQueue);
	}
	
	public Queue<Integer> getQueue(int lineName) {
		return line.get(lineName);
	}
	
	public void add(int lineName, int person) {
		Queue<Integer> thisLine=getQueue(lineName);
		thisLine.add(person);
	}
	
	public int getSize(int lineName) {
		return line.get(lineName).size();
	}
	
	public int shortest(boolean fastPass) {
		if(fastPass) {
			if (getSize(11)<=getSize(12))
				return 11;
			return 12;
		}else { //regular
			if (getSize(21)<=getSize(22) && getSize(21)<=getSize(23)) {
				return 21;
			}else if (getSize(22)<=getSize(21) && getSize(22)<=getSize(23)) {
				return 22;
			}else {
				return 23;
			}
		}
		
	}
}
