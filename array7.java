public class array7 {
    public static int bs(int num[],int k)
    {
        int start = 0, end = num.length-1;

        while(start<=end)
        {
            int mid = (start + end)/2;

            if(num[mid]==k) return mid;
            if(num[mid]<k)  start = mid+1;
            else    end = mid-1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,12,14};
        int k = 10;
        System.out.println("Index for key is : "+bs(num,k));
    }
}
