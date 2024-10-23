import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력");
        int a = sc.nextInt();

        int [] b = {2,4,6,8,10};
        boolean c = false;

        for (int i = 0;i < b.length;i++) {
            if(a==b[i]){
                c = true;
                System.out.println("존재");
                break;
            }
            }
        if(!c) {
            System.out.println("없음");
    }
    }
}
