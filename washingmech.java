
import java.util.Scanner;

public class washingmechtimer {
    public static void main(String[] args) {
        System.out.println("Ente the grams:");
        Scanner sc=new Scanner(System.in);
        int grams=sc.nextInt();
        int timer;
        char lvl;
        if(grams==0){
            timer=0;
            lvl='0';
            System.out.println("The machinne is empty"+grams +lvl);
            System.out.println("Time Estimated is:"+timer+"minutes");
        }
        else if(grams<2000){
            timer=25;
            lvl='L';
            System.out.println(+grams+" "+lvl);
            System.out.println("Time Estimated is:"+timer+"minutes");
        }
        else if(grams>=2000 && grams<=4000){
            timer=35;
            lvl='M';
            System.out.println(+grams+" "+lvl);
            System.out.println("Time Estimated is:"+timer+"minutes");
        }
        else if(grams>4000 && grams<=7000){
            timer=45;
            lvl='M';
            System.out.println(+grams+" "+lvl);
            System.out.println("Time Estimated is:"+timer+"minutes");
        }
        else if(grams>7000){
            timer=0;
            String lvl1="OVERLOADED";
            System.out.println(+grams+" "+lvl1);
            System.out.println("Time Estimated is:"+timer+"minutes");
        }
        else{
            System.out.println("Invalid input");
        }


    }
}
