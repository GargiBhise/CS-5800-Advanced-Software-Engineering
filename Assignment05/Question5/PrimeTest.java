import static org.junit.Assert.assertTrue;

public class PrimeTest {

        @Test
        public void testnumbers() 
        {
                Prime obj = new Prime();
                assertTrue(obj.isPrime(2));
                assertTrue(obj.isPrime(3));
                assertTrue(obj.isPrime(4));
                assertTrue(obj.isPrime(5));
                assertTrue(obj.isPrime(6));
        }