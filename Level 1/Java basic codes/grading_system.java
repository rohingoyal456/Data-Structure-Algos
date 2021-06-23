import java.util.Scanner;

public class grading_system {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int mark=input.nextInt();
        if(mark>90)
        {
            System.out.println("excellent");
        }
        else if(mark>80)
        {
            System.out.println("good");
        }
        else if(mark>70)
        {
            System.out.println("fair");
        }
        else if(mark>60)
        {
            System.out.println("meets expectations");
        }
        else
        {
            System.out.println("Below far");
        }
    }
}
