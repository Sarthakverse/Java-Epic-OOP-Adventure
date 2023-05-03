import java.util.*;

class student 
{
    private String rollno;
    private static int count = 1;
    private String generateRollNo()
    {
        Date d = new Date();
        String rn = "Univ-" + (d.getYear()+1900) + " " + count;
        count++;
        return rn;
    }

    public student()
    {
        rollno = generateRollNo();
    }

    public String getrollno()
    {
        return rollno;
    }

}

public class AAAAZ_studentChallenge {
    public static void main(String arg [])
    { 
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();  

        System.out.println(s1.getrollno());
        System.out.println(s2.getrollno());
        System.out.println(s3.getrollno());
    }
}
