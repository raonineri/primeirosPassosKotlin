package exception

fun main(){
    val banckAccount = BankAccount()
    try{
        banckAccount.deposit(300.00)
        banckAccount.witdraw(500.00)
    }catch (e: Exception){

    }

    println(banckAccount.balance)
}