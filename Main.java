public class Main{
    public static void main(String []args) {
      int arr[] = {4,6,1,9,2};
    int min=arr[0];
    int n = arr.length;
    for(int i=0;i<n;i++) {
        if(min > arr[i]){
           min=arr[i]; 
        }
        
    }
    System.out.println(min);
    
    }
}
