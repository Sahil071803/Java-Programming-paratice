public class num{
    public static void main(String[] args){

       int n = 13839;

       int rem;

       int count = 0;

    //    for(int i = 0; i < n.length; i++){

    //     if(n[i] == 3){



    //         count ++;
    //     }
    //    }
          
          while(n > 0){
            rem = n % 10;

            if(rem == 3){
                count++;

            }

            n = n / 10;
          }





        System.out.println(count);
    }
}