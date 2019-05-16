//Customer project 3 variables
//able to compare & sort integers in descending order
//able to tell first,second third entered
import java.util.Scanner;
public class IntegerSort{
    public static void main (String args[]) {
    Scanner userInput = new Scanner(System.in);
    //variables of inputed numbers by user
    int x, y, z =0;
    //no imput error trapping needed no arguments entered in
    System.out.println("Please enter first number:");
    x = userInput.nextInt();
    System.out.println("Please enter second number:");
    y = userInput.nextInt();
    System.out.println("Please enter third number:");
    z = userInput.nextInt();
    //securing place holders
    int firstplace=0;
    int secondplace=0;
    int thirdplace=0;
    //all different value variables
   if(x>y){
        if(x>z) {
          if (y>z){
                    firstplace=x; secondplace=y; thirdplace=z;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }
    if(x>y){
        if(x>z) {
          if (y<z){
                    firstplace=x; secondplace=z; thirdplace=y;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }
    if(y>x){
        if(y>z) {
          if (x<z){
                    firstplace=y; secondplace=z; thirdplace=x;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }
    if(y>x){
        if(y>z) {
          if (x>z){
                    firstplace=y; secondplace=x; thirdplace=z;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }
    if(z>x){
        if(z>y) {
          if (x>y){
                    firstplace=z; secondplace=x; thirdplace=y;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }
    if(z>x){
        if(z>y) {
          if (x<y){
                    firstplace=z; secondplace=y; thirdplace=x;         
                    System.out.println("The descending numbers are: ");
                    System.out.println(""+firstplace);
                    System.out.println(""+secondplace);
                    System.out.println(""+thirdplace);
                }
            }
        }     
//all equal values
    if (x==y){ 
        if (x==z){ 
            if (z==y) {
                System.out.println("All values are equal");
            }
        }
    }

 //if x is greater and y=z
if(x>y){
    if (x>z) { 
        if (y==z) {
         firstplace=x; secondplace=y; thirdplace=z;
         System.out.println("The descending numbers are:");
         System.out.println(""+firstplace);
         System.out.print(""+secondplace);
         System.out.print(","+thirdplace);
         System.out.println(" Two bottom values are equal");
        
    
        }
    }
}
//if y is greater and x=z
if(x<y){
  if (z<y){ 
    if (x==z) {
         firstplace=y; secondplace=x; thirdplace=z;
         System.out.println("The descending numbers are:");
         System.out.println(""+firstplace);
         System.out.print(""+secondplace);
         System.out.print(","+thirdplace);
         System.out.println(" Two bottom values are equal");
        }
    }
}
        
//if z is greater y=x
 if(x<z){
     if (z>y){ 
        if (x==y){
         firstplace=z; secondplace=x; thirdplace=y;
         System.out.println("The descending numbers are:");
         System.out.println(""+firstplace);
         System.out.print(""+secondplace);
         System.out.print(","+thirdplace);
         System.out.println(" Two bottom values are equal");
        }
    }
}
                  
//if x=y and z is less than both
 if(x>z){
     if(z<y){
         if(x==y){
         firstplace=x; secondplace=y; thirdplace=z;
         System.out.println("The descending numbers are:");
         System.out.print(""+firstplace);
         System.out.println(", "+secondplace);
         System.out.println("Two top values are equal");
         System.out.println(""+thirdplace);
        }
    }
}
                    
//if z=y and x is less than both
 if(x<z){
     if(x<y){ 
         if(z==y){
         firstplace=y; secondplace=z; thirdplace=x;
         System.out.println("The descending numbers are:");
         System.out.print(""+firstplace);
         System.out.println(", "+secondplace);
         System.out.println("Two top values are equal");
         System.out.println(""+thirdplace);
        }
    }
}
               
//if z=x and y is less than both
 if(y<z){
     if(x>y){
         if(z==x){
         firstplace=z; secondplace=x; thirdplace=y;
         System.out.println("The descending numbers are:");
         System.out.print(""+firstplace);
         System.out.println(", "+secondplace);
         System.out.println("Two top values are equal");
         System.out.println(""+thirdplace);
        }
    }
}
          

}
}







 
