package partB.ex01;

public class ArraySampleExample {
    public static String arraySample() {
        String response = "";

        int primes[] = {2,3,5,7,11,13,17};
        response +=  ("Array length: " + primes.length);

        response +=  ("The first few prime numbers are:");


        for (int i : primes) {

            response += (i);

        }

        return response;
    }

    public static void main(String[] args) {
        String outputExample = arraySample();
        System.out.println(outputExample);


    }
}
