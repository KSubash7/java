import java.util.Scanner;
public class leap_year {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the year");
      int year = sc.nextInt();
      if(year%400==0 || year%4==0 && year%100!=0){
        System.out.println("its leap year :"+year);
      }
      else{
        System.out.println("its not a leap year :" + year);
      }
      
  }
}
