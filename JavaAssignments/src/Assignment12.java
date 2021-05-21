/*Assignment on Stream Api

Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

Add following student in list ;

1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

Use stream api on above list of employees find

1. Print the name of all departments in the college?
2.Get the names of all students who have enrolled after 2018?
3. Get the details of all male student in the computer sci department?
4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
5.What is the average age of male and female students?
6.Get the details of highest student having highest percentage ?
7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
8. What is the average percentage achieved in each department?
9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
10.How many male and female students are there in the computer science department?
 */
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Assignment12 {
    public static void main(String args[]) {
        List<Student> studentList = new ArrayList<>();
        StudentStream stream = new StudentStream();
        stream.initializeStudentList(studentList);
        stream.printDepartments(studentList);
        stream.enrollAfterOneYear(2018,studentList);
        stream.getMaleStudents("Computer Science", studentList);
        stream.countStudents(studentList);
        stream.getAverageStudents(studentList);
        stream.highestPercentage(studentList);
        stream.countDepartmentWise(studentList);
        stream.departmentAvgPercentage(studentList);
        stream.youngestMaleDepartmentWise("Electronic", studentList);
        stream.countStudentsperDepartment("Computer Science",studentList);
    }
}
 class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String engDepartment;
    private int yearOfEnrollment;
    private double perTillDate;

    public Student(int id, String name, int age, String gender, String engDepartment, int yearOfEnrollment,
                   double perTillDate) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.yearOfEnrollment = yearOfEnrollment;
        this.perTillDate = perTillDate;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEngDepartment() {
        return engDepartment;
    }

    public void setEngDepartment(String engDepartment) {
        this.engDepartment = engDepartment;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public double getPerTillDate() {
        return perTillDate;
    }

    public void setPerTillDate(double perTillDate) {
        this.perTillDate = perTillDate;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id + "\nname=" + name + "\nAge=" + age + "\nGender=" + gender + "\nengDepartment="
                + engDepartment + "\nyearOfEnrollment=" + yearOfEnrollment + "\nperTillDate=" + perTillDate + "]";
    }
}

class StudentStream  {
    public void printDepartments(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Set<String> departments = stream
                .map((student) -> student.getEngDepartment())
                .collect(Collectors.toSet());
        System.out.println("Departments: ");
        for(String department : departments) {
            System.out.println(department);
        }
    }
    public void enrollAfterOneYear(int year,List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        List<Student> filterList = stream
                .filter((student) -> student.getYearOfEnrollment() > year)
                .collect(Collectors.toList());

        System.out.println("Students enrolled after year " + year + " : ");
        for(Student student : filterList) {
            System.out.println(student);
        }
    }
    public void getMaleStudents(String department,List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        List<Student> maleStudents = stream
                .filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
                .filter((student) -> student.getGender().equalsIgnoreCase("male"))
                .collect(Collectors.toList());

        System.out.println("Male students of " + department + " : ");

        for (Student student : maleStudents) {
            System.out.println(student);
        }
    }
    public void countStudents(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Map<String,List<Student>> genderCount = stream.collect(Collectors.groupingBy(Student :: getGender));
        System.out.println("No. of Male students :" + genderCount.get("Male").size());
        System.out.println("No. of Female students :" + genderCount.get("Female").size());
    }

    public void getAverageStudents(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Map<String,List<Student>> genderCount = stream.collect(Collectors.groupingBy(Student :: getGender));
        double maleAverage = 0.0;
        double femaleAverage = 0.0;
        int maleCount = genderCount.get("Male").size();
        int femaleCount = genderCount.get("Female").size();
        for(Student student : genderCount.get("Male")) {
            maleAverage += student.getAge();
        }
        for(Student student : genderCount.get("Female")) {
            femaleAverage += student.getAge();
        }
        maleAverage /= maleCount;
        femaleAverage /= femaleCount;
        System.out.println("Average age of male students :" + maleAverage);
        System.out.println("Average age of female students :" + femaleAverage);
    }
    public void highestPercentage(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Optional<Student> student = stream.max(new Comparator<Student>() {
            public int compare(Student s1,Student s2) {
                if(s2.getPerTillDate() - s1.getPerTillDate() > 0) return -1;
                else if(s2.getPerTillDate() - s1.getPerTillDate() < 0) return 1;
                else return 0;
            }
        });
        if(student.isPresent()) {
            System.out.println("Student with the highest percentage is " + student);
        }
        else {
            System.out.println("There are no students to display");
        }
    }
    public void countDepartmentWise(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Map<String,List<Student>> studentCountByDepartment = stream.collect(Collectors.groupingBy(Student :: getEngDepartment));
        System.out.println("Students per department : ");
        for(Map.Entry<String, List<Student>> entry : studentCountByDepartment.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }
    }
    public void departmentAvgPercentage(List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Map<String,List<Student>> studentCountByDepartment = stream.collect(Collectors.groupingBy(Student :: getEngDepartment));
        System.out.println("Average percentage count by department : ");
        for(Map.Entry<String, List<Student>> entry : studentCountByDepartment.entrySet()) {
            double avg = 0.0;
            List<Student> tempList = entry.getValue();
            int deptSize = tempList.size();
            for(Student student : tempList) {
                avg += student.getPerTillDate();
            }
            avg /= deptSize;
            System.out.println(entry.getKey() + " - " + avg);
        }
    }
    public void youngestMaleDepartmentWise(String department,List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Optional<Student> youngestMale = stream
                .filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
                .filter((student) -> student.getGender().equalsIgnoreCase("Male"))
                .collect(Collectors.minBy(new Comparator<Student>() {
                    public int compare(Student s1,Student s2) {
                        return s1.getAge() - s2.getAge();
                    }
                }));
        if(youngestMale.isPresent()) {
            System.out.println("The youngest male student in " + department + " is \n"+ youngestMale);
        }
        else {
            System.out.println("There are no students to display");
        }
    }
    public void countStudentsperDepartment(String department,List<Student> studentList) {
        Stream<Student> stream = studentList.stream();
        Map<String,List<Student>> genderCountByDept = stream
                .filter((student) -> student.getEngDepartment().equalsIgnoreCase(department))
                .collect(Collectors.groupingBy(Student :: getGender));

        System.out.println("No. of male students in " + department + "  : " +
                genderCountByDept.get("Male").size());
        System.out.println("No. of female students in " + department + "  : " +
                genderCountByDept.get("Female").size());

    }
    public void initializeStudentList(List<Student> studentList) {
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
    }
}
