import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCaseCalculadora {

	@Test
	public void testExecutaCalculadora(){
		float value1 = 10;
		float value2 = 5;
		float retornoEsperado = 15;
		
		float retornoFeito = Calculadora.soma(value1, value2);
		
		assertEquals(retornoEsperado, retornoFeito, 0);
		
		
		
	}

}
