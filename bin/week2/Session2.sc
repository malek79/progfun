package week2

import math.abs

object Session2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)              //> product: (f: Int => Int)(a: Int, b: Int)Int

  product(x => x * x)(1, 4)                       //> res0: Int = 576

  def fact(n: Int): Int = product(x => x)(1, n)   //> fact: (n: Int)Int

  fact(3)                                         //> res1: Int = 6

  product(fact)(2, 3)                             //> res2: Int = 12

  val tolerance = 0.000001                        //> tolerance  : Double = 1.0E-6

  def isCloseEnough(x: Double, y: Double) =
    abs((x - y) / x) /x < tolerance               //> isCloseEnough: (x: Double, y: Double)Boolean

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  fixedPoint(x => 1 + x/2)(1)                     //> res3: Double = 1.9999961853027344
  
  def sqrt(x: Double) = fixedPoint(y => (y+x/y)/2)(1)
                                                  //> sqrt: (x: Double)Double
 
 sqrt(4)                                          //> res4: Double = 2.000000000000002
}