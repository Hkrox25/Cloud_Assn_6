import java.util.*;

public class Calc{
  public static void main(String [] args){
    int switchX, one, two,result=0;
    boolean choice=true;
    
    Scanner sc=new Scanner(System.in);
    
    System.out.println("------MENU------");
    System.out.println("    1.  +");
    System.out.println("    2.  -");
    System.out.println("    3.  *");
    System.out.println("    4.  /");
    System.out.println("    5. Exit");
    while(choice){
      System.out.println("Enter your choice: ");
      switchX=sc.nextInt();
      switch(switchX){
        case 1:
          System.out.println("Enter 1st number: ");
          one=sc.nextInt();
          System.out.println("Enter 2nd number: ");
          two=sc.nextInt();
          result=one + two;
          System.out.println("RESULT : "+ result);
          break;
  
        case 2:
          System.out.println("Enter 1st number: ");
          one=sc.nextInt();
          System.out.println("Enter 2nd number: ");
          two=sc.nextInt();
          result=one - two;
          System.out.println("RESULT : "+ result);
          break;
        
        case 3:
          System.out.println("Enter 1st number: ");
          one=sc.nextInt();
          System.out.println("Enter 2nd number: ");
          two=sc.nextInt();
          result=one * two;
          System.out.println("RESULT : "+ result);
          break;
  
        case 4:
          System.out.println("Enter 1st number: ");
          one=sc.nextInt();
          System.out.println("Enter 2nd number: ");
          two=sc.nextInt();
          result=one / two;
          System.out.println("RESULT : "+ result);
          break;
        
        case 5:
          choice=false;
          break;
        
        default:
          System.out.println("Invalid Choice");
          break;
        
      }
    } 
  }
}
