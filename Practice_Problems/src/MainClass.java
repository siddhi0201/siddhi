import java.io.IOException;

public class MainClass
{
    
    public static void main(String[] args) throws IOException
    {
       String[] cmd = new String[1];
       cmd[0] = ("C:\\Users\\siddhi.saxena\\imclogs.txt");
       
       Process process = Runtime.getRuntime().exec(cmd);
       System.out.println("welcome");
    }
}