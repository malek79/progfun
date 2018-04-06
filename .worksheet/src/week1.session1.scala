package week1

object session1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  println("Welcome to the Scala worksheet");$skip(47); 
  
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(129); 
  
  def sqrtIter(guess: Double, x: Double): Double =
  if ( isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x);System.out.println("""sqrtIter: (guess: Double, x: Double)Double""");$skip(102); 
  
  def isGoodEnough(guess: Double, x: Double): Boolean =
  abs(guess * guess - x) / x < 0.000000001;System.out.println("""isGoodEnough: (guess: Double, x: Double)Boolean""");$skip(79); 
  
  def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2;System.out.println("""improve: (guess: Double, x: Double)Double""");$skip(50); 
  
  def sqr(x: Double):Double = sqrtIter(1.0, x);System.out.println("""sqr: (x: Double)Double""");$skip(15); val res$0 = 
  
  
  sqr(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(15); val res$1 = 
  
  sqr(1e10);System.out.println("""res1: Double = """ + $show(res$1))}
  
}
