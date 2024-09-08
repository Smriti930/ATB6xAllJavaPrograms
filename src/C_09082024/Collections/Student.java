package C_09082024.Collections;

import java.util.Comparator;
import static java.lang.CharSequence.compare;
//sort in ascending by id
class SortByIdAsc implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getId(),o2.getId());
    }
}
////sort in descending order by id
class SortByIdDsc implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getId(),o1.getId());
    }
}
////sort by name of
class SortByName1 implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class SortByNameDesc implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
    return o2.getName().compareTo(o1.getName());
}
}



public class Student implements Comparable<Student>{
    public Student(Integer id,String name)
    {
        this.id=id;
    this.name=name;
    }

    Integer id;
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +"id="  +id+ ", name='" +name + '\'' +'}';
    }
//    @Override
//    public int compareTo(Student o) {
//        return Integer.compare(this.id,o.id);
//    }
//using comparable interface,we can sort using only one variable at a time
    @Override
    public int compareTo(Student o) {
        return CharSequence.compare(this.name,o.name);
    }

}



