import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number: ");
int N=scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev= rev*10+temp%10;
temp=temp/10;
}
if(rev==N)
System.out.print("is Palindrome");
else
System.out.print("is not a Palindrome");
}
}