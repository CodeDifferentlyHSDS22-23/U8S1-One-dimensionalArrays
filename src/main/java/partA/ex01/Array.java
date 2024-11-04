package partA.ex01;

public class Array {

    public static String fixArray(){
        String response = "";

        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        response += (primes2[0]);
        primes2[0] = 5;
        response += (primes[0]);

        // ** Your Code Here ***

        //int[] primeNum = new long[20];
        //int even=new int[5];
        return response;

    }
    public static void main(String args[]) {
        String arrayOutput = fixArray();
        System.out.println(arrayOutput);




    }
}
