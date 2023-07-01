object first_question {
   def main(args : Array[String]) : Unit = {
      var amount : Double = 80000
      var interest : Double = amount_interest(amount)
      var total : Double = interest + amount
     if(interest<=0)
       {
         println("Invalid Amount")
       }
     else {
       println("Deposit amount = " + amount)
       println("Amount of interest = " + interest)
       println("Total amount = " + total)
     }

   }

  def amount_interest (amount:Double) : Double ={
    amount match {
        case x if x<=20000 => amount*0.02
        case x if x<=200000 => amount*0.04
        case x if x<=2000000 => amount*0.035
        case _ => amount*0.065

    }

  }

}
