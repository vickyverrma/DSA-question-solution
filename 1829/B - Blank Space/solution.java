import java.util.Scanner;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i<N; i++)
        {
            int a = sc.nextInt();
            int res = 0;
            int curr = 0;
            for(int j = 0; j<a; j++)
            {
                int temp = sc.nextInt();
                if(temp == 0)
                {
                    curr++;
                }
            else
            {
                res = Math.max(res,curr);
                curr = 0;
            }
    }
        res = Math.max(res,curr);
        System.out.println(res);
}
 
}
}