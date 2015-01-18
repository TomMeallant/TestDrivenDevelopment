package fr.ttd.expression;

import fr.ttd.bank.Bank;

/**
 * Created by Tom on 13/01/2015.
 */
public class Money extends Expression {
	protected String currency;
	protected int amount;

	Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public static Money dollar(int amount) {
		return new Money(amount, "USD");
	}

	public static Money franc(int amount) {
		return new Money(amount, "CHF");
	}

	public String currency() {
		return currency;
	}

	public String toString() {
		return amount + " " + currency;
	}

	public boolean equals(Object object) {
		Money money = (Money) object;
		return amount == money.amount
				&& currency().equals(money.currency());
	}

	public Expression times(int multiplier) {
		return new Money(amount * multiplier, currency) {
		};
	}

	public Money reduce(Bank bank, String to) {
		int rate = bank.rate(currency, to);
		return new Money(amount / rate, to);
	}
}
