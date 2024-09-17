public class Main{
    public static void main(String []args) {
      int arr[] = {5,2,9,3,6};
    int secondlargest=0;
    int max = arr[0];
    int n = arr.length;
    for(int i=0;i<n;i++) {
        if (max<arr[i]){
            secondlargest=max;
            max=arr[i];
            
        }
        else if(secondlargest<arr[i] && secondlargest!=max){
            secondlargest=arr[i];
        }
        
    }
    System.out.println(secondlargest);
    }
    }
