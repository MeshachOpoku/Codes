/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


/**
 *
 * @author mesha
 */
public class JavaApplication8 {
    // initial method or sometime people call it sorting algorithm
    static int test(int u) {
         // an array
         int p[]= {1,2,3,4,5,6,7,8,9,10};
        // m is a varian=ble sTARTING from zero and loop until is less than the length of the array which is upto 10
       for(int m=0;m<p.length;m++)
       { //loop starts fom here
           if (u==p[m])// a condition which say when u is equal to any element  and print will show the index
       {System.out.print("Index of the number passed as  a parameter is "+m);break;}
          // provided the passed index is greater or equal to 10 error will occur why ? because array begins fom 0 and end at  (10-1)=9
           else if(u<=p[m])  {System.out.print("Number is not found in list stored?/");break;}
        }//ending of array called p 
 return -1;    }
    public static void main(String[] args) {
        // TODO code application logic here
        
     test(4);
    }
    
}
