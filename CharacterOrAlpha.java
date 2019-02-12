import java.util.Scanner;
class CharacterOrAlpha{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
char ch=scan.next().toUpperCase().charAt(0);
if(ch>64&&ch>91)
System.out.println("alpha");
else
System.out.println("consonant");
}
}
