class MyName {
    var name = "WilynLee"
    fun theName() {
        print(name)
    }
}

fun MyName.changeName(newName: String) {
    name = newName
}

fun MyName.printName() {
    theName()
}

val MyName.nameUpCase: String
    get() = name.toUpperCase()


fun main() {
    val myName = MyName()
    myName.printName()
    myName.changeName("Wilyn")
    myName.printName()
    print(myName.nameUpCase)
}