import java.util.*

fun main() {
    places("Nakuru","Eldore","Kakuma","Lagawa")
    citiesArray()
    numberArray()
    names("Manal","Asma","Ququ")
}
fun places(a:String,b:String,c:String,d:String){
    var area=arrayOf("$a","$b","$c","$d")
    println(Arrays.toString(area))
}
fun citiesArray(){
    var citiesArray= arrayOf("harare","numbai","dodoma","jakarta")
    var cityName= citiesArray.sort()
    println(Arrays.toString(citiesArray))
}
fun numberArray(){
    var number= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(number[2])
    println(number[5])
    var index=number.indexOf(158) //showing the index position
    println(index)
    for (oneNumber in number.sorted()){
        println(oneNumber)
    }
}
fun names(num1:String,num2:String,num3:String){
    var name= arrayOf("$num1 ","$num2", "$num3" )
    println(Arrays.toString(name)) // function to take in 3 Strings and returns them all.
}
