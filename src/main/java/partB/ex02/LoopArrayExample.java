package partB.ex02;

public class LoopArrayExample {
    public static String arrayLoop() {
        String response = "";

        int[] numbers = {14, 22, 89, 33};

        response += ("Using a for Loop:");
        for(int i = 0; i < numbers.length; i++){
            response += (numbers[i]);
        }

        return response;
    }

    public static void main(String[] args) {
        String output = arrayLoop();
        System.out.println(output);


    }

}
