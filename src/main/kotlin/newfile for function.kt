fun main(){
//    lambdas are simplified functions or an anonymous function
//    or a higher order function
//    val add ={a:Int -> println("The value is $a") }
//    add(6)
    println("Welcome to Noma calculator")

    println("Please input integer value ")
    val value1:Double = readln().toDouble()
    println("Please enter second integer value")
    val value2 = readln().toDouble()

    println("Select one from the following: ")
    println("* + - /")

    val character = readln().toString()
    calculate(value1,value2,character)


}



fun addTwoNum(a:Int,b:Int):Int{
    val x = a+b
    print("The sum of $a and $b is: $x")
    return  x

}

//write a function that has three parameters; two doubles and one character
// (*,+,-,/) and checks if third parameter == *, it will multiply them.
// == +, it will add the two numbers
// == -, it will subtract the two numbers
//== /, it will divide the two numbers

fun calculate(value1:Double, value2:Double, character:String): Double {
    if (character=="*"){
       val answer = (value1 * value2).toInt()
        println("The product of $value1 and $value2 = $answer")
        return answer.toDouble()
    }else if(character=="+"){
        val answer = (value1 + value2).toInt()
        println("The sum of $value1 and $value2 = $answer)")
        return answer.toDouble()
    }else if(character=="-"){
        val answer = (value1 - value2).toInt()
        println("$value1 - $value2 = $answer")
        return answer.toDouble()
    }else if(character=="/"){
        val answer = (value1 / value2).toDouble()
        println("$value1 / $value2 = $answer")
        return answer.toDouble()
    }
    return 0.0

}