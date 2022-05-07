package NewFile;

public class Branch_b1 {
   //b1
    String name;
    int roll;
    float cgpa;

    //b2
    String id, password;

    //constructor:


    public Branch_b1(String name, int roll, float cgpa, String id, String password) {
        this.name = name;
        this.roll = roll;
        this.cgpa = cgpa;
        this.id = id;
        this.password = password;
    }

    /*Branch_b1(String n, int r, float c)
    {
        this.name = n;
        this.roll = r;
        this.cgpa = c;
    }
*/
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

    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
