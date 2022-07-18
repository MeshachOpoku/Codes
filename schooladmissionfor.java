package Humanadvanced;
import java.util.*;
public class schooladmissionfor {

  public static void main(String[] args)
   {
System.out.println("Welcome To Superb  School");
System.out.println("Select an option");
System.out.println("\n1.Seek Admissions \n2.Pay School Fees \n3.Information for parents and guidance");
Scanner sally=new Scanner (System.in) ;
int xj=sally.nextInt();
switch(xj)
{ case 1:
  System.out.println("\n\nSeek Admissions Page\n\n");
       System.out.println("______________________");
    System.out.println("Enter your Email to login and seek admissions");
   System.out.println("Notice:If email is   wrong some information may not reach you")
;//creating variable called email
    Scanner app =new Scanner(System.in);
int y=0;
String email[] =new String[50];
; email[y]=app.nextLine();
   System.out.println(email[0]);
   System.out.println("Kindly fill the following details");
   System.out.println("Name");
 //creation of variable for storing  name
String name=app.nextLine() ;
    System.out.println("Date Of Birth: Example 14042005") ; // creation of variable for date of   
    Scanner beyond=new Scanner(System.in) ;
int birth=beyond.nextInt(); 
   System.out.println("Name of Father");
Scanner theyfool=new Scanner (System.in);
       //creation variable forfather 
String faname=theyfool.nextLine();
   //creation variable for father number

    System.out.println("Father's Number");
   // creation of variable for father number

Scanner why=new Scanner (System.in)
;String fa_num=why.nextLine() ;
   System.out.println("Father's Job"); 
   //creating fathers variable for  job
String fa_job=why.nextLine() ;
   System.out.println("Name of Mother");
   //creation variable for mothher
Scanner yo=new Scanner(System.in);
String mo_name=yo.nextLine() ;
Scanner may=new Scanner(System.in);

   System.out.println("Mother's number");
  Scanner yi=new Scanner(System.in);
 String mo_num=yi.nextLine() ;
   
   System.out.println("Mother's Job");
   Scanner poi=new Scanner(System.in);
String mo_job=poi.nextLine() ; 
   System.out.println("Hometown");
   Scanner saline=new Scanner(System.in)
  ; //creation of variable for home town
String hometown=saline.nextLine() ;
  System.out.println(hometown+"is Located in which  region");
   //creation of variable for region of thy hometown
Scanner is =new Scanner(System.in);
String reg_htown=is.nextLine();
   System.out.println("Where do you stay currently");
   Scanner kernel=new Scanner(System.in) ;
String
 current_stay=kernel.nextLine();
   System.out.println("Name of Previous school attended ");
  // variable for previous school attended
Scanner hg=new Scanner(System.in);
String preschname=hg.nextLine();
   System.out.println("Select the level you were in"+preschname+"\n1.Nursery and KG \n2.Primary \n3.JHS");
   Scanner la=new Scanner (System.in);
String level=la.nextLine()
;
//creation of switch statment
   switch (level)
   { case "1":
   System.out.println("Nursery and KG was your class in "+preschname); break;
     case"2":
     System.out.println("Primary was your class in "+preschname);break;
     case "3":
     System.out.println("JHS was your class in "+preschname);break;
     
   }
   
   System.out.println("Enter ## to submit your details  filled to Superb School");
  // Variable for submitting data
String submit=is.nextLine() ;
   switch(submit)
   {case "##":
   for (int mit=0;mit<=70000000;mit++)
     
    
     
      
      
     
 
     System.out.println("Welldone , details submitted");
     
     
   }
  break;
  case 2:
  System.out.println("Paying School Fees Page");
  break;
  case 3:
  System.out.println("Information for parent and guidance Page");
  
  default :
  //System.out.println("Well ,
//  you choice is wrong ,pick a better option");
  
  
  
  
}
  }

}
