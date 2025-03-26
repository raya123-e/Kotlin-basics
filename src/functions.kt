fun main() {
    //Standard-library functions/predefined functions
    var output = Math.sqrt(144.0)
    println("The squareroot of 144 is $output")

    var number = Math.round(45.89)
    println("The rounded value of 45.89 is $number")

    school()
    add()
    student("John","Male",34)
    student("Ann","Female",14)

    employee("Jeff",5000,true)


}
// user-defined functions



fun school(){
    println("eMobilis")

}

fun add(){
    var x = 3
    var y = 5
    println(x + y)

}
//parameters/variables and arguments/values

fun student(name:String,gender:String,age:Int){
    println("$name is a $gender . $name is $age years old")

}

fun employee(name:String,salary:Int,disability:Boolean){
    println("$name is an employee paid $salary .It is  $disability that the employee has a disability.")


}
