package com.gh;

 class shop {



int itemid;int price; String name;
shop(int a,int b){
  itemid=a;price=b;name="XYZ";
  System.out.println(itemid+""+price+""+name);
  
}

shop(int i,int p,String n)
{
  
   itemid =i;
    price =p;
  name=n;
  System.out.println(itemid+""+price+""+name);
  
}
}
public class sho{
  
public static void main (String[] args) 
{
  shop sa=new shop(1,100);
  shop la=new shop(10,123,"Proceed");
}
}

}
