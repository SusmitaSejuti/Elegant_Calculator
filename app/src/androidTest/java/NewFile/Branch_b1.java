package NewFile;

public class Branch_b1 {
    String name;
    int roll;
    float cgpa;

    //constructor:
    Branch_b1(String n, int r, float c)
    {
        this.name = n;
        this.roll = r;
        this.cgpa = c;
    }

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
}
