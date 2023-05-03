class subject
{
    private String subid;
    private String name;
    private int maxmarks;
    private int marksobtained;

    public subject(String subid , String name , int maxmarks)
    {
        this.subid = subid;
        this.name = name;
        this.maxmarks = maxmarks;
    }

    public String getsubid()
    {
        return subid;
    }

    public String getname()
    {
        return name;
    }

    public int getmaxmarks()
    {
        return maxmarks;
    }

    public int marksobtained()
    {
        return marksobtained;
    }

    public void setmaxmarks(int mm)
    {
        maxmarks=mm;
    }
    public void setmarksobtained(int m)
    {
        marksobtained=m;
    }

    public String toString()
    {
        return "\nsubject : "+subid+"\nname : "+name+"\nmaxmarks : "+maxmarks+"\nmarksobtained : "+marksobtained;
    }
}

public class AAAAH_arrayOfObjects
{
    public static void main(String [] arg)
    {
        subject subs[] = new subject[3];

        subs[0] = new subject("BAS203","Mathematics II",70);
        subs[1] = new subject("BCE201","Electronics",70);
        subs[2] = new subject("BCA201","Chemistry",70);


        for(subject s:subs)
        {
            System.out.println(s);
        }
    }
}

