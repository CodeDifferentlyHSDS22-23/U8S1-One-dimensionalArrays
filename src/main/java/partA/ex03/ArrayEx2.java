package partA.ex03;

public class ArrayEx2 {
    public static String arrayExample(){
        String response = "";

        String[] browsers = new String[3];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        response += ("size of array" + browsers.length);


        // ** Your Code Here ***


        return response;

    }
    public static void main(String args[]) {
        String arrayOutput = arrayExample();
        System.out.println(arrayOutput);

    }
}
