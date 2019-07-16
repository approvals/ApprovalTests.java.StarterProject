package org.samples;

import java.util.function.Supplier;
import java.util.stream.Stream;

import org.junit.Test;

public class DecisionTreeSamples {

	@Test
	public void test() {
		System.out.println(getTenisScore());

	}

	public String getTenisScore() {
		return findFirstNonNull(this::Win, this::Advantage, this::ScoreNormal, this::ScorePerson1, this::ScorePerson2,
				this::ScoreTie);
	}

	public String getTenisScore2() {
		String out = null;
		out = doIfNull(out, this::Win);
		out = doIfNull(out, this::Advantage);
		out = doIfNull(out, this::ScoreNormal);
		out = doIfNull(out, this::ScorePerson1);
		out = doIfNull(out, this::ScorePerson2);
		out = doIfNull(out, this::ScoreTie);
		return out;
	}

	private <T> T doIfNull(T out, Supplier<T> function) {
		if (out != null) {
			return out;
		}
		return function.get();
	}

	public static <T> T findFirstNonNull(Supplier<T>... functions) {
		return Stream.of(functions).map(n -> n.get()).filter(n -> n != null).findFirst().get();
	}

	public String Win() {
		return null;
	}

	public String Advantage() {
		return null;
	}

	public String ScoreNormal() {
		return null;
	}

	public String ScorePerson2() {
		return "Person 2";
	}

	public String ScorePerson1() {
		return null;
	}

	public String ScoreTie() {
		return null;
	}

}
