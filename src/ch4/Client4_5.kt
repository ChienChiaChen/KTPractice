package ch4

fun main(args: Array<String>) {
    // 字元型態的顏色代碼
    val colorCode = 'R'
    // 字串型態的顏色名稱
    var colorName: String

    // 判斷顏色代碼是否為紅色
    if (colorCode == 'R') {
        colorName = "Red"
    } else if (colorCode == 'B') { // 判斷顏色代碼是否為藍色
        colorName = "Blue"
    } else if (colorCode == 'G') { // 判斷顏色代碼是否為綠色
        colorName = "Green"
    } else { // 錯誤的顏色代碼
        colorName = "undefined"
    }

    // 顯示： colorCode: R, colorName: Red
    println("colorCode: $colorCode, colorName: $colorName")
}