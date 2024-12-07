fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(1)
    println(list) // Output: [2, 3, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.remove(1)
    println(set) // Output: [2, 3, 4, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map.remove(1)
    println(map) // Output: {2=two, 3=three}
}