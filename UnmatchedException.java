package assign1;

public class UnmatchedException extends RuntimeException {
	  private static final long serialVersionUID = -8298259736823227585L;

	  public UnmatchedException() {
	    super("The passwords do not match");
	  }

	}