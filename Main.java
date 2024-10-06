import java.util.List;

public class Main{
    public static void main(String[] args)
    {
        //Near 100% of doing this one was pain. Java is my worst one, and CSV is my worst part of C#.
        //And, the worst of it all, is if you put this on the test, I will 100% fail those questions.
        List<Student> studentsList = ReadCSV.ReadCSV("students.csv");
        
        //Look. I got them done, WITHOUT knowing that they FOR SOME REASON need to be in seperate files.
        //Just once, I am going to not care with the comments, because this combined the two worst parts of class.
        //Sorry, but this was frustrating.
        for (Student student : studentsList)
        {
            System.out.println("Name: " + student.getName() + ", Grade: " + student.getGrades());
        }
        System.out.println();
    }
}