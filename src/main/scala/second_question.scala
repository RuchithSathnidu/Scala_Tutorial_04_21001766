object second_question {
  def main(args : Array[String]) : Unit = {
    for( arg <- args){
        patternMatching(arg.toInt)
    }

  }

  def patternMatching (pattern:Int) :Unit = {
      pattern match {
        case x if x<0 => println(x + " = Negative Number")
        case x if x==0 => println(x + " = Zero")
        case x if x%2==0 => println(x + " = Even Number")
        case x if x%2!=0 => println(x + " = Odd Number")

      }
  }

}
