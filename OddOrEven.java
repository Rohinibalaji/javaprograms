import java.util.Scanner;
class OddOrEven{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int a = scan.nextInt();
if(a%2==0)
System.out.print(a+" is even");
else
System.out.print(a+" is odd");
}
}