package gitAssignment;

public class Assignment {
    int roll;
    float cgpa;
    String name;

    //Constructor:
    Assignment(String n, roll r, cgpa c)
    {
        this.name = n;
        this.roll = r;
        this.cgpa = c;
    }

    //Setter functions:
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    //getter functions:
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
}
