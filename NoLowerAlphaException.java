package assign1;

public class NoLowerAlphaException extends RuntimeException {
	  private static final long serialVersionUID = -2485490956722223156L;
	  
	  public NoLowerAlphaException(){
	    super("The password must contain at least one lowercase alphabetic character");
	}
	}