import java.util.Iterator;

public interface Course_ { // Entities Classes Hostel, Dept, and Course all have this functionality. 
   public String name();                 // Returns this  enti
   public Iterator<Student_> studentList();        // Returns all students of this entity
}