package partB.ex03;

public class FixMeExample {
    public static String fixExample() {
        String response = "";

        String[] browsers = new String[3];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        response += ("size of array" + browsers.length);


        return response;
    }

    public static void main(String[] args) {
        String output = fixExample();
        System.out.println(output);


    }}


