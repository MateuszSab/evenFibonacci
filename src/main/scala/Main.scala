import scala.annotation.tailrec

object Main extends App {

  def fibonacci(ns: Seq[Int]): Seq[Int] = {
    ns.foldLeft(ns) { (result, n) =>
      if (result.last < 4000000) fibonacci(result :+ (result.last + result(result.length - 2)))
      else result
    }
  }

  def fibonacciEvenSum(ns: Seq[Int]): Int = {
    ns.foldLeft(0) { (result, n) =>
      if (n % 2 == 0) result + n
      else result
    }
  }

}
