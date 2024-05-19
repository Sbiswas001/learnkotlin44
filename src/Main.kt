import java.lang.Math.pow
import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    println("Enter a number")
    val number = sc.nextInt()
    if(checkArmstrong(number)) {
        println("$number is an Armstrong number")
    } else {
        println("$number is not an Armstrong number")
    }
}

fun checkArmstrong(number: Int): Boolean {
    var temp = number
    val noOfDigits = number.toString().length
    var sum = 0.0
    for (i in 0..<noOfDigits) {
        sum += pow((temp%10).toDouble(), noOfDigits.toDouble())
        temp/=10
    }
    return sum.toInt()==number
}
