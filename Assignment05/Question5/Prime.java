public class Prime {
        public boolean isPrime(int number) {
                int count = 0;
                for (int i = 1; i <= (number/2)+1; i++) {
                        if (number % i == 0) {
                                count++;
                        }
                }
                // count value is equals to 2 then it is prime number
                if (count != 0) {
                        return true;
                } else {
                        return false;
                }
        }
}