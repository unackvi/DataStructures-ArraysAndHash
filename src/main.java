import java.util.Iterator;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> linky = new LinkedList<String>();
		linky.add("Rob");
		linky.add("Alex");
		linky.add("Jose");
		linky.add("John");
		linky.add("Alex2");
		
		System.out.println(linky.getFirst());
		
		Iterator it = linky.iterator();
		while (it.hasNext()) {
			if((String) it.next() == "Alex") {
				System.out.println("Alex is found");
				break;
			} else {
				System.out.println("Alex is not a member!");
				continue;
			}
		}
		
		

	}

}
