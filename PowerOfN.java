import java.util.Scanner;
class PowerOfN{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the value of N: ");
int N=scan.nextInt();
System.out.print("Enter the value of K: ");
int K=scan.nextInt();
int res=1;
int i=1;
while(i<=K){
res=res*N;
i++;
}
System.out.print("N^K is" +res);
}
}