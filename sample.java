import java.util.*;
public class sample
{
    public  static void main(String arg[])
    {
        Scanner o=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s=o.nextLine();
        char k[]=s.toCharArray();
        System.out.print("enter the row :");
        int r=o.nextInt();
        int c=20;
        char a[][]=new char[r][c];
        int c1=0;
        int c2=0;
        int u=1;
       int in=0;
       char as=' ';
        for(int i=0;i<k.length;i++)
        {
            if((k[i]=='A'||k[i]=='E'||k[i]=='I'||k[i]=='O'||k[i]=='U')&&(c1==r-1))
            {
              c1=0;
              c2=u;
              u=u+1;  
            }
            if(c1>=r)
            {
                c1=0;
                c2=u;
                u=u+1;
                
               
            }
            if(c1==0)
            {
                
                if(as=='A'||as=='E'||as=='I'||as=='O'||as=='U')
                {
                c1+=1;
                c2+=1;
                u=u+1;
                }
            }
            
            a[c1][c2]=k[i];
            
              if((c1==0)&&(k[i]>='A'&&k[i]<='Z'))
            {

            as=k[i];
            }
            c1=c1+1;
            c2=c2+1;
            
            
        }
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(a[i][j]>='A'&&a[i][j]<='Z')
                break;
                else
                a[i][j]='0';
            }
        }
        String sol=" ";
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j]>='A'&&a[i][j]<='Z')
                sol+=a[i][j];
                else if(a[i][j]=='0')
                continue;
                else
                sol+="*";
                }
        }
        System.out.print(sol);

        
    }    
}