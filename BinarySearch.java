import java.util.Scanner;
class BinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements in sorted manner: ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
        int result=Sorted(arr,n);
        System.out.println("Result: "+result);
        sc.close();
    }
    static int Sorted(int arr[],int n) 
    {
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==mid)
            {
                return mid;
            }
            if(arr[mid]<mid) 
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
        }
        return -1;
    }

}