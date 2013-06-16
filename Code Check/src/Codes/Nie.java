package Codes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Nie extends Nif {
static StringBuilder code = new StringBuilder();



	public Nie(String code){
		super(code);
		this.code.delete(0, this.code.length());
		this.code.append(code);
	}
	
	
	
	public static boolean isNie(){
		
		Pattern niePattern = Pattern.compile("[X-Z]\\d{7}");
		Matcher m = niePattern.matcher(code);
		if (m.matches()){
			return true;
		}else
			
		return false;
		
	}
	
	public String getNie(){
		
		return code.toString();
		
	}

}