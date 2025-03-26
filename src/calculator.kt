import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter firstnumber:")
    var firstnumber = read.nextInt()


    println("Enter secondnumber:")
    var secondnumber = read.nextInt()

    println("Enter operator(*,+,-,/):")
    var operator = readln()

    var answer = when(operator){
        "+"->firstnumber + secondnumber
        "-"->firstnumber - secondnumber
        "*"->firstnumber * secondnumber
        "/"->firstnumber / secondnumber
        else ->"Invalid!!!!!"
    }
    println("$firstnumber $operator $secondnumber is $answer")









}