package Questions;
//Print number from 1 to 100 the condition is,print following words instead of numbers,when it is divisible by 3 print "Fizz" ,when divisible by 5 print "Buzz"
// and it is divisible by both i.e., 3 and 5 print "FizzBuzz"


public class FizzBuzz {
    public static void main(String[] args) {

        int i;

        for(i=1;i<=100;i++)
        {

            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzbuzzFizz");
            }
            else if (i%5==0)
            {
                System.out.println("Buzz");

            } else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else System.out.println(i);


        }



    }
}
