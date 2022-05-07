package NewFile;

public class Branch_b1 {
    String name;
    int roll;
    float cgpa;

    //master:
    int total_Student;
    String department;

    //constructor:

    public Branch_b1(String name, int roll, float cgpa, int total_Student, String department) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
        this.total_Student = total_Student;
        this.department = department;
    }

   /* Branch_b1(String n, int r, float c)
    {
        this.name = n;
        this.roll = r;
        this.cgpa = c;
    }*/


    //setter:
    public void setName(String name)

    {
        this.name = name;
    }

    public void setRoll(int roll)
    {
        this.roll = roll;
    }

    public void setCgpa(float cgpa)
    {
        this.cgpa = cgpa;
    }

    public void setTotal_Student(int total_Student) {
        this.total_Student = total_Student;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //getter:
    public String getName()
    {
        return name;
    }

    public int getRoll()
    {
        return roll;
    }

    public float getCgpa()
    {
        return cgpa;
    }

    public int getTotal_Student() {
        return total_Student;
    }

    public String getDepartment() {
        return department;
    }
}
