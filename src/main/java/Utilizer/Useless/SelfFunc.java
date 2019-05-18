package Utilizer.Useless;

public class SelfFunc {
	public static boolean isPow2(long t) {
		if (t <= 0) return false;
		while (t != 1) {
			if ((t & 1) == 1) return false;
			t >>= 1;
		}
		return true;
	}

	public static long log2(long x) {
		long len = 0;
		while (x != 1) {
			++len;
			x >>= 1;
		}
		return len;
	}
}
