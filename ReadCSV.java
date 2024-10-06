import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
//It took one google search to get this list, but more than 10 to understand it all.

public class ReadCSV{
    public static List<Student> ReadCSV(String fileName)
    //AND WHY IS READCSV UNDERLINED? IT WORKS, SO WHY?
    {
        List<Student> students = new ArrayList<>();
        
        //BufferedReader? InputStreamReader? FileInputStream?
        //Before this, I was blissfully unaware of how these worked.
        //And now, I still am, but I somehow got it to work without understanding the basics of it.
        //None of this makes sense to me. And I don't think it ever will. Sorry.
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName))))
        {
            {
                //Again, my problems aside, the inside of the statement worked out easily.
                //Atleast more than the rest.
                String line;
                boolean isHeader = true;
                    
                while ((line = reader.readLine()) != null)
                {
                    if (isHeader)
                    {
                        isHeader = false;
                        continue;
                    }
                    //so much of these changes are just syntaxx/changing uppercase words into lowercase, and vice versa
                    String[] parts = line.split(",");
                    String name = parts[0];
                    int grades = Integer.parseInt(parts[1]);
                    students.add(new Student(name, grades));

                }
                return students;
            }
        }
        catch (IOException except) {
            return students;
        }
    }
}