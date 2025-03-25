import java.util.Scanner

fun main() {

    var read = Scanner(System.`in`)
    println("Enter firstnumber:")
    var firstnumber = read.nextInt()


    println("Enter secondnumber:")
    var secondnumber = read.nextInt()


    println("Enter thirdnumber:")
    var thirdnumber = read.nextInt()

    var greatest = firstnumber

    if (secondnumber > greatest) greatest = secondnumber
    if (thirdnumber > greatest) greatest = thirdnumber

    println("The greatest number is $greatest ")




}