import java.util.*;
class Patterns{
    public static void main(String[] args){
   Scanner scan=new Scanner(System.in);
   int r=scan.nextInt();


  for(int i=1;i<=2*r;i++){
    if(i<=r){
    for(int j=1;j<=i;j++){
        
            System.out.print("*"+" ");
      
    
    }
    }
    
    else{
        for(int j=1;j<(2*r-i+1);j++){
            System.out.print("*"+" ");
        }
    }
       
    System.out.println();






    }
      * 
    * * 
  * * * 
* * * * 
  * * * 
    * * 
      * 

 for( int i=1;i<2*r;i++){
    int spaces;
    int stars;
    if(i<r){
    spaces=r-i;
     stars=i;
    }
    else{
        spaces=i-r;
        stars=2*r-i;
    }
    for(int j=1;j<=spaces;j++){
        System.out.print(" ");
    }
    for(int k=1;k<=stars;k++){
        System.out.print("* ");
    }
    System.out.println();
 }


    


}
    }
