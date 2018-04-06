package week2

import math.abs

object Session2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(93); 
  println("Welcome to the Scala worksheet");$skip(107); 

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$0 = 

  product(x => x * x)(1, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(49); 

  def fact(n: Int): Int = product(x => x)(1, n);System.out.println("""fact: (n: Int)Int""");$skip(11); val res$1 = 

  fact(3);System.out.println("""res1: Int = """ + $show(res$1));$skip(23); val res$2 = 

  product(fact)(2, 3);System.out.println("""res2: Int = """ + $show(res$2));$skip(28); 

  val tolerance = 0.000001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(81); 

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) /x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(234); 

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  };System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(30); val res$3 = 
  fixedPoint(x => 1 + x/2)(1);System.out.println("""res3: Double = """ + $show(res$3));$skip(57); 
  
  def sqrt(x: Double) = fixedPoint(y => (y+x/y)/2)(1);System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$4 = 
 
 sqrt(4);System.out.println("""res4: Double = """ + $show(res$4))}
}
