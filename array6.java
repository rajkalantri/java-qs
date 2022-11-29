import java.util.*;

public class array6 {
    public static int Largest(int num[])
    {
        int L = Integer.MIN_VALUE;
        int S = Integer.MAX_VALUE;

        for(int i = 0;i<num.length;i++)
        {
            if(L<num[i])    L = num[i];
            if(S>num[i])    S = num[i];
        }

        System.out.println("Smallest is: "+S);

        return L;
    }

    public static void main(String[] args) {
        int num[] = {1,2,3,6,5};
        System.out.println("Largest is "+Largest(num));
    }
}
