//Parent class /base class/super class
 open class Animal{
    var gender ="Male"
    var age = 3
    fun makesound(){
        println("Animal is speaking")
    }
}
//child class/derived class/sub class
class dog:Animal(){
    fun bark(){
        println("Woof! Woof!")
    }
}

class cat{
    var color = "White"
    var hasfurs = true


    fun meow(){
        println("Meow! Meow!")
    }

}


fun main() {
    var a = Animal()

    var d = dog()

    var c = cat()

}