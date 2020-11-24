package PrimeFactors;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeFactorsTest {

	@Test
	void factors()
	{
	assertThat(factorsOf(1),is(Arrays.asList()));
	assertThat(factorsOf(2),is(Arrays.asList(2)));
	assertThat(factorsOf(4),is(Arrays.asList(2,2)));
	assertThat(factorsOf(6),is(Arrays.asList(2,3)));
	assertThat(factorsOf(8),is(Arrays.asList(2,2,2)));
	assertThat(factorsOf(9),is(Arrays.asList(3,3)));
	assertThat(factorsOf(10),is(Arrays.asList(2,5)));

	}

	private List<Integer> factorsOf(int n) {
	 int reminder = n;
	 int devisor=2;
	 List<Integer> factors = new ArrayList<Integer>();
	 	while(reminder>1)
	 	{
	 		if(reminder%devisor==0)
	 		{
	 			factors.add(new Integer(devisor));
	 		reminder = reminder/devisor;
	 		}
	 		else
	 		{
	 			devisor++;
	 		}
	 	}
	 	if(reminder>1) {
		 	factors.add(reminder);
	 		}
		return factors;
	}
}
