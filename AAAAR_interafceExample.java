interface member
{
    void callback();
}

class customer implements member
{
    String name;
    public customer(String n)
    {
        name=n;
    }
    public void callback()
    {
        System.out.println("ok,i will visit again "+name);
    }
}

class store
{
    member mem[] = new member[100];

    int count = 0 ;

    public void register(member m)
    {
        mem[count++] = m;
    } 

    void invitesale()
    {
        for(int i = 0 ; i<count ; i++)
        {
            mem[i].callback();
        }
    }
}


public class AAAAR_interafceExample {
    public static void main(String arg[])
    {
         store s = new store();
         customer c1 = new customer("JOHN");
         customer c2 = new customer("SMITH");

         s.register(c1);
         s.register(c2);
         s.invitesale();
    }
}
