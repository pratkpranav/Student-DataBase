import java.util.Iterator;

public class Student implements Student_
{	
	public String name1,entryno1,hostel1,department1;
	CourseGrade prat = new CourseGrade(null,null,null);
	LinkedList<CourseGrade_> courgrad = new LinkedList<CourseGrade_>();
	
	public Student(String s1, String s2, String s3, String s4)
	{
		name1 = s1;
		entryno1 = s2;
		hostel1 = s3;
		department1 = s4;
		courgrad.add(prat);
	}
	public String name()
	{
		return name1;
	}
	public String entryNo()
	{
		return entryno1;
	}
	public String hostel()
	{
		return hostel1;
	}
	public String department()
	{
		return department1;
	}
	
	public String completedCredits()
	{	
		Iterator<CourseGrade_> iit = courgrad.poss();
		int p=0;
		while(iit.hasNext())
		{
			CourseGrade pp = (CourseGrade)iit.next();
			String s= pp.s2;
			if(!s.equals("I"))
			{	
				p++;
			}
			
		}
		String s = Integer.toString(3*p);
		return s;
	}
	public String cgpa()
	{
		float cgpaall=0;
		Iterator<CourseGrade_> iit = courgrad.poss();
		float p=0;
		while(iit.hasNext())
		{
			CourseGrade_ ppo = iit.next();

			//System.out.println(ppo.s2 + " " + ppo.s2.equals("I"));
			//System.out.println(ppo.coursenum());
			if(ppo.coursetitle()!=null)
			{
				GradeInfo something = (GradeInfo)ppo.grade();
				int fin = something.gradepoint(something.grade);
				
				cgpaall =cgpaall+fin*3;
				
					
				
			}
				
		}
		p = Integer.parseInt(completedCredits());
		float finresult;
		if(p!=0)
		{	
			finresult = cgpaall/p;
		}
		else
		{
			finresult = 0;
		}
		return String.format("%.2f", finresult);
		
	}
	public Iterator<CourseGrade_> courseList()
	{
		Iterator<CourseGrade_> itr = courgrad.poss();
     	return itr;
	}
}