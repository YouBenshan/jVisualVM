package ybs.gc.oom;

public class SmallClassToLoad {
	public static final String CONSTANT = new String(new char[1 << 12]);

	public SmallClassToLoad() {

	}

}
