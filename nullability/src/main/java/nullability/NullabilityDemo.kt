package nullability

fun main(args: Array<String>) {
    var myName : String = "Amit"
   // myName = null    // Compilation Error

    var nullableName : String ? = "This is nullable Variable"
    //nullableName = null   // Compiler is not complaining

    //UnSafe method calls
   // println(nullableName.length) // This will not compile

    //Safe Call 1. With null check
    if(nullableName!= null) {
        println(nullableName.length)
    }

    //Other way to write conditional
    println(nullableName?.length)

    //Safe call 2. with Safe operator ?
    println(nullableName?.length)  // This will print null or length of nullableName String

    //Elvis operator // below exp will return length or -1
    var length = nullableName?.length ?: -1

    // !! operator, Use with care, this can throw null pointer exception
    println(nullableName!!.length)

}