package properties

/**
 * Crie uma classe Account para representar uma conta bancária. Esta classe deve ter uma propriedade balance para armazenar
 * o saldo da conta. Quando uma conta é criada, ela pode opcionalmente conter um saldo inicial, o qual não pode ser
 * inferior a zero. Além disso, o saldo só pode ser alterado através do método deposit() e withdraw(), responsáveis
 * pelo depósito e saques na conta, respetivamente.
 */

fun main(){
    val conta = ExAccount()

    conta.deposit(100.00)
    conta.withdraw(50.0)
    conta.saldo()

}
class ExAccount(
    val comSaldoInicial: Boolean = false,
    val saldoInicial: Double = 0.0
) {
    private var balance: Double = 0.0

    fun deposit(valor: Double){
        if (valor>0){
            balance += valor
        }
        else{
            println("Valor do deposito precisa ser maior que zero.")
        }
    }

    fun withdraw(valor: Double){
        if (valor < balance){
            balance -= valor
        }else
        {
            println("Saldo insuficiente")
        }
    }

    fun saldo(){
        println("Seu saldo é: R$ $balance")
    }

    init {
        if(comSaldoInicial){
            balance = saldoInicial
        }
    }
}