import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author whi08_000
 */
public class week01 {

    public static int countWords(String str)
    {
        int count = 1;
        for (int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }
        return count;
    }
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
      
          
          Scanner input = new Scanner(System.in);
        System.out.print("\njava WordCounter ");                
       String fileuser = input.nextLine();
          System.out.printf("\nOpening file '%s'...\n", fileuser );            
          System.out.printf("\n");  
        
          
          File file = new File(fileuser);
       //outputs what in the file 
        try {
            Scanner inputL = new Scanner(file);
            while (inputL.hasNextLine()) {
  String line = inputL.nextLine();
  System.out.println(countWords(line)+": " +line); 
}
            
            
            
        
        } catch (FileNotFoundException ex) {
            System.out.printf("Error reading '" + fileuser +"'...\n", ex);
        }}}
