import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	public static void main(String[] args) {
		Lines l=new Lines();
		
		Queue<Integer> fp1=new LinkedList<>();
		Queue<Integer> fp2=new LinkedList<>();
		Queue<Integer> r1=new LinkedList<>();
		Queue<Integer> r2=new LinkedList<>();
		Queue<Integer> r3=new LinkedList<>();
		
		//fastPass: 11 and 12, regular: 21, 22, and 23
		l.putToMap(11, fp1);
		l.putToMap(12, fp2);
		l.putToMap(21, r1);
		l.putToMap(22, r2);
		l.putToMap(23, r3);
		
		l.add(21, 210);
		l.add(11, 110);
		l.add(21, 211);
		l.add(22, 220);
		l.add(22, 221);
		l.add(11, 111);
		l.add(12, 120);
		
		System.out.println("Line 11: "+l.getSize(11)+" people"); //2
		System.out.println("Line 12: "+l.getSize(12)+" people"); //1
		System.out.println("Line 21: "+l.getSize(21)+" people"); //2
		System.out.println("Line 22: "+l.getSize(22)+" people"); //2
		System.out.println("Line 23: "+l.getSize(23)+" people"); //0
		
		System.out.println("Line 11: "+l.getQueue(11));
		System.out.println("Line 12: "+l.getQueue(12));
		System.out.println("Line 21: "+l.getQueue(21));
		System.out.println("Line 22: "+l.getQueue(22));
		System.out.println("Line 23: "+l.getQueue(23));
		
		System.out.println("Fast Pass: the shortest line is "+l.shortest(true)); //12
		System.out.println("Regular: the shortest line is "+l.shortest(false)); //23
		
	}

}
