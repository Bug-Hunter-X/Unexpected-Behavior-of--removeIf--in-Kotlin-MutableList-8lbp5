# Kotlin MutableList removeIf() Unexpected Behavior

This repository demonstrates an unusual behavior with Kotlin's `MutableList.removeIf()` function.  When elements are added to the list while `removeIf()` is removing elements based on a condition, the iteration and removal process may not behave as expected, leading to unexpected results.  The issue is that modifying the list during iteration can lead to elements being skipped or processed multiple times.

The `bug.kt` file shows this unexpected behavior, and `bugSolution.kt` presents a solution.

## Solution

The provided solution offers a safer and more predictable way to modify a list while iterating by using an iterator to explicitly manage the removal process.
