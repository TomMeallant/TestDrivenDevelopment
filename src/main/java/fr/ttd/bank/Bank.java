package fr.ttd.bank;

import fr.ttd.expression.Expression;
import fr.ttd.expression.Money;
import fr.ttd.utils.Pair;

import java.util.Hashtable;

/**
 * Created by Tom on 13/01/2015.
 */
public class Bank {
	private Hashtable rates = new Hashtable();

	public Money reduce(Expression source, String to) {
		return source.reduce(this, to);
	}

	public void addRate(String from, String to, int rate) {
		rates.put(new Pair(from, to), new Integer(rate));
	}

	public int rate(String from, String to) {
		if (from.equals(to)) return 1;
		Integer rate = (Integer) rates.get(new Pair(from, to));
		return rate.intValue();
	}
}
