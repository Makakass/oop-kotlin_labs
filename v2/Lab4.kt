data class Student(
    val name: String,
    var age: Int,
    val faculty: String,
    val group: String,
    val telegram: String
) {
    override fun toString(): String {
        return "Student ${this.name} is ${this.age} years old"
    }
}

fun printList(s: String, l: List<Any>) {
    println(s)
    for (i in l) {
        println(i)
    }
}

fun main() {
    val l = mutableListOf<Student>(
        Student("Василишин Денис", 20, "ФІОТ", "ІО-02", "blabla"),
        Student("Каруца Денис", 19, "ФІОТ", "ІО-02", "qweqwe"),
        Student("Ясний Максим", 21, "ІПСА", "123-123", "zxczxc")
    )

    l.sortByDescending { it.name }
    printList("Reversed name sort:", l)

    l.sortBy { it.age }
    printList("Age sort:", l)
}
