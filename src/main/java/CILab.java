import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String[] acceptablePatterns = {"[a-z]*", "[A-Z]*", "[A-Z][a-z]*"};
        for (int i = 0; i < acceptablePatterns.length; i++){
            Pattern pattern = Pattern.compile(acceptablePatterns[i]);
            Matcher matcher = pattern.matcher(myString);
            if (matcher.find()){
                return true;
            }
        }
        return false;
    }

}

