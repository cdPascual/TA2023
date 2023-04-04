package stringBuilder;

public class useStringBuilder {

	public static void main(String[] args) {
		String str = "Hello";
		
		StringBuffer buffer = new StringBuffer(str);
		buffer.append("java");
		
		System.out.println(buffer);
		
		StringBuilder builder = new StringBuilder(str);
		builder.reverse();
		System.out.println(builder);

	}


}
