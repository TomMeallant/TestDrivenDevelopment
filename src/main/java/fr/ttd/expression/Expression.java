package fr.ttd.expression;

import fr.ttd.bank.Bank;

/**
 * Created by Tom on 13/01/2015.
 */
public abstract class Expression {
	public abstract Money reduce(Bank bank, String to);

	Expression plus(Expression addend) {
		return new Sum(this, addend);
	}

	abstract Expression times(int multiplier);
}
