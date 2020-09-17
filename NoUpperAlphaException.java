package assign1;

public class NoUpperAlphaException extends RuntimeException {
	  private static final long serialVersionUID = -6629982197836576074L;

	  public NoUpperAlphaException() {
	    super("The password must contain at least one uppercase alphabetic character");
	  }

	}