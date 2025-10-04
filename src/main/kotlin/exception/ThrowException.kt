package exception

fun main(){
    val account = BankAccount()
    try {
        account.deposit(500.00)
        account.witdraw(-600.0)
    }
    catch (ex: InvalidValueException){
        println("Deposito invalido: ${ex.message}")
    }
    catch (ex: InsuficienteFundsException){
        println("Error! Current balance is ${ex.currentBalance}")
    }finally {
        println(account.balance)
    }
}

class BankAccount{
    var balance: Double = 0.0
        private set

    fun deposit(value: Double){
        if (value < 0 ){
            throw InvalidValueException(value)
        }
        balance +=value
    }

    fun witdraw(value: Double){
        if (value < 0 ){
            throw InvalidValueException(value)
        }

        if( balance - value < 0){
            throw InvalidValueException(balance)
        }
        balance -=value
    }
}