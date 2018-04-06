package week1

object session1 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double
  
  def sqrtIter(guess: Double, x: Double): Double =
  if ( isGoodEnough(guess, x)) guess
  else sqrtIter(improve(guess, x), x)             //> sqrtIter: (guess: Double, x: Double)Double
  
  def isGoodEnough(guess: Double, x: Double): Boolean =
  abs(guess * guess - x) / x < 0.000000001        //> isGoodEnough: (guess: Double, x: Double)Boolean
  
  def improve(guess: Double, x: Double): Double =
  (guess + x / guess) / 2                         //> improve: (guess: Double, x: Double)Double
  
  def sqr(x: Double):Double = sqrtIter(1.0, x)    //> sqr: (x: Double)Double
  
  
  sqr(2)                                          //> res0: Double = 1.4142135623746899
  
  sqr(1e10)                                       //> res1: Double = 100000.0
  
}