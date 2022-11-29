public class array4 {
    public static void update(int marks[], int nChange)
    {
        nChange = 10;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]++;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97,98,99};
        int nChange = 5;
        update(marks, nChange);

        System.out.println(nChange);

        for(int i=0;i<=marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
