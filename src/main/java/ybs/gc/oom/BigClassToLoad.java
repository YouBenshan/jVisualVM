package ybs.gc.oom;

public class BigClassToLoad {
	public static final String CONSTANT = new String(new char[1 << 16]);

	public BigClassToLoad() {

	}
}
