import java.util.*;
import java.util.stream.Stream;
import java.util.stream.*;
class Stu_obj{
    private int id ;
    private String name;
    private long mobileNumber;
    private int age;

    public Stu_obj(int id, String name, long mobileNumber, int age) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", age=" + age +
                '}';
    }
}
class Student{
     public static void main(String[] args) {
        getStudentList().stream()
                .filter(student -> student.getAge()>25)
                .map(stu-> stu.getName())
                .limit(2)
                .forEach(stu -> System.out.println(stu));

    }
    public static List<Stu_obj> getStudentList()
    { ArrayList<Stu_obj> studentList=new ArrayList<Stu_obj>();
        Stu_obj koushik=new Stu_obj(1,"koushik",9490484748L,20);
        Stu_obj Amit=new Stu_obj(2,"Amit",703839886L,28);
        Stu_obj Hari=new Stu_obj(3,"Hari",9490484748L,30);
//        List<Stu_obj> StudentList= Arrays.asList(koushik,Amit);
//        StudentList.forEach(Stu_obj -> System.out.println(Stu_obj));
        studentList.add(koushik);
        studentList.add(Amit);
        studentList.add(Hari);

        return studentList;

    }
}