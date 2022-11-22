public class ASSIGNMENT_2 {
    public static void main(String[] args) {
        int n = 5, i = 1, x = 2, j, count;
        while(i <= n) {
            for (count = 0, j = 1; j<=x; j++) {
                if (x%j==0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println(x);
                x++;
                i++;
            } else
                x++;
        }
    }
}

