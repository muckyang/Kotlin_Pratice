fun main(args:Array<String>){
    var str:String = "this is string"
    var num:Int = 10
    var lnum:Long = 100000000000000

    println(getStringlength(str))
    println(getStringlength(num))
    println(getStringlength(lnum))
    
}

fun getStringlength(obj : Any):Any = if(obj is String) "length : " + obj.length else "this isn't String"