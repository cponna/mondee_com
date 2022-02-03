package collections;
import java.util.*;
public class ComparatorDisp {
	
		public static <T> void main(String[] args) {
			ArrayList li = new ArrayList();
			
			li.add(new Student(23,"varun"));
			li.add(new Student(22,"tharun"));
			li.add(new Student(26,"kiran"));
			
		Collections.sort(li);
			Iterator itr1=li.iterator();  
			while(itr1.hasNext()){  
			Student st=(Student)itr1.next();   
				System.out.println(st.age+" "+" "+st.name);
			
			}
			
			}
			

		}

