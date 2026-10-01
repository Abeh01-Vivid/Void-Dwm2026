import kotlin.math.max

data class User(val id: Int, val name: String, var isActive: Boolean)

fun main() {
    val greeting = "Welcome to Kotlin"
    var currentScore = 10
    currentScore += 5 

    println("$greeting! Your score is: $currentScore") 

    var nullableString: String? = "Hello"
    nullableString = null     
    val length = nullableString?.length ?: 0
    println("String length is: $length")

    val users = listOf(
        User(1, "Alice", true),
        User(2, "Bob", false),
        User(3, "Charlie", true)
    )

    val activeUserNames = users
        .filter { it.isActive }
        .map { it.name }
    
    println("Active users: $activeUserNames") 

    val systemStatus = 2
    val statusMessage = when (systemStatus) {
        1 -> "System Operational"
        2 -> "System Warning"
        3 -> "System Critical"
        else -> "Unknown Error"
    }
    println("Status: $statusMessage")

    print("Counting: ")
    for (i in 1..5) { // Includes 1 and 5
        print("$i ")
    }
    println() // New line
}

fun findMax(a: Int, b: Int) = max(a, b)

