package assign1;


public class LengthException extends RuntimeException {
  private static final long serialVersionUID = -4902259964747550272L;

  public LengthException() {
    super("The password must be at least 6 characters long");
  }
}