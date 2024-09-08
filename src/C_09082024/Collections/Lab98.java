package C_09082024.Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import NotUploaded_17July.Student;


public class Lab98 {
    public static void main(String[] args) {
//        List<Integer> myMarks=new ArrayList<>();
//        myMarks.add(91);
//        myMarks.add(87);
//        myMarks.add(80);
//        Collections.sort(myMarks);
//        System.out.println(myMarks);
Student student=new Student(5,"Smriti");
        Student student2=new Student(4,"Anand");
        Student student3=new Student(6,"Astitva");

        List<Student> students=new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        //Sorting using collection

        Collections.sort(students);

        System.out.println("After sorting");
        Collections.sort(students, new SortByIdAsc());
        System.out.println(students);

    }
}
