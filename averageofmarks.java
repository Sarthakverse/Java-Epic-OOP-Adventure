
import java.util.Scanner;
public class averageofmarks {
    public static void main(String arg[])
    {
        int i , avg ,sum = 0;

        int arrrayMarks[] = new int[10];
        Scanner s =new Scanner(System.in);
        for(int x=0 ; x<10 ; x++)
        {
            System.out.println("enter marks : ");
            arrrayMarks[x]=s.nextInt();
        }

        for(i =0 ;i<10 ;i++)
        {
            sum = sum+arrrayMarks[i];
            
        }
        avg = sum/10;
        System.out.println("avg marks : "+avg);
    }
}
