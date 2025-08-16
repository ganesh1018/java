import java.util.Arrays;
class Bubblesort{
    public static void main(String[] args){

       int[] arr={6,9,3,8,-3,5,-1};
      // bubblesort(arr);
      //insertionsort(arr);
      selectionsort(arr);
       System.out.print(Arrays.toString(arr));


    }
    public static void bubblesort(int[] arr){

        for(int i=0;i<arr.length;i++){
             boolean swap=true;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=false;
                }
            }
            if(swap){
                break;
            }
        }
    }

    public static void insertionsort(int[] arr){
         for(int i=0;i<arr.length;i++){
             boolean swap=true;
            for(int j=arr.length-1;j>=i+1;j--){
                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=false;
                }
            }
            if(swap){
                break;
            }
        }

    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int swapindex=arr.length-i-1;
            int max=0;
            for(int j=0;j<=swapindex;j++){
                if(arr[j]>arr[max]){
                    max=j;
                }
                
            }
            int temp=arr[swapindex];
            arr[swapindex]=arr[max];
            arr[max]=temp;

        }
    }
}