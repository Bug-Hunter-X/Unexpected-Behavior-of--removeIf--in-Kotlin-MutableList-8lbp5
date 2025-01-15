```kotlin
fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val element = iterator.next()
        if (element % 2 == 0) {
            iterator.remove()
        }
    }
    println(list) // Output: [1, 3, 5]
    list.add(6)
    println(list) // Output: [1, 3, 5, 6]
    
    val iterator2 = list.iterator()
    while (iterator2.hasNext()) {
        val element = iterator2.next()
        if(element > 4){
            iterator2.remove()
        }
    }
    println(list) // Output: [1,3,5]
}
```