package assign1;

public class NoSpecialCharacterException extends RuntimeException {
	  private static final long serialVersionUID = 2168095776341246515L;

	  public NoSpecialCharacterException() {
	    super("The password must contain at least one special character ");
	  }

	}
