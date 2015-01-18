package fr.ttd.utils;

/**
 * Created by Tom on 14/01/2015.
 */
public class Pair {
	private String from;
	private String to;

	public Pair(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public boolean equals(Object object) {
		Pair pair = (Pair) object;
		return from.equals(pair.from) && to.equals(pair.to);
	}

	public int hashCode() {
		return 0;
	}
}
