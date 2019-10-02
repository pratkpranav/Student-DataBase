import java.util.Iterator;


interface Hostel_ { // Entities Classes Hostel, Dept, and Course all have this functionality. 
   public String name();                 // Returns this  entit
   public Iterator<Student_> studentList();        // Returns all students of this entity
}