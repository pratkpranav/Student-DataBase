

public interface GradeInfo_ {
   enum LetterGrade {
	A, Aminus, B, Bminus, C, Cminus, D, E, F, I; 
   } // I is the place-holder grade for the current semester, where grade has not been earned yet 
   public static int gradepoint(GradeInfo_.LetterGrade grade) {
		if(grade==LetterGrade.A)
		{
			return 10;
		}
		else if(grade==LetterGrade.Aminus)
		{
			return 9;
		}
		else if(grade==LetterGrade.B)
		{
			return 8;
		}
		else if(grade==LetterGrade.Bminus)
		{
			return 7;
		}
		else if(grade==LetterGrade.C)
		{
			return 6;
		}
		else if(grade==LetterGrade.Cminus)
		{
			return 5;
		}
		else if(grade==LetterGrade.D)
		{
			return 4;
		}
		else if(grade==LetterGrade.E)
		{
			return 3;
		}
		else
		{
			return 1;
		}
		
   } // Returns the points earned for each letter grade
}