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
}
    }
