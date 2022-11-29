import java.util.*;

public class array5 {

    public static int ls(int num[],int K,int n) {
        for(int i = 0;i<n;i++)
        {
            if(num[i] == K) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int num[] = new int[100];

        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of string: ");
        int n = s.nextInt();
        System.out.println("String:");
        for(int i=1;i<=n;i++)
        {
            num[i] = s.nextInt();
        }

        System.out.println("Enter Key:");
        int K = s.nextInt();

        int index = ls(num,K,n);
        if(index == -1) System.out.println("NOT FOUND");
        else    System.out.println("Key is at index: "+index);
    }
}
