fun main(){
    val add = {a:Int -> print(a)}
    add(6)

    val addThreeNumbers = {a:Int, b:Int, c:Int->a+b+c}
    println(addThreeNumbers(1,2,3))

    concatenateString("Trees ","are green",eat)
}

val eat = {x:String,y:String -> println(x+y) }

fun concatenateString(a:String,b:String, x:(String, String)->Unit){
    x(a,b)

}

//assignment
//Write a function  that has 3 parameters; two doubles and one character