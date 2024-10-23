public class Question4 {
    public static void main(String[] args) {
        int[] a = {3,7,2,9,4};
        int b = a[0];

        for(int i=1;i<a.length;i++)
            if (a[i]>b){
                b=a[i];
            }
        System.out.println(b);

    }
}
