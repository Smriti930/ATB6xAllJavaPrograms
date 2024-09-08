package C_07072024.EnumAndWrapperClasses;

public class Lab65 {
    public static void main(String[] args) {
        PersonATB person=new PersonATB(12,"Anand",6876767666l);
        System.out.println(person.getPhoneNumber());
        System.out.println(person.getName());
        System.out.println(person.getRollNo());
    }
}

class PersonATB{
    Integer rollNo;
    String Name;
    Long phoneNumber;

    public PersonATB(Integer rollNo, String name, Long phoneNumber) {
        this.rollNo = rollNo;
        Name = name;
        this.phoneNumber = phoneNumber;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
