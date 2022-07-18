package Humanadvanced;

import Humanadvanced.GameMove;
import java.util.*;
public class GameMove {
//
//method beneath 
  static int v=9;
void shift(){System.out.print("               ");}
void help(){
System.out.print("*******††*****************");
  System.out.print("\nHelp:");
  System.out.print("\n The game allow player to enter  :\n0 for walking lower ground \n1 for walking higher ground");
}
  public static void main(String[] args) {
System.out.print("Walking object going anthor place \n\n1.Select Game Stage and play Game\n2.Help");
//creation of scanner 
Scanner dl=new Scanner (System.in);
//creating an object out of class GameOver
GameMove iera=new GameMove();
//variable 
int choice=dl.nextInt();
//creation of switch statement which switch a variable called choice 
switch (choice){
  
 //the text with this quotations  operate under the switch statement
case 1:
//starting part of case 1 statement
System.out.print("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°′°°°°°°°")
; 
 System.out.println(" \nGame page :select any stage and play\n_________________________\n 1.  A stage \n 2.  B stage  \n 3.  C stage");
 //variable declared not initialized
int olay= dl.nextInt();
 //nested switch
switch(olay)
  
 {case 1:
 //nested case1
//this code shift to text toright=====>iera.shift();
 System.out.print("0");
  for(int f=0;f<=4;f++) 
   {//display what user is walking on
System.out.print("__");System.out.print("|");}
Scanner move =new Scanner (System.in);
int option=move.nextInt();
//nested within nested statement 
switch(option){
   case 1:
    for(int f=0;f<=3;f++) 
   {//display what user is jumping  over wall 
System.out.print("__");System.out.print("|");
String me="0";

if(f==0)
 { System.out.print(me+"__");System.out.print("|");
// static variable assign to f and is v and can be used every whaere
 
 }

 }
;

}//swich
  //accepting input 
  
 option=move.nextInt();
 switch(option)
{
  case 1://starting loop
     for(int f=0;f<=3;f++) 
   {//display what user is walking on
System.out.print("__");System.out.print("|");
String me="0";
//System.out.print(v);
//v++;
if(f==1)
 { System.out.print(me+"__");System.out.print("|");

}
// if(f==3);
 
 }

}//end of loop
option=move.nextInt();
switch(option)//switch begins here
{
  case 1://starting loop
     for(int f=0;f<=3;f++) 
   {//display what user is walking on
System.out.print("__");System.out.print("|");
String me="0";
//System.out.print(v);
//v++;
if(f==2)
 { System.out.print(me+"__");System.out.print("|");

}
// if(f==3);
 
 }

}//switch ends
option=move.nextInt();
switch(option)//switch begins here
{
  case 1://starting loop
     for(int f=0;f<=3;f++) 
   {//display what user is walking on
System.out.print("__");System.out.print("|");
String me="0";
//System.out.print(v);
//v++;
if(f==3)
 { System.out.print(me+"__");System.out.print("|");
v=f;
}
// if(f==3);
 
 }

}//switch ends
System.out.println("\n\n\n\t******************");
v*=5;
System.out.print("WellDone You Have Jumped From One \nWall to anthoer!\n");
System.out.println("Game Ends"+"\nScore:"+v);



}

 
  

//breaking the case 1 statement 
break;



case 2:
//case 2 statement will be at this place
//displaying method called help
iera.help();




//breaking statement for case 2
break;
 
  
  
}
 }
 }
   
 
  
  
 // order my him

 
  