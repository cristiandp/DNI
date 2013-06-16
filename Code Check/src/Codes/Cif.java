package Codes;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Cif extends Id {
 static StringBuilder code = new StringBuilder();



	public Cif(String code){
		super(code);
		this.code.delete(0, this.code.length());
		this.code.append(code);
	}
	
	
	
	public static boolean isCif(){
		
		Pattern cifPattern = Pattern.compile("([A-H]|[J-N]|[P-S]|[V])\\d{8}");
		Matcher m = cifPattern.matcher(code);
		if (m.matches()){
			return true;
		}else	
		return false;
		
	}
	
	public String getCif(){
		
		return code.toString();
		
	}
}
