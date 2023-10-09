import java.lang.String;
public class sadas
{
   public static void main(String [] args)
   {
       int i=0,j=0;
       for(i=0;i<2;i++)
       {
           for(j=0;j<3;j++)
           {
                System.out.print("1\n");
                break;
           }
           System.out.print("2\n");
       }
       System.out.print("after loop\n");
   }
}
