import java.util.*;
class RockPaperScissors
{
    public static void main(String[]args) 
    {
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter '1' for rock.") ; 
        System.out.println("Enter '2' for paper.") ; 
        System.out.println("Enter '3' for scissors.") ;
        int comp = 0 ; // this stores the no. of times computer wins
        int user = 0 ; // this stores the no. of times user  wins
        int max = 3 ; 
        int min = 1 ; 
        int range = max - min + 1; 
        int rand ;
        int i = 0 ;
        System.out.println("How many times do you want to play?") ;
        int times = sc.nextInt() ; 
        System.out.println("We will let you play " + times + " times.")  ;
        while(i<times)
        {
        rand = (int)(Math.random() * range + min) ;
        System.out.println("Enter your choice:") ;
        int inp = sc.nextInt() ;
        System.out.println("Computer's choice:"+ rand) ;
        if(inp==rand)
        System.out.println("Tie.") ; 
        else if(inp == 1 && rand ==2) 
        {
            System.out.println("Computer wins ! " ) ; 
            comp = comp + 1 ; 
        }
        else if(inp == 2 && rand ==1) 
        {
            System.out.println("User wins ! " ) ; 
            user = user + 1 ; 
        }
        else if(inp == 2 && rand ==3) 
        {
            System.out.println("Computer wins ! " ) ; 
            comp  = comp + 1 ; 
        }
        else if(inp == 3 && rand ==2) 
        {
            System.out.println("User wins ! " ) ; 
            user = user + 1 ; 
        }
        else if(inp == 3 && rand ==1) 
        {
            System.out.println("Computer wins ! " ) ; 
            comp  = comp + 1 ; 
        }
        else if(inp == 1 && rand ==3) 
        {
            System.out.println("User wins ! " ) ; 
            user = user + 1 ; 
        }
        if(inp!=1 && inp!=2 && inp!=3) 
        System.out.println("Wrong Input") ;
        i++;
    }
    if(user>comp) 
    System.out.println("User wins:" + user + "-" + comp ) ;
    else if(user == comp ) 
    System.out.println("Tie:" + user + "-" + comp ) ;
    else if(comp>user)
    {
    System.out.println("Computer wins:" + comp + "-" + user ) ;
    System.out.println("Better luck next time!") ;
    }
}
}