package regExpression;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regExp {

	public static void main(String[] args) {
		String email = "";
		String pattern ="^[A-Za-z0-9+_.-]{8,25}@[A-za-z0-9+_-]+\\.[A-Za-z]{2,4}$";
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher(email);
		
		System.out.println(m);

	}

}
