//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
statement("Barnie bakes brown bagels and buns")
 println(isPalindrome("madam"))

numbers([23,50,49,60])





}

fun statement (x:String){
    var words = x
    var word = (words.split("b"))
    println(word)


}
fun  isPalindrome(word:String) : String {
 if (word == word.reversed())
     println("true")
    else{
     ("false")
 }

    return word.reversed()
}
fun numbers (x:Array<Int>){
    var num = x
    println(x.average())
    println(x.sum())
    println(x.count())


}