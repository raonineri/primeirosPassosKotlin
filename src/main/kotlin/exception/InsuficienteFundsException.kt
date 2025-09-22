package exception

class InsuficienteFundsException(val currentBalance: Double) : RuntimeException(){
}