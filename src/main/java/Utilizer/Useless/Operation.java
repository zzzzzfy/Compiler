package Utilizer.Useless;

import java.util.HashSet;
import java.util.LinkedList;

public class Operation {

	public static <T> void selfUnion(HashSet<T> a, HashSet<T> b) {
		a.addAll(b);
	}

	public static <T> HashSet<T> minus(HashSet<T> a, HashSet<T> b) {
		HashSet<T> c = new HashSet<>();
		for (T data: a) {
			if (!b.contains(data)) c.add(data);
		}
		return c;
	}

	public static <T> LinkedList<T> intersect(LinkedList<T> a, LinkedList<T> b) {
		LinkedList<T> res = new LinkedList<>(), tmp;
		if (a.size() > b.size()) {
			tmp = a;
			a = b;
			b = tmp;
		}
		for (T data: b) {
			if (a.contains(data)) res.add(data);
		}
		return res;
	}
}
