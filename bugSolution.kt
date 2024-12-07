fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeAt(list.indexOf(1)) //Removes element at specific index
    println(list) // Output: [2, 3, 4, 5]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.remove(1) //Removes by value which is correct for sets
    println(set) // Output: [2, 3, 4, 5]

    val map = mutableMapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    map.remove(1) //Removes by key which is correct for map
    println(map) // Output: {2=two, 3=three}

    //To make removal consistent use this approach for all collection types:
    fun <T> removeElement(collection: MutableCollection<T>, element:T):Boolean {
        return collection.remove(element)
    }
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(removeElement(list2,1)) // Output: true
    println(list2) // Output: [2, 3, 4, 5]
}