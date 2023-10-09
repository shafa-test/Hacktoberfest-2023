import java.util.*;
public class berland
{
    public static void main(String args[])
    {
        int c=0;
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []a= new int [n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n-2;i++)
        {
            if(a[i]==0 && a[i+1]==0)
                continue;
            else if(a[i]==0 && a[i+1]==1 && a[i+2]==0)
            {
                i=i+2;
                c++;
            }
        }
        System.out.println(c);
    }
}
