import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int initialize = scanner.nextInt();

        Timer timer = new Timer();
        TimerTask timertask = new TimerTask(){
            int count = initialize;
            public void run(){
                System.out.println(count);
                count--;

                if(count < 0){
                    System.out.println("Happy Dashain!!!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(timertask,10,600);
    }
}