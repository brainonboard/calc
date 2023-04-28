/**
 * 
 */
package es.brainonboard.calc.enums;

public enum EOperation {
	A("ADD"),
    S("SUBTRACT");
	
	private String value;
	
	private EOperation(String value) {
		this.value=value;
	}
	
   public String getValue() {
	      return value;
   }	
}
