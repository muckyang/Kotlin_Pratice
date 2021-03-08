fun main(args:Array<String>){
    var num1 : Int = 5
    val num2 : Int = 10
    
    println(kotlin_func1(num1,num2))
   

    num1 = 15
    //num2 =11 //val은 상수로 재설정 불가능
    println(kotlin_func2(num1,num2))
}

fun kotlin_func1(a:Int, b:Int):Int = a+b;
fun kotlin_func2(a:Int, b:Int) = if(a>b) a-b else b-a