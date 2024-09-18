
import java.util.*;
public class Arrayquestion {
    public static void main(String[] args) {
         
        Scanner sc= new Scanner(System.in);

//largest element in an array

    int arr[]= new int[5];
    for(int i =0;i<arr.length-1; i++){
        arr[i]= sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[arr.length-1]);

// //reverse  array by creating new array
//     System.out.println("enter the length of an array");
//     int n= sc.nextInt();

//     int arr[]= new int[n];
//     int arr2[]= new int[n];
//     System.out.println("Enter the elements of array");
//     for(int i=0;i<arr.length;i++){
//         arr[i]=sc.nextInt();
//     }

//     for (int i =0 ; i<arr.length;i++){
//         arr2[i]=arr[arr.length-1-i];
//     }

//     System.out.println("The reversed array is:");
//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr2[i]);
//     }
    

// //find the sum of all elements of array
//     System.out.println("enter the length of an array");
//        int n= sc.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter the elements of array");
//          for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//          }
//          int sum=0;
//          for(int i=0;i<arr.length;i++){
//             sum= sum+arr[i];
//          }
//          System.out.println("the sum of all elements of array is: " +sum);
     

// //average of all elements of an array
//     System.out.println("enter the length of an array");
//        int n= sc.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter the elements of array");
//          for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//          }
//          int sum=0;
//          for(int i=0;i<arr.length;i++){
//             sum= sum+arr[i];
//          }
//          int average = sum/arr.length;
//          System.out.println("the average of all elements of array is: " +average);



// //remove the duplicate elements from an array
//          System.out.println("enter the length of an array");
//        int n= sc.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter the elements of array");
//          for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//          }

//          int a=0;
// //for finding the duplicate values
//          for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                      a=arr[i]; 
//                      System.out.println("Duplicate value:"+a);
//                      return;
                                       
//                 }
//                 else{
//                       a= 0;
//                 }
//             }
//          }
//        System.out.println("the sorted array is:");
//         Arrays.sort(arr);
//         for(int i=0; i<n;i++){
//             System.out.println(arr[i]);
//         }
       
//             System.out.println("The array with unique values is");
//             int[] temp = new int[n];  
//             int m = 0;  
//             for (int k=0; k<n-1; k++){  
//                 if (arr[k] != arr[k+1]){  
//                 temp[m++] = arr[k];  
//             }  
            
//          }  
//         temp[m++] = arr[n-1]; 

//         for (int i=0; i<m; i++){  
//             arr[i] = temp[i];  
//         }  
//         for (int i=0; i<n-1; i++){
//             System.out.println(temp[i]);
//         }
     

// //merge two arrays in a single array
//     System.out.println("enter the length of first array");
//        int n= sc.nextInt();
//        int arr[]= new int[n];
//        System.out.println("Enter the elements of first array");
//          for(int i=0;i<arr.length;i++){
//              arr[i]=sc.nextInt();
//             }
//        System.out.println("enter the length of second array");
//         int m= sc.nextInt();
//         int arr1[]= new int[m];
//         System.out.println("Enter the elements of second array");
//               for(int i=0;i<arr1.length;i++){
//                   arr1[i]=sc.nextInt();
//                  }

//             System.out.println(" ");     

//             int length1=arr.length;
//             int length2=arr1.length;
//             int c=length1+length2;
//             System.out.println("the length of the resultant array is:"+c);
            

//              int arr3[] = new int[c];
//              System.arraycopy(arr, 0, arr3, 0, length1);
//              System.arraycopy( arr1, 0, arr3, length1 ,length2);
             
//              System.out.println(Arrays.toString(arr3)); 
}

}
    

