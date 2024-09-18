//CREATE A PROGRAM WITH TWO VARIABLE A AND  B AND DISPLAY THE SUM OF THE VARIABLES AS OUTPUT
fun main()
{

    val a = 10
    val b = 20
    val c = a+b
    println("Sum of the a and b is = "+c)
    
}


 
fun main()
{

    var a = 10
    var b = 20
    println("Sum of the $a and $b is ${a+b}")
    
}


//Write a function inside that function create the variable then try to print the variable inside and ouside the function
fun main()
{
    val a = 116
    print(a)
    
}
print(a)



//Write a function inside that function create the variable then try to print the variable inside and ouside the function

fun abc()
{
    val a = 116
    print(a)
}
fun main()
{  
   abc() 
 
}

 

//Escape String
fun main(){
  print("Lovely \n  Proffessional \n University")
    
}
 


 //Raw String
fun main(){
  println("""Lovely Proffessional
             	University""")
    
}
 

 fun main()
{
    //Type Inference
    var a = 4
    var b = 23.45678
    var c = "Hello"
    var d = """true"""
    println(a)
    println(b)
    println(c)
    println(d)
     
}
 

 fun main()
{
    //Accessing variables
    var age: Int = 50
    println(age)
     
}
 

 fun main(){
     val x: Int = 40
     val y: Long = x.toLong()
     println(y)
     
 }
 

  fun main(){
     val a: String = "Hi"
     val b: Int? = a as? Int
     println(b)
     
 }



fun main(){
     
     val a: String = "Hi"
     val b: Int? = a as? Int
     if(b!=null){
         println("type cast successful")
     }
     else{
         println("typecasting unsuccessful")
     }
     
 }




fun main(){
     val amount = 15000
     val membership = true
     if(amount >= 1000){
         if(membership){
         	println("You are eligible for 20% discount")
     }else{
             println("You are eligible ofr 10% dicount")
         }
     }else{
         println("You are not  eiligible for discount")
     }
     
 }

 


  fun main(){
     val dayOfWeek = 3
     val dayName = when(dayOfWeek){
         1 -> "Monday"
         2 -> "Tuesday"
         3 -> "Wednesday"
         4 -> "Thursday"
         5 -> "Friday"
         6 -> "Saturday"
         7 -> "Sunday"
         else -> "Invalid day"
     }
     println("Day of the week: $dayName")
     
 }



fun main(){
    for(i in 1.. 5){
        print(i)
    }
}
 

 
 fun main(){
    for(i in 1 until 5){
        print(i)
    }
}

 

 
 fun main(){
    for(i in 5 downTo 1){
        print(i)
    }
}
 

 
 fun main(){
    for(i in 10 downTo 1 step 2){
        println(i)
    }
}


 fun main(){
    
     val arrayNum = arrayOf("A","B","C","D","E")
     for(i in arrayNum){
         println(i)
     }
}
 

 
 fun main(){
    
     val arrayNum = listOf("A","B","C","D","E")
     for(i in arrayNum){
         println(i)
     }
}

  

  
  fun main(){
    
     val arr = arrayOf("hi","Hello",1234567)
     
     for(i in arr.indices){
         println("Element at index $i is ${arr[i]}")
     }
}

   

   
   fun programAs(){
    println("Hi")
}
fun main(){
    programAs()
}
 

 
 fun sum(a: Int, b: Int){
    val c = a+b
    println("Sum of $a and $b is $c")
     
}
fun main(){
    sum(20,56)
}
 


 fun sum(a: Int=6, b: Int=9){
    val c = a+b
    println("Sum of $a and $b is $c")
     
}
fun main(){
    sum()
}

  

   //conversion of cel to far and far to cel
fun celToFah(cel: Double): Double {
    return (cel * 9/5) + 32
}

fun fahToCel(fah: Double): Double {
    return (fah - 32) * 5/9
}

fun main() {
    val cel = 25.0
    val fah = 77.0

    println("$cel°C is equal to ${celToFah(cel)}°F")
    println("$fah°F is equal to ${fahToCel(fah)}°C")
}


class rectangle(val a: Double, val b: Double){
        fun area(): Double{
            return a*b
        }
   }
fun display(){
    println("area of rectangle with dimensions $a and $b is ${area()}")
	}
}
fun main(){
    var c = rectangle(a:2.5,b:5.6)
    c.display()
    
}