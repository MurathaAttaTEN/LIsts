fun main(){
    evenindices(listOf("prudence","klimantoi","faith","lily","anena","caroline","shamim","Speria"))
    var b=htmt(listOf(5,6,6,7,8,9,9,10,6,10))
    println(b.sum())
    println(b.average())

    var d=Person("Pen",77,6.5,70.0F)
    var e=Person("Tool",100,2.0,60.0F)
    var f=Person("Eraser",20,4.5,50.0F)
    var g=Person("Pencil",10,3.8,40.0F)
    var human= listOf<Person>(d,e,f,g)
    var descend=human.sortedByDescending { girl-> girl.Age
    }
    println(descend)
    var add=Person("vroom",38,40.7,50.7F)
    var personU=Person("christine",55,10.3,8.0F)
    var personV=Person("LOVELACE",22,10.1,33.0F)
    var sapiens= listOf(add,personV,personU)
    println(sapiens)

    var t=Car("G500",100)
    var u=Car("G7500",90)
    var v=Car("G800",80)
    var w=Car("G5000",70)
    var van= listOf<Car>(t,u,v,w)
    var x=averageMileage(van)
    println(x)

}
fun evenindices(chars:List<String>):List<String>{
    chars.forEachIndexed{ index,q ->
        if(index % 2==0){
            println(listOf(q)) }
    }
    return chars }
fun htmt(Height:List<Int>):List<Int>{
    return Height
}
data class Person(var Name:String,var Age:Int,var Height:Double,var Weight:Float)

fun morepeople(pluspeople:List<Person>):List<Person>{
    return pluspeople
}
data class Car(var Registration:String,var Mileage:Int)

fun averageMileage(objects:List<Car>):Double{
    var avg=0.0
    objects.forEach{ car ->
    avg +=car.Mileage }
    var add=avg/objects.count()

return add
}