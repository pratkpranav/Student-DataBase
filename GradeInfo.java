
public class GradeInfo implements GradeInfo_
{
	 public enum LetterGrade
	 {
			A, Aminus, B, Bminus, C, Cminus, D, E, F, I; 
		   }
	LetterGrade grade;
	
	public GradeInfo(String s)
	{	
		
		grade = LetterGrade.valueOf(s);
	}

	
	public int gradepoint(GradeInfo.LetterGrade grader)
	{
		if(grader==LetterGrade.A)
		{
			return 10;
		}
		else if(grader==LetterGrade.Aminus)
		{
			return 9;
		}
		else if(grader==LetterGrade.B)
		{
			return 8;
		}
		else if(grader==LetterGrade.Bminus)
		{
			return 7;
		}
		else if(grader==LetterGrade.C)
		{
			return 6;
		}
		else if(grader==LetterGrade.Cminus)
		{
			return 5;
		}
		else if(grader==LetterGrade.D)
		{
			return 4;
		}
		else if(grader==LetterGrade.E)
		{
			return 0;
		}
		else if(grader==LetterGrade.F)
		{
			return 0;
		}
		else
		{
			return 0;
		}
			
		
	}
}
