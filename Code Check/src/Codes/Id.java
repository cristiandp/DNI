package Codes;
public abstract class Id {
	private StringBuilder code=new StringBuilder();
	
	public Id(String code) {
		this.code.append(code.toUpperCase());
	}
	

	}