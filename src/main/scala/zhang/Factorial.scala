package zhang
import java.math.BigInteger

class Factorial {
  def factorial(x:BigInteger):BigInteger = {
    if (x == BigInteger.ZERO)
      BigInteger.ONE
    else
      x.multiply(factorial(x.subtract(BigInteger.ONE)))
  }
}
