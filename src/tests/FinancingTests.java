package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import domain.Financing;

public class FinancingTests {

//***********setTotalAmount************
	@Test
	public void contructorShouldCreateObjectWhenValidData() {

		Financing f = new Financing(10000.0, 2000.0, 80);

		Assertions.assertEquals(10000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}

	@Test
	public void setTotalAmountShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setTotalAmount(90000.0);

		Assertions.assertEquals(90000.0, f.getTotalAmount());

	}

	//*******entry**********
	
	@Test
	public void setTotalAmounShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);

		});

	}

	@Test
	public void setIncomeShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setIncome(2100.0);

		Assertions.assertEquals(2100.0, f.getIncome());

	}

	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);

		});

	}

	// *****setMonths***********

	@Test
	public void setMonthsShouldSetDataWhenValidData() {

		Financing f = new Financing(100000.0, 2000.0, 80);

		f.setMonths(81);

		Assertions.assertEquals(81, f.getMonths());

	}

	@Test
	public void setMonthShouldThrowIllegalArgumentExceptionWhenInvalidData() {

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setMonths(79);

		});

	}
	
	// *******setIncome***************

	public void entryShouldCalculateEntryCorrectly() {
		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(20000.0, f.entry());

	}
	
	//********quota********
	
	public void quotaShouldCalculateQuotaCorrectly() {
		Financing f = new Financing(100000.0, 2000.0, 80);

		Assertions.assertEquals(1000.0, f.quota());

	}
}
