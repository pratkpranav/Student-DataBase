
public class CourseGrade implements CourseGrade_{
	 String s1,s2,s3;
	public CourseGrade( String Coursecode, String Grade , String Coursename)
	{
		
		s1 = Coursecode;
		s2 = Grade;
		s3 = Coursename;
	}
	
	public String coursetitle()
	{
		return s3;
	}
	public String coursenum()
	{
		return s1;
	}
	 public GradeInfo_ grade()
	 {	
			GradeInfo  grad = new GradeInfo(s2);
			GradeInfo_ ff = (GradeInfo_)grad;
		 return ff;
	 }
}
