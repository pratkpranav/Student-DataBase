import java.util.Iterator;
public class Dept implements Dept_{
	
	String nam;
	Student_ s;

	LinkedList<Student_> ss = new LinkedList<Student_>();
	Student popp = new Student(null,null,null,null);
	public Dept(String Dep, Student_ studd)
	{
		nam = Dep;
		s=studd;
		
		ss.add(popp);
		ss.add(studd);
	}
	public String name()
	{
		return nam;
	}
	public Iterator<Student_> studentList()
	{

     	Iterator<Student_> itr = ss.poss();
     	return itr;
	}
}
