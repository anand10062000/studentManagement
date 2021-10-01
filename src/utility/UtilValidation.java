package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilValidation {
	public static boolean startWithCapital(String input) {
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{1,6}$");
		Matcher matcher=pattern.matcher(input);
		return matcher.find();
	}
	public static boolean phoneNum(String input) {
		Pattern pattern = Pattern.compile("^[6-9]{1}[0-9]{9}$");
		Matcher matcher=pattern.matcher(input);
		return matcher.find();
	}
	public static boolean emailIdValidation(String input) {
		Pattern pattern = Pattern.compile("^[a-z]{1,16}+@+[a-z]{5}+.+[a-z]{3}$");
		Matcher matcher=pattern.matcher(input);
		return matcher.find();
	}
}
