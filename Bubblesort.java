
public class Bubblesort {
    public static void printarr(int arr[]){
        System.out.println("Sorting Array elements is ");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }

    }
    public static void main(String[] args){
                int arr[]={8,6,5,9,2,7,3,9};
                //Bubble sorting

   
   for(int i=0; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){
           if(arr[j]>arr[j+1]){
            //Swapping 
             int temp=arr[j];
             arr[j]=arr[j+1];
             arr[j+1]=temp;

           }
      }
                }
        printarr(arr);
    }
    
}
