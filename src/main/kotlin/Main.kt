import kotlin.math.sqrt

fun main(){
    //  Question 1
    //  A program that calculates the difference between the year you were born and the current year.

        val yearOfBirth = 1995
        val currentYear = 2023
        val currentAge = (currentYear - yearOfBirth)
        println("I am $currentAge years old.")


    //    Question 2
    //    Based on pythagoras theorem, c2 = a2 + b2. if a right-angled triangle has base 4cm,
    //    and height of 3cm.
    //    Find the height of the hypotenuse of the triangle

        val a:Double = 3.0
        val b:Double = 4.0
        val equation = (a*a + b*b).toFloat()
        val c = sqrt(equation).toInt()
        println("The hypotenuse of the triangle is $c cm")

    }