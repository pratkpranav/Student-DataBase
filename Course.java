import java.util.Iterator;
public class Course implements Course_{
	String cou;
	Student_ sav;
	String coursepp;
	LinkedList<Student_> courseliststudent = new LinkedList<Student_>();
	Student ppoopp = new Student(null,null,null,null);
	public Course(String cour, Student_ studd,String coursep)
	{
		courseliststudent.add(ppoopp);
		cou = cour;
		sav = studd;
		coursepp =coursep;
		courseliststudent.add(studd);
	}
	public String name()
	{
		return cou;
	}
	public Iterator<Student_> studentList()
	{

     	Iterator<Student_> itr = courseliststudent.poss();
     	return itr;
	}
}
