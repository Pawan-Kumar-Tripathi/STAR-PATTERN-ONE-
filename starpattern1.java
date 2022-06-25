import java.io.*;
import java.util.*;
class starpattern1
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the no of stars and no of rows and coloumn you want");
        
        int num = sc.nextInt();
        
        int i ,j;//i is for rows and j is for coloumns 
        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
 
/*  output of this program is
 *
 **
 ***
 ****
 *****
 ******
 */