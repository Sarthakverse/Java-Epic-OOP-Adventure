import java.io.*;

class stackoverflow extends Exception
{
   public String toString()
   {
     return "stack is full";
   }
}

class stackunderflow extends Exception
{
    public String toString()
    {
        return "stack is empty";
    }
}

class stack 
{
      private int size;
      private int top = -1 ;
      private int S[];

      public stack(int sz)
      {
        size = sz ;
        S = new int[sz];
      }

      public void push(int x) throws stackoverflow
      {
        if(top == size-1)
        {
            throw new stackoverflow();
        }
        top++;
        S[top] = x ;

      }

      public int pop() throws stackunderflow
      {
        int x = -1;

        if(top == -1)
        {
            throw new stackunderflow();
        }

        x = S[top];
        top--;
        return x;
      }
}

public class AAAFA_challenge {
    public static void main(String arg[])
    {
        stack st = new stack(5);
        try
        {
            st.push(10);
            st.push(1);
            st.push(0);
            st.push(101);
            st.push(102);
            st.push(3);
           
        }

        catch(stackoverflow s)
        {
           System.out.println(s);
        }
        
    }
}
