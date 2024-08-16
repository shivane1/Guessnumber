
import java.util.Scanner;

public class guessnumber {
    
    public static void main(String[] args) {
        
        int otp=(int)(Math.random()*100000);
    System.out.println("ENTER THE NUMBER DISPLAYED ON SCREEN TO CONTINUE....");
    System.out.println(otp);
    Scanner sc0=new Scanner(System.in);
    while(true){
        int opt0=sc0.nextInt();
    if(opt0==otp)
    {
        System.out.println("SUCCESSFUL...");
        break;
    }
    else{
        System.out.println("TRY AGAIN.....");
    }
}

        System.out.println("guess number between 1 and 100, YOU HAVE 10 TRIES");
        Scanner sc = new Scanner(System.in);
        int real = (int)(Math.random()*100);
        int i=0;
        while(true)
        {
            int guess =sc.nextInt();
        System.out.println("you guessed "+guess);
        int j=10-(++i);
        if(real == guess)
        {
            System.out.println("YOU WON ......");
            break;
        }
        if(guess<real)
        {
            System.out.println("GUESS BIGGER,TRY AGAIN ....."+ j+" TRIES LEFT");
        }
        if(guess>real)
        {
            System.out.println("GUESS SMALLER,TRY AGAIN ....."+j+" TRIES LEFT");
        }
             if(i>=10)
        {
            break;
        }
       
    }
    System.out.println("NUMBER OF TRIES --> "+i);
    System.out.println("BYE..........");
}
}
