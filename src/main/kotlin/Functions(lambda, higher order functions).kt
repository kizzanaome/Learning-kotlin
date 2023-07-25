import kotlin.math.sqrt

fun main(){
    solveQuadratic()

    println("Enter the first number: ")
    val firstNumber = readln().toFloat()
    println("Enter the first number: ")
    val secondNumber = readln().toFloat()
    println("Enter the first number: ")

    val thirdNumber = readln().toFloat()
    multiplyThreeNumbers(firstNumber,secondNumber,thirdNumber,)

}

fun multiplyThreeNumbers(a:Float,b:Float,c:Float){
    val x = a*b*c
    print("The product  of $a and $b and $c is: $x")

}

fun addTwoNumbers(a:Int,b:Int):Int{
    val x = a+b
    return x
    print("The sum of $a and $b is: $x")

}


fun solveQuadratic(){
//    x3+7x2+10x = 0
    print(" x3+7x2+10x = 0")
/**
*  x(x2+7x+10)=0
 *  x=0 or x2+7x+10=0
 *  x= -b+ sqrt(b2 -4ac)/2a
 *  x= -b- sqrt(b2 -4ac)/2a
* */
val d =(7*7)-(4*1*10)
    if(d<0){
        println("No real roots")
    }else{
        val x2 = (-7 - sqrt(d.toDouble()))/2*1
        val x3 =(-7 + sqrt(d.toDouble()))/2*1

        println(" x2 = $x2")
        println(" x3 = $x3")
    }

}

