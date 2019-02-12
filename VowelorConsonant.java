import java.util.Scanner;
class VowelorConsonant{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the character");
char ch=scan.next().toLowerCase().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
System.out.println("vowel");
else
System.out.println("consonant");
}
}


