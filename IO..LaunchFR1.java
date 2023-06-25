
import java.io.*;
public class LaunchFR 
{
    public static void main(String[] args) throws Exception
    {
       

         File dir=new File("PW");
         File file=new File(dir, "pw.txt");

         FileReader fd=new FileReader(file);
         char ch[]=new char[(int)file.length()];
        

         fd.read(ch);

         for(char data:ch)
         {
            System.out.print(data);
       
    }
    
}
