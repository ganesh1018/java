class CeilingOfNumber{
    public static void main(String args[]){
        int arr[]={2,3,5,9,14,16,18};
        int target=19;
        //ceiling means smallest element in array that is greter or equal to the target
        //ceiling number is 16 for the above problem
        int start=0;
        int end=arr.length-1;
       while(start<end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
           System.out.print(mid);
           return;
        }
        else if(arr[mid]>target){
            end=mid;

        }
        else{
            start=mid+1;
        }

        

       }
       System.out.print(arr[start]+" "+end);

    }

}