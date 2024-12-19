class RotatedArray {
    public static void main(String[] args) {
        int[] arr={99,100,1,2,3,4};
        int n=arr.length;
        int target=99;
        int result=Sort(arr,n,target);
        System.out.println("Result: "+result);
    }
    static int Sort(int arr[],int n,int target) {
        int low=0;
        int high=n-1;
        while(low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target) {
                return mid;
            }
            if(arr[low]<=arr[mid]) {
            if(arr[low]<=target && target<arr[mid]) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        } else {
            if(arr[mid]<target && target<=arr[high]) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
    }
        return -1;
    }
}