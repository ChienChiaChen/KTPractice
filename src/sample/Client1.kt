package sample

fun main(args: Array<String>) {
//    val nullableList: List<Int?> = listOf(1, 2, null, 4)
//    val intList: List<Int> = nullableList.filterNotNull()
//
//    for (i in intList) {
//        println(i)
//    }
//
//
//    val baseUrl = "http://www.yahoo.com"
//    val page = "3"
//    val size = "512"
//    val imageUrl = "$baseUrl?page=$page&size=$size"
//    println(imageUrl)

//    val num: Int = 128
//    val a:Int? = num
//    val b:Int? = num
//    println(a == b)  //true
//    print(a === b)   //true

//    if ( i in 0..10) { // 等同于 1 <= i && i <= 10
//        print(i)
//    }

    for (i in 1..4) {
        print(i)
    }

    for (i in 1 until 10) {   // i in [1, 10) 排除了 10
        println(i)
    }

    for (i in 4 downTo 1) print(i)
}