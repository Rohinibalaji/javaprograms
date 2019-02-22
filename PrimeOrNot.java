import java.util.Scanner;
class PrimeOrNot{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number: ");
int N=scan.nextInt();
int flag=0;
for(int i=2;i<N;i++){
if(N%i==0){
flag=1;
break;
}
else
continue;
}
if(flag==1)
System.out.print("Not Prime");
else
System.out.print("Prime");
}
}


















