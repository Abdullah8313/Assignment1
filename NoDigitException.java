package assign1;


public class NoDigitException extends RuntimeException {
  private static final long serialVersionUID = 4249766279098595828L;

  public NoDigitException() {
    super("The password must contain at least one digit");
  }
}
