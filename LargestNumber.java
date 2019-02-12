import java.util.Scanner;
class LargestNumber{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
System.out.print("Enter three numbers:");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
if((a>b)&&(a>c))
System.out.print(a+" is larger");
else if(b>c)
System.out.print(b+" is larger");
else
System.out.print(c+" is larger");
}
}
