package assign1;

public class WeakPasswordException extends RuntimeException {
	  private static final long serialVersionUID = -2738304578553934504L;

	  public WeakPasswordException() {
	    super("The password is OK but weak - it contains fewer than 10 characters");
	  }



	}