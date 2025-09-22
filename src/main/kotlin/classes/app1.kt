package classes

fun main(){

    val account: Account = Account("1234-5", "Bio")

    account.deposit(200.00)

    account.deposit(2000)

    account.print()
}