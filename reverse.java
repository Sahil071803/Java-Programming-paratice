public class reverse {
    public static void main(String[] args){

        int num = 123456;

        int rem;

        int ans = 0;

        while(num > 0){

            rem = num % 10;

            num = num / 10;

            ans = ans * 10 + rem;


        }

        System.out.println(ans);


    }
}
