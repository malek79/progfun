package week2

object Session3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(29); 
  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(29); 
  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(12); val res$0 = 
  x - y - z;System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(8); val res$1 = 
  y + y;System.out.println("""res1: week2.Rational = """ + $show(res$1));$skip(8); val res$2 = 
  x < y;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(11); val res$3 = 
  x.max(y);System.out.println("""res3: week2.Rational = """ + $show(res$3));$skip(26); 
  val b = new Rational(8);System.out.println("""b  : week2.Rational = """ + $show(b ))}
}

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non zero")
  def this(x: Int) = this(x,1)
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def +(that: Rational) =
    new Rational(
      numer * that.denom + denom * that.numer, denom * that.denom)

  def unary_- : Rational = new Rational(-numer, denom)

  def <(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational) = if (this < that) that else this

  def -(that: Rational) = this + -that

  override def toString = numer + "/" + denom
}
