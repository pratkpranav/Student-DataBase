import java.util.Iterator;
public class Hostel implements Hostel_{
	String hos; 
	Student_ hard ;
	LinkedList<Student_> ll = new LinkedList<Student_>();
	Student ss = new Student(null,null,null,null);
	public Hostel(String Host, Student_ studd)
	{
		hos= Host;
		hard = studd;
		ll.add(ss);
		ll.add(studd);
	}
	
	
	
	public String name()
	{
		return hos;
	}
	public Iterator<Student_> studentList()
	{

     	Iterator<Student_> itr = ll.poss();
     	return itr;
     	
		
	}
}
