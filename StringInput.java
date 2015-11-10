import java.io.*;

public class StringInput
{
    private BufferedReader reader;
    
    public StringInput()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void testInput() throws IOException
    {         
            System.out.print( "Please enter your number: " );
            
            String input = reader.readLine();
            
            double number = Double.parseDouble(input);
            
            System.out.println("Square root of input number " + input + " is: " + Math.sqrt(number));
        
    }
}