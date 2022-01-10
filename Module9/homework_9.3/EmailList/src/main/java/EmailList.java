import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {

    List<String> mailTree = new ArrayList<>();

    public void add(String emailIn) {
        // TODO: валидный формат email добавляется

        String regex = "[A-z@.]+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailIn);

        String email = "";
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            email = email + emailIn.substring(start, end);
        }

        int count = 0;
        String regexDot = "[@.]+";
        Pattern patternDot = Pattern.compile(regexDot);
        Matcher matcherDot = patternDot.matcher(email);
        while (matcherDot.find()) {
            count++;
        }

        if (count == 2) {
            mailTree.add(emailIn.toLowerCase());
        } else {
            System.out.println(Main.WRONG_EMAIL_ANSWER);
        }
    }

    public List<String> getSortedEmails() {
        Set<String> set = new HashSet<>(mailTree);
        mailTree.clear();
        mailTree.addAll(set);
        java.util.Collections.sort(mailTree);
        return mailTree;
    }

}
