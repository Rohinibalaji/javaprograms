import java.util.Scanner;
class LeapYear{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the Year:");
int year=scan.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.print(year+" is leap year");
else
System.out.print(year+" is not a leap year");
else
System.out.print(year+" is a Leap Year");
else
System.out.print(year+" is Not a LEAP year");
}
}
