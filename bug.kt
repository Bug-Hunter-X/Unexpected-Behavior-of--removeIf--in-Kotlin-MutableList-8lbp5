```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]
    list.add(6)
    println(list) // Output: [1,3,5,6] 
    list.removeIf {it > 4}
    println(list)// Output: [1, 3]
}
```