import java.util.StringTokenizer;

public class BetterProgrammerTask {

    public static String capitalizeFirstLetters(String s) {
        StringTokenizer a = new StringTokenizer(s);
        String[] result = new String[a.countTokens()];
        int counter = 0;
        // add to an array
        while (a.hasMoreTokens()) {
            result[counter] = a.nextToken();
            counter++;
        }
        // capitalize first letter and add to output String
        String output = "";
        for (int i = 0; i < result.length; i++) {
            char c = result[i].charAt(0);
            if (Character.isLetter(c)) {
                c = Character.toUpperCase(c);
                result[i] = c + result[i].substring(1);
            }
            output += result[i];
        }
        return output;
    }
}
