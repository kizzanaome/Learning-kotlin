fun main(){
//    lambdas are simplified functions or an anonymous function
//    or a higher order function
    val add ={a:Int -> println("The value is $a") }
    add(6)


}



fun addTwoNum(a:Int,b:Int):Int{
    val x = a+b
    print("The sum of $a and $b is: $x")
    return  x

}

//write a function that has three parameters; two doubles and one character
// (*,+,-,/) and checks if third parameter == *, it will mulitply them.
// == +, it will add the two numbers
// == -, it will subtract the two numbers
//== /, it will divide the two numbers