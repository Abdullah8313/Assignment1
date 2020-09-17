package assign1;


public class InvalidSequenceException extends RuntimeException {
  private static final long serialVersionUID = -7298603562572665902L;

  public InvalidSequenceException() {
    super("The password cannot contain more than two of the same character in sequence");
  }
}