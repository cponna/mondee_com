package collections;

public class NameComparator {
	
	//public class NameComparator implements  Comparator{

		
		//@Override
		public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			
			return s2.name.compareTo(s1.name);
		}

	//}


}
