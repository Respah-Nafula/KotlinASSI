fun main(){
    var Amount=CurrentAccount("ABSA765","Respah Nafula",10000.0)
    Amount.deposit(1000.0)
    Amount.withdraw(200.0)
    Amount.details()

}
open class  CurrentAccount(var accountNumber:String,var accountName:String, var balance:Double){
    fun deposit(amount:Double){
        balance+= amount
        println(balance)
    }
    open fun withdraw(amount:Double){
        balance-=amount
        println(balance)
    }
    fun details(){
        println( "Account number $accountNumber with balance $balance is operated by $accountName")
    }
}
class SavingAccount( accountNumber:String, accountName:String,balance:Double,var Withdrawal:Int):CurrentAccount(accountNumber,accountName,balance) {
    override fun withdraw(amount: Double) {
        super.withdraw(amount)
        if(Withdrawal<4) {
            Withdrawal++
            println("Allow withdraw")
        }
        else{
            println("Can't withdraw")

        }
    }
}
data class Product(var name:String,var weight:Double,var price:Double,var category:String)


{}
fun names(name:String){
    var names= mutableListOf("James","Joshua","Jaynet","Jacinta")
    for (names in names  )
        println(names)

}




