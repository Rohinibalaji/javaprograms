import java.util.Scanner;
class SumOfNatural{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
System.out.print("Enter a number:");
int N=scan.nextInt();
int sum=0, i=1;
while(i<=N){
sum=sum+i;
i++;
}
System.out.print("sum: "+sum);
}
}