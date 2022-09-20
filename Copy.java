import java.util.Scanner;
public class Copy{
    public static void main(String[] args) {
        Scanner Myobj = new Scanner(System.in);
        int is_fulltime=1;
        double empcheck= Math.floor(Math.random()*10)%2;
        if (empcheck==is_fulltime)
        { 
            System.out.println("present ");
            System.out.println("number of days worked by employee:");
            int A = Myobj.nextInt();
            System.out.println("number of hours worked in a day:");
            int B = Myobj.nextInt();
            int C = 20*A*B;
            System.out.println("wages of employee: "+C );
        }
        else
        { System.out.println("absent"); }

    }
    }



