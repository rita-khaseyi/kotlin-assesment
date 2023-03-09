fun main(){
    split("ritakhaseyi")
    strings("rita","wendy","khaseyi")
    numbers(2,4,6)



    var nums=calculator(50.0,10.0)
    nums.addition()
    nums.subtraction()
    nums.division()
    nums.multiplication()
}
fun length(names1:String,names2:String){



}
//function that takes in array of integers
fun numbers(num1:Int,num2:Int,num3:Int):Int{
    var values= intArrayOf(num1,num2,num3)
    return values.min()
    return values.max()



}


//takes in a string and splits
fun split(name:String){
    var x=name
    for ( y in x){
        println(y)
    }

}
//joins a string
fun strings(name1:String,name2:String,name3:String){
    var join= arrayOf(name1+ " " +name2 +" " +" "+ name3)
    println(join.contentToString())
}
//calculator class
class calculator(var number1:Double,var number2:Double){
    fun addition(){
        var sum=number1+number2
        println(sum)
    }
    fun subtraction(){
        var sub=number1-number2
        println(sub)
    }
    fun division(){
        var div=number1/number2
        println(div)
    }
    fun multiplication(){
        var mult=number1*number2
        println(mult)
    }
}