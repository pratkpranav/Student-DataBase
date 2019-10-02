Introduction:


This assignment belongs to Pratik Pranav, Entry No.- 2018CS10368. The assignment is on implementing LinkedList CLasses and use them to make Directory to store the data of students, the information that are stored in these LinkedLists are name of student, department of student, entryno. of student, hostel of the student and Course-List of the student and then use them to store the information of each student categorized according to hostel, branch etc.


Class Student:

Variable initialized:

Linkedlist<CourseGrade>- This variable stores the coursegrade of students.
String- to store name, entry number, department, hostel. 

functions in interface implemented in class:

name()- There is basically a constructor of Student class which on initialization first takes four string which are name, entryno, department and name of hostel of the concerned student. Each of the student class is basically initialized with string of name, department, entryno and hostel and when the name fuction of student class in called the name function returns the string which stores the name of the student.

entryNo()- This function also uses the input of the contructor and returns the string entryno storing entry number of the student.

hostel()- This function returns the hostel name which is stored in the string while calling the constructor.

department()- This function returns the name of department of the student which is stored while calling the constructor.

cgpa()- This function calculates cgpa of the student. In this function there is an iteraotr which basically iterate over all the course taken by the student and using GradeInfo class returns the int grade of thwe student which is the multipled by the credits and then divided by the total credits and then using string conversion function I converted the function into string and returned that string. NOTE- in cgpa calculation the exact frmula have benn used what is depicted on the webpage that is only ignore the I grades. Also in cgpa calculation E and F grades are taken as O gradepoint as per the function on the internet.

courselist()-I have implemented an extra iterator which run over T in iteraotor<T> apart from the iterator we were told to make. Using this iterator I iterate on courgrad which is a LinkedList consisting of class CourseGrade where we iterate through the grade of all the courses, coursegrade of the student respectively.

Other function apart from given in interface:

Constructor Student- It basically for getting the name of student, department of student, entryno of student and hostel of the class and storing the name in predefined string in the class.



Class Hostel:

Variables Initialized:

Linkedlist<Student> ll: This variable stores the student class.
String- to store name of hostel.

functions in inteerface implemented in class:

name()-There is basically constructor of hostel class which on initialization takes a string which is the name of the hostel and when ever the function is called it returns the same string of the name of the hostel.

studentlist()- It is basically for storage of all the student class of which the student reside in that hostel. This function returns an iterator of the student. The iterator is same as described above which returns Iterator<T> apart from Iterator<Position<T>>.

Other function apart from given in interface:

Constructor Hostel- It takes input of name of the hostel as well as a student and put it in the linkedlist described in it.


Class Courses:

Variable initialized:

Linkedlist<Student>- This basically contains the name of all the student who are enrolled in that courses.
String- This is used to store the course code for a particular course.

functions in interface implemented in class:

name()- This function returns the course code. The string which is returned is basically uses the input taken in constructor of the class. Then the string variable stores the course code of the course and that string is returned when thwe class is called.

studentlist()- This basically returns a iterator of the Linkedlist of student and hence returns an itertor over the students. This iterator basically uses iter<T> class which is overrides the Iterator<T> class.

Other functions apart from given interface:

Constructor Courses- It takes input of the course code of the course and put it in the linkedlist.


Class Dept:

Variable Initialized:

Linkedlist<Student> ss : It stores the name of all the students residing inthat hostel.
String: It stores the name of the department.

function in interface implemented in class:

name()- This function returns the name of the department. There is a string initialised at the start of the class this string is assigned to the name of the department when the constructor is called. This is that string which returns the name of the department.

studentlist()- This basically stores the name of the student studying in that department. This function returns an iterator of the student which are studying in that department.


Class GradeInfo:

Variables Initialized:

Lettergrade garde: It is the type of enum declared in the class.

function in interface implemented in class:

gradepoint()- Same implementation as on webpage. It returns integer value of the gradepoint.

No extra funtion is implemented.


Class iter:

Variables initialized:

Position<T> : It basically stores the node of the Generics.

function in interface implemented in clas:

hasNext()- It just check whether the next element is null or not and returns boolean value.
next()- It returns the next element in the list.

Other function apart from interface:

Constructor iter<T>: It basically takes the input of the node of the present node.


Class LinkedList<T>:

Variable Initialized:

T: It bsically initialized the generics.
Position<T>: It basically initialized the node.

function in interface implemented in class:

add()- It adds the next node to the previous node. It basically updates the present variable initialized in the function and update the next variable.
Positions()- It returns the iterator of the positions of the element present in the linkedlist. In this function we initializes a iterator LinkedListIterator and returns this iterator.
count()- This function returns the no. of element in the linkedlist. There is a integer initialized in the class which is getting incremented every time a new element is added.


Class Position<T>:

Variables T: It basically stores the value to be returned.
Variable Position<T>: It basically stores the node of the linkedlist.

function in interface implemented in class:

value()- It is to return the value at the node. The value present in the node is stored in the variable T and this variable is returned when this function is called.
next()- It is to return the next node of the linkedlist. The node in the linkedlist is stored in the Position<T> and this variable is returned when this function is called.

No extra function is implemented


Class Assignment1:

Class LinkedLIstIterator<T>:

Variables initialised:
Position<T> : This variable is initialised to store the current node of the linkedlist. This variable is called whenever the Position<T> is needed to be used.

function in interface implemented in class:

hasNext()- It is basically for checking whether the linkedlist has next element or not. It basically checks whether the next element is null. This returns the boolean value as true or false.
next()- It returns the next pointer of the element. It basically uses the after() function of the Position<T> class and returns the next pointer of the list.

Extra function implemented:

Constructor()-It gets an head variable and and assigns this variable to the current variable.

function in class Assignment1:

getdata()- This function is used to take input from the files and store it in variables hoss(This is the linked list which consist of all the hostel), doss(This linkedlist consist of all th department), coss(This linkedlist consists of all the courses) all of the are defined globally and are universally accessable. For taking input from the class it uses Buffered File Reader. I have taken input in a string st and using split function have broken the whole line as per there specifications whether they are name of student,department, grade etc. For each input from the student file i make a student objest using the input from the file and arranged them in their hostel and department as per their input. Now after storing all the data  in hoss and doss I have taken second input file that is course file. Similarly iterated over the file and checked for the entryno. of the student provided in the file and then input the course of the given input in the student class of which the entryno matched. And inthis way assigned the coss variable inputs.

answerQueries()- This function takes input from the file studentquery file. Each of the lines in the file is taken input in the form string using Buffered Class File Reader. After taking the inputs as string i have used the split function to split the function where ever there is a space and then divided the input according to their type either they are SHARE, INFO, COURSETITLE and handled them separately. If the input is SHARE and I searched for that entity and if it whether it is hostel, department or courses and then output all of them in lexicographic order using bubble sort excluding the one given in query. If the input is of INFO type I basically check whether it matches with any student entry no. or name. If it matches I simply output them otherwise check next item. If the input is COURSETITLE type i basically check all the courses stored in coss(linkedlist which stores all courses) and output the coursetitle by getting it through student class.

main()- just call the two functions and pass the command line argument to these function.











  

