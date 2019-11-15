package tk.pratanumandal.unique4j;

public class Unique4jException extends Exception {
	
	private static final long serialVersionUID = 268060627071973613L;

	public Unique4jException() {
		super();
	}

	public Unique4jException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public Unique4jException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public Unique4jException(String arg0) {
		super(arg0);
	}

	public Unique4jException(Throwable arg0) {
		super(arg0);
	}

}