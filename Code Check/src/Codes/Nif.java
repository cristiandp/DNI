package Codes;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public  class Nif extends Id {
	StringBuilder code = new StringBuilder();

	public Nif(String code) {
		super(code);
		this.code.delete(0, this.code.length());
		this.code.append(code);
	}

	public boolean isNif() {

		Pattern nifPattern = Pattern.compile("[K-M]\\d{7}");
		Matcher m = nifPattern.matcher(code.toString());
		if (m.matches()) {
			return true;
		} else
			return false;

	}

	public String getNif() {

		return code.toString();

	}
	

}
