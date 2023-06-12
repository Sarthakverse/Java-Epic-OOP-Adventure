public class returnarray {
    public static void main(String arg[])
    {
        int []p = returnsArray();
        for(int i= 0; i<p.length ; i++)
        {
            System.out.print(p[i]+" ");
        }
    }

    public static int[] returnsArray() //this line is imp to understand
    {
        int []arr = {1,2,3,4,5};
        return arr;

    }
}
