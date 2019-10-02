
import java.util.Iterator;
import java.io.*; 








class LinkedListIterator<T> implements Iterator<Position_<T>>
{
		
	public Position_<T> current;
	public LinkedListIterator(Position_<T> head)
	{
		current = head;
 	}
	public boolean hasNext()
	{
		return current != null ;
	}
	public Position_<T> next()
	{		
		Position_<T> poss = current;
		current = current.after();
		return poss;
	}
	
} 




public class Assignment1
{

	static	LinkedList<Student_> Stud = new LinkedList<Student_>();

	static LinkedList<Hostel> hoss = new LinkedList<Hostel>();

	static LinkedList<Dept> doss = new LinkedList<Dept>();

static	LinkedList<Course> coss = new LinkedList<Course>();
	private static void getdata(String files1,String files2) throws Exception
	{
		File file = new File(files1);
		BufferedReader br2 = new BufferedReader(new FileReader(file)); 
		String st2;
		st2 = br2.readLine();
		String[] somet = st2.split(" ",4);
    		String s1= somet[0];
  			String s2= somet[1];
  			String s3= somet[2];
  			String s4= somet[3];
  			Student stude = new Student(s2,s1,s4,s3);

  		/*	String s911= "flush";
  				String s1011= "flush";
  				String s1111= "flush";
  				String s1211= "flush";
  				Student studen = new Student(s1011,s1111,s1211,s911);
  				Stud.add(studen);*/
  			Stud.init(stude,null);
    		
    	while ((st2 = br2.readLine()) != null)
    	{	
    		String[] someth = st2.split(" ",4);
    		String s5= someth[0];
  			String s6= someth[1];
  			String s7= someth[2];
  			String s8= someth[3];
  			Student stude1 = new Student(s6,s5,s8,s7);
  			Stud.add(stude1);
    		
     	}

     	Iterator<Position_<Student_>> itr = Stud.positions();

     	Position<Student_> firststudentpos =(Position<Student_>) itr.next();
     	Student_ firststudent = firststudentpos.value();
		Hostel host =  new Hostel(firststudent.hostel(),firststudent);
	
		hoss.init(host,null);

		Dept dep = new Dept(firststudent.department(),firststudent);
		doss.init(dep,null);
		
		
		while(itr.hasNext())
		{		
				
				Position<Student_> po =(Position<Student_>) itr.next();
				Student_ i= po.value();

				
				int hostelcheck=0;
				Iterator<Position_<Hostel>> itr1 = hoss.positions();
				while(itr1.hasNext())
				{
					Position<Hostel> ph = (Position<Hostel>)itr1.next();
					Hostel h = ph.value();
					
					if(i.hostel().equals(h.name()))
					{
						h.ll.add(i);
						hostelcheck=1;
						break;
					}
					

				}
				if(hostelcheck==0)
				{
					Hostel hocheck = new Hostel(i.hostel(),i);

					hoss.add(hocheck);
				}
				
				
				Iterator<Position_<Dept>> itr2 = doss.positions();
				int deptcheck =0;
				while(itr2.hasNext())
				{
					Position<Dept> dh = (Position<Dept>)itr2.next();
					Dept hd = dh.value();
					if(i.department().equals(hd.name()))
					{
						hd.ss.add(i);
						deptcheck=1;
						break;
					}
					
					
				}
				if(deptcheck==0)
				{
					Dept docheck = new Dept(i.department(),i);
					doss.add(docheck);
				}
				
				
				
			
			

		}
		br2.close();
	
		File file1 = new File(files2);
		BufferedReader br1 = new BufferedReader(new FileReader(file1)); 
		String st1;
		st1 = br1.readLine();
		String [] pp = st1.split(" ",4);
		String s9 = pp[0];
		String s10 = pp[1];
		String s11 = pp[2];
		String s12 = pp[3];
		Student_ fins = null;
		
		Iterator<Position_<Student_>> checkentry =  Stud.positions();
		while(checkentry.hasNext())
		{
			Position<Student_> checkStudent = (Position<Student_>)checkentry.next();
			Student checkstudententry =(Student) checkStudent.value();
			if(checkstudententry.entryNo().equals(s9))
			{	
				fins = checkstudententry;
				CourseGrade ccd = new CourseGrade(s10,s11,s12);
				checkstudententry.courgrad.add(ccd);
				}
		}
		Course temp = new Course(s10,fins,s12);
		coss.init(temp,null);
		
		
		while((st1 = br1.readLine()) != null)
		{
			String[] por = st1.split(" ", 4); 
			String s91 = por[0];
			String s101 = por[1];
			String s111 = por[2];
			String s121 = por[3];
			
			
			Iterator<Position_<Student_>> checkentry1 =  Stud.positions();
			while(checkentry1.hasNext())
			{
				Position<Student_> checkStudent1 = (Position<Student_>)checkentry1.next();
				Student checkstudententry1 = (Student)checkStudent1.value();
				if(checkstudententry1.entryNo().equals(s91))
				{
					Iterator<Position_<Course>> iitc = coss.positions();
					int coursecheck =0;
					while(iitc.hasNext())
					{
						Position<Course> dc = (Position<Course>)iitc.next();
						Course hc = dc.value();
						
						if(s101.equals(hc.name()))
						{
							CourseGrade cdo = new CourseGrade(s101,s111,s121);
							checkstudententry1.courgrad.add(cdo);
							hc.courseliststudent.add(checkstudententry1);
							coursecheck=1;
							break;
						}
						
					}
					if(coursecheck==0)
					{
						CourseGrade pds = new CourseGrade(s101,s111,s121);
						checkstudententry1.courgrad.add(pds);
						Course cocheck = new Course(s101,checkstudententry1,s121);
						coss.add(cocheck);
					}
					
 				}
			}
			
			
		}
		br1.close();
	}
	private static void  answerQueries(String files3) throws Exception
	{

		LinkedList<String> finalresult= new LinkedList<String>();
		File file2 = new File(files3);
		BufferedReader br = new BufferedReader(new FileReader(file2)); 
		String st;
		while((st = br.readLine()) != null)
		{
			String [] str = st.split(" ",2);
			String check = str[0];
			
			if(check.equals("SHARE"))
			{
				String [] str1 = str[1].split(" " , 2);

				String  share1=str1[0],share2=str1[1];
				
				
				Iterator<Position_<Course>> ittt = coss.positions();
				while(ittt.hasNext())
				{
					Position<Course> sharecp = (Position<Course>)ittt.next();
					Course sharec = sharecp.value();
					//System.out.println(sharec.name()+ " " + share2);
					if(sharec.name().equals(share2))
					{	
						Iterator<Student_> ittts = sharec.courseliststudent.poss();

						String[] sorts = new String[sharec.courseliststudent.count()-1];
						int summer=0;
						while(ittts.hasNext())
						{
							Student_ sharecp1 = ittts.next();
							sorts[summer]=sharecp1.entryNo();
							summer++;			
						}
						String temp3;
						String finalres =("");
						int pingpong =0;
						  for (int j = 0; j < sorts.length ; j++) {
						         for (int k = j + 1; k < sorts.length; k++) {
						            // comparing strings
						            if (sorts[k].compareTo(sorts[j]) < 0) {
						               temp3 = sorts[j];
						               sorts[j] = sorts[k];
						               sorts[k] = temp3;
						            }
						         }
						         if(!sorts[j].equals(share1))
						         {
						        	 finalres = finalres.concat(sorts[j]);
						        	 if((j!=sorts.length-1 || pingpong== 0) && (j!=sorts.length-1 || j==sorts.length-2))
						        	 {
						        		 finalres = finalres.concat(" ");
						        	 
						        	 }
						        	 else
						        	 {
						        		 pingpong =1;
						        	 }
						         }
						         
						         
						      }
						  finalresult.add(finalres);

						   
						
					}
				}
				Iterator<Position_<Hostel>> itth = hoss.positions();
				while(itth.hasNext())
				{
					Position<Hostel> sharehp = (Position<Hostel>)itth.next();
					Hostel shareh = sharehp.value();
					if(shareh.name().equals(share2))
					{
						Iterator<Student_> itths = shareh.ll.poss();
						String[] sorth = new String[shareh.ll.count()-1];
						int hummer =0;
						while(itths.hasNext())
						{
							Student_ sharehp1 = itths.next();
							sorth[hummer]=sharehp1.entryNo();
							hummer++;
						}
						String finalres=("");
						String temp4;
						int pingpong =0;
						  for (int j = 0; j < sorth.length; j++) {
						         for (int i = j + 1; i < sorth.length; i++) {
						            // comparing strings
						            if (sorth[i].compareTo(sorth[j]) < 0) {
						               temp4 = sorth[j];
						               sorth[j] = sorth[i];
						               sorth[i] = temp4;
						            }
						         }

						         if(!sorth[j].equals(share1))
						         {
						        	 finalres = finalres.concat(sorth[j]);
						        	 if((j!=sorth.length-1 || pingpong== 0) && (j!=sorth.length-1 || j==sorth.length-2))
						        	 {finalres = finalres.concat(" ");
						        	 
						        	 }
						        	 else
						        	 {
						        		 pingpong =1;
						        	 }
						         }
						         
						      }
						  	 finalresult.add(finalres);
						  
						
					
					}
				}
				Iterator<Position_<Dept>> ittd = doss.positions();
				while(ittd.hasNext())
				{
					Position<Dept> sharedp = (Position<Dept>)ittd.next();
					Dept shared  = sharedp.value();
					if(shared.name().equals(share2))
					{
						Iterator<Student_> ittds = shared.ss.poss();
						String [] sortd = new String[shared.ss.count()-1];
						int dummer =0;
						while(ittds.hasNext())
						{
							Student_ sharedp1 = ittds.next();
						
							sortd[dummer] = sharedp1.entryNo();
							dummer++;		
						}
						String temp5,finalres=("");
						int pingpong=0;
						  for (int j = 0; j < sortd.length; j++) {
						         for (int i = j + 1; i < sortd.length; i++) {
						            // comparing strings
						        	// System.out.println(sortd[i]+ " " + i + " " + sortd[j]);
						            if (sortd[i].compareTo(sortd[j]) < 0) {
						               temp5 = sortd[j];
						               sortd[j] = sortd[i];
						               sortd[i] = temp5;
						            }
							         
						         }
						         

						            if(!sortd[j].equals(share1))
							         {
							        	 finalres = finalres.concat(sortd[j]);
							        	 if((j!=sortd.length-1 || pingpong== 0) && (j!=sortd.length-1 || j==sortd.length-2))
							        	 {finalres = finalres.concat(" ");
							        	 
							        	 }
							         }
						            else
						            {
						            	pingpong =1;
						            }
						      }
						  		finalresult.add(finalres);
						   
						
							
					}
					
				}
				
				
				
			}
			if(check.equals("COURSETITLE"))
			{
				String ct= str[1];
				
				Iterator<Position_<Course>> itrcourse = coss.positions();
				while(itrcourse.hasNext())
				{	
					Position<Course> ccd = (Position<Course>)itrcourse.next();
					Course cc = ccd.value();
					if(cc.name().equals(ct))
					{
						finalresult.add(cc.coursepp);
					}
					
				}
				
			}
			if(check.equals("INFO"))
			{
				String checker=str[1];	
				
				
				Iterator<Position_<Student_>> itrsc = Stud.positions();
				while(itrsc.hasNext())
				{
					Position<Student_> pp1 = (Position<Student_>)itrsc.next();
					Student ss =(Student) pp1.value();
					if(ss.entryNo().equals(checker) ||ss.name().contentEquals(checker))
					{
						String finalres= ("") ;
						finalres = finalres.concat(ss.entryNo());
						finalres = finalres.concat(" ");
						finalres = finalres.concat(ss.name());
						finalres = finalres.concat(" ");
						finalres = finalres.concat(ss.department());
						finalres= finalres.concat(" ");
						finalres=finalres.concat(ss.hostel());
						finalres=finalres.concat(" ");
						finalres=finalres.concat(ss.cgpa());
						String [][] arr = new String[ss.courgrad.count()-1][2];
						int countvar=0;
							Iterator<CourseGrade_> itery = ss.courseList();
							while(itery.hasNext())
							{
								CourseGrade cgi = (CourseGrade)itery.next();
								arr[countvar][0]= cgi.coursenum();
								arr[countvar][1]= cgi.s2;
								countvar++;
							}
							String temp1,temp2;
							for (int j = 0; j < arr.length; j++)
							{
						         for (int i = j + 1; i < arr.length; i++)
						         {
						           
						            if (arr[i][0].compareTo(arr[j][0]) < 0) 
						            {
						               temp1 = arr[j][0];
						               arr[j][0] = arr[i][0];
						               arr[i][0] = temp1;

						               temp2 = arr[j][1];
						               arr[j][1] = arr[i][1];
						               arr[i][1] = temp2;
						            }
						         }
						      }
							for(int p=0 ;p<arr.length; p++)
							{

								finalres=finalres.concat(" ");
								finalres=finalres.concat(arr[p][0]);
								finalres=finalres.concat(" ");
								finalres=finalres.concat(arr[p][1]);
								
							}
							finalresult.add(finalres);
						
						

					}
				}
			}
			
			
		}
		Iterator<Position_<String>> iitsp22 =  finalresult.positions();
		while(iitsp22.hasNext())
		{	
			Position<String> res=(Position<String>) iitsp22.next();
			System.out.println(res.value());
		}
		br.close();

	}
	
	public static void main (String[] args) throws Exception
	{	
		
		getdata(args[0],args[1]);
		answerQueries(args[2]);
}


	}
	




