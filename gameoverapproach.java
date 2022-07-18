package Humanadvanced;
import java.util.*;
public class gameoverapproach {
//creating final varible
//final static String me="0";
  //methods
void displayme(){
  System.out.print("me");
}
 void gameOvershape(){
 //loop ahead
  for(int gos=0;gos<=10;gos++){
    if(gos==0){
      System.out.print("|");
      
    }
    if(gos==3){System.out.print("_____________");}
  }
 }
  void shape()
  {
   System.out.print("_|") ;
    
    
    
  }
  public static void main(String[] args) {
System.out.print("Enter 2 number to start game");int l=2;
//verify l
if(l==2)
{System.out.println("Select an optionplayer\nStage A. \nStage B.  ");}
//scanner creation called meta
Scanner meta =new Scanner (System.in);
int userdata=meta.nextInt();
//checking condition 
switch
(//user data
userdata
)//switch begins here
{//testing cases
case       
             1:
 System.out.print("Stage Loading:\t") ;
// loop to load to start
int b=0;
  for(int start=10;start>=-10;start-=1)
  {int y=start%2;;
  //;System.out.print("\n");
  if (y==0)
   {
   System.out.print("\b\b____"+b+"%");}
    b+=5;
   ; 
 //ending of for loops
 }System.out.print("\n");
  int moveme =0;
// master loop for the whole stage 
for(int

 masterloop=1;(masterloop<=25);masterloop++

)
{//start loop
;
  gameoverapproach display=new gameoverapproach() ;
  
  if(masterloop==1)
 { display.displayme();};
 display.shape();
  //if statement 
 if(masterloop==6){//start if statement 
  int next =meta.nextInt();
  //set back to one masterpool unless when moveme is25 end game

if(moveme<=25)
{;//if statement 

}
 if (moveme<25){masterloop=1;
  continue;
}
   
  }
moveme=moveme++ ;
 //for loop ending
}
 
 
 
  //ending of the switch statement 
}


  }

}
