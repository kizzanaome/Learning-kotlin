import kotlin.math.sqrt

fun main(){

/**
      * Question 1
        1. Solve the equation x2+10x+25 = 0  - x = (-b+-Sqrt(b2-4ac))/2a
 **/
    println("")
    println("1. Solution to Question 1")
    val a = 1
    val b = 10
    val c = 25

    val d = (b*b.toFloat())-(4*a*c.toFloat())
    val x1 = ((-b + sqrt(d))/2*1).toInt()
    val x2 = ((-b - sqrt(d))/2*1).toInt()
    println("The values of X are x1=$x1 and x2=$x2")


/**  Question2
     2. A car is moving at a speed of 1000m/s at an acceleration of 25m/s/s
          Find the time it will take to move a distance of 5km
         Hint - acceleration = speed/time
         speed = distance/time
*/
    println("")
    println("2. Solution to Question 2")
    val speed = 1000 // m/s
    val acce  = 25 // m/s/s
    /** change km to meters **/
    val distance = 5*1000  //m
    val time = distance/speed
    println("It takes $time Seconds for a car to move a distance of 5km ")



/**  Question3
     3. A person has four option of choosing between;
       pizza, chicken, pancakes or cake. If they choose pizza, they'll go to pizza hut,
       if chicken, they'll go to kfc, if pancakes, they'll go to foodhub,
       if cake, they'll go to cakely. Write
       -a program using an if statement that captures the persons choice and prints the
       selected restaurant
       -same program using a when statement
**/
    println("")
    println("3. Solution to Question 3")
    println("Enter your food choice from the following; pizza, chicken, pancakes, cake:")

    val option = readln().toString()

    /** if statement **/
    println(" ***** Using the if statement *****")
    if(option =="pizza"){
        println("You'll go to pizza hut")
    }else if(option =="chicken"){
        println("You'll go to kfc")
    }else if(option =="pancakes"){
        println("You'll go to FoodHub")
    }else if(option =="cake"){
        println("You'll go to cakely")
    }else{
        println("No restaurants for selected option!")
    }

    /** Using when statements **/
    println(" ***** Using the when statement ***** ")
    when(option){
        "pizza"-> println("You'll go to pizza hut")
        "chicken"-> println("You'll go to kfc")
        "pancakes"-> println("You'll go to FoodHub")
        "cake"-> println("You'll go to cakely")
        else -> println("No restaurants for selected option!")

    }


/** Question 4
 * 4. Solve the equation x3+7x2+10x = 0 **/


/** Question 5
        5. A person is moving to his village with a car moving at 20km/h and He has many
                alternative routes.
        If he uses route1, he'll move a distance of 5000km
        If he uses route2, he'll move a distance of 25000km
       If he uses route3, he'll move a distance of 50000km
       If he uses another, he'll move a distance of 10000km

        Find the time it will take him to reach the village using the separate routes
        -using an if statement
        -using a when statement
**/

    val carSpeed = 20 //km/hr
    println("")
    println("3. Solution to Question 5")
    println("Choose route from the following; route1, route2, route3, another")
    val route = readln()

    println(" ***** Using the if statement ***** ")

    if(route=="route1"){
        val distance = 5000 //km
        val time = distance/carSpeed
        println("It will take you $time hours to reach the village using $route")
    }else if(route == "route2"){
        val distance = 25000 //km
        val time = distance/carSpeed //hr
        println("It will take you $time hours to reach the village using $route")
    }else if(route == "route3"){
        val distance = 50000 //km
        val time = distance/carSpeed //hr
        println("It will take you $time hours to reach the village using $route")
    } else if(route == "another"){
    val distance = 10000 //km
    val time = distance/carSpeed //hr
    println("It will take you $time hours to reach the village using $route")
}

    /** Using when statements **/
    println(" ***** Using the when statement ***** ")
    when(route){
        "route1"->{
            val distance = 5000 //km
            val time = distance/carSpeed
            println("It will take you $time hours to reach the village using $route")
        }
        "route2"-> {
            val distance = 25000 //km
            val time = distance/carSpeed //hr
            println("It will take you $time hours to reach the village using $route")
        }
        "route3"-> {
            val distance = 50000 //km
            val time = distance/carSpeed //hr
            println("It will take you $time hours to reach the village using $route")
        }
        else -> {

            val distance = 10000 //km
            val time = distance/carSpeed //hr
            println("It will take you $time hours to reach the village using $route")
        }


    }

}