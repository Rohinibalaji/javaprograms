import java.util.Scanner;
class CheckSign{
public static void main(String[] arg){
Scanner scan=new Scanner(System.in);
int a = scan.nextInt();
if (a<0){
System.out.print("Negative");
}
else if(a==0){
System.out.print("zero");
}
else{
System.out.print("Positive");
}
}
}
