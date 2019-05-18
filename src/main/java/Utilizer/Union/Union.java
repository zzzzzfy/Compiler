package Utilizer.Union;

import java.util.HashMap;

public class Union<T> {
	HashMap<T, T> pnt;
	HashMap<T, Integer> size;

	public Union() {
		pnt = new HashMap<>();
		size = new HashMap<>();
	}

	public T find(T a) {
		if (!pnt.containsKey(a)) {
			pnt.put(a, a);
			size.put(a, 1);
		}
		T fa = pnt.get(a);
		if (fa.equals(a)) return a;
		else{
			T res = find(fa);
			pnt.replace(a, fa, res);
			return res;
		}
	}

}
