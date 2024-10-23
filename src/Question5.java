public class Question5 {
    public static void main(String[] args) {
        int[] a = {12,3,19,7,5};
        int b = a[0];

        for(int i=0;i<a.length;i++) {
            if(a[i] < b) {
                b=a[i];
            }
        }
        System.out.println(b);
    }
}
