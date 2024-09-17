import java.util.*;
class Practice1 {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
        // //count positive anad negative numbers
        //   public  static void PositiveNegative(int arr[],int  n ){
        //     int positivecount=0;
        //     int negativecount=0;
        //     for(int i:arr){
        //         if(i > 0){
        //             positivecount++;
        //         }
        //         else if(i<0){
        //             negativecount++;
        //         }    
                    

        //         }
        //         System.out.println("Positive count="+positivecount);
        //         System.out.println("Negative count="+negativecount);

        //     }
        //     public static void main(String[] args) {
        //         Scanner sc= new Scanner(System.in);
        //         System.out.println("enter the length of the array");
        //         int n = sc.nextInt();

        //         int arr1[]= new int[n];
        //         System.out.println("Enter the elements of the array");
        //         for(int i=0;i<n;i++){
        //              arr1[i]=sc.nextInt();
        //         }

        //     }

        //Misssing number in range
        System.out.println("enter the length of first array");
       int n= sc.nextInt();
       int arr[]= new int[n];
       System.out.println("Enter the elements of first array");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
        Arrays.sort(arr);
        int sum=(n)*(n+1)/2;
        System.out.println(sum);
        for(int i=0;i<n;i++)
        {
            sum=sum-arr[i]; 
        }
        System.out.println("Missing Element is "+sum); 
  
       
        
        }       
}
        
        
    

