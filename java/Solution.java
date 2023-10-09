import java.util.*;
public class Solution
{
    public static void main(String [] args)
    {
        int ot,l=1,n,c=0;
        Scanner sc = new Scanner (System.in);
        int t=sc.nextInt();
        int [] in=new int[t];
        for(int i=0;i<t;i++)
            in[i]=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            c=in[i];
            while(c!=0)
            {
                c = c/10;
                l=l*10;
            }
            ot=in[i]%9;
            ot=(9*(ot+1))%10;
            n=(l*ot)+in[i];
            in[i]=(in[i]*10)+ot;
            if(n%9==0 && n<in[i])
                in[i]=n;
            System.out.println(in[i]);
        } 
    }
}