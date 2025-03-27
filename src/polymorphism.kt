 open class Shape{
     open fun draw(){
        println("drawing a shape")
    }
}

class Circle:Shape(){
     override fun draw(){
        println("drawing a circle")
    }
}

class Rectangle:Shape(){
     override fun draw(){
        println("drawing a rectangle")
    }
}

fun main() {
    var sh =Shape()
    sh.draw()

    var ci = Circle()
    ci.draw()

    var r = Rectangle()
    r.draw()

}