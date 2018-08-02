package ch4

fun main(args: Array<String>) {
    // 字元型態的顏色代碼
    val colorCode: Char = 'R'
    // 字串型態的顏色名稱
    var colorName: String

    // 判斷顏色代碼變數值
    when (colorCode) {
        'R' ->  colorName = "Red"
        'B' ->  colorName = "Blue"
        'G' ->  colorName = "Green"
        else -> colorName = "undefined"
    }

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}