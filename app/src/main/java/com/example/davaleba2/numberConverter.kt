package com.example.davaleba2

fun kavshiri(str: String): String {
    return str.dropLast(1) + "და"
}

val ormoci = "ორმოცი"
val samoci = "სამოცი"
val otxmoci = "ოთხმოცი"
val asi = "ასი"


val list = listOf<String>(
    "ნული",
    "ერთი",
    "ორი",
    "სამი",
    "ოთხი",
    "ხუთი",
    "ექვსი",
    "შვიდი",
    "რვა",
    "ცხრა",
    "ათი",
    "თერთმეტი",
    "თორმეტი",
    "ცამეტი",
    "თოთხმეტი",
    "თხუთმეტი",
    "თექსვმეტი",
    "ჩვიდმეტი",
    "თვრამეტი",
    "ცხრამეტი",
    "ოცი"
)


fun toGeorgianUntil99(num: Int): String {



    return when {
        num / 10 == 0 -> list[num]
        num / 10 == 2 -> kavshiri(list[20]) + list[num % 10]
        num / 10 == 3 -> kavshiri(list[20]) + list[num % 10 + 10]
        num / 10 == 4 -> kavshiri(ormoci) + list[num % 10]
        num / 10 == 5 -> kavshiri(ormoci) + list[num % 10 + 10]
        num / 10 == 6 -> kavshiri(samoci) + list[num % 10]
        num / 10 == 7 -> kavshiri(samoci) + list[num % 10 + 10]
        num / 10 == 8 -> kavshiri(otxmoci) + list[num % 10]
        num / 10 == 9 -> kavshiri(otxmoci) + list[num % 10 + 10]


        else -> "null"
    }
}


fun toGeorgianFrom100Until999(num: Int): String {
    return when {
        num / 100 == 1 -> asi.dropLast(1) + toGeorgianUntil99(num % 100)
        num / 100 in 2..7 -> list[num / 100].dropLast(1) + asi.dropLast(1) + toGeorgianUntil99(num % 100)
        num / 100 in 8..9 -> list[num / 100] + asi.dropLast(1) + toGeorgianUntil99(num % 100)


        else -> "null"
    }
}


fun numberConverter(num: Int): String {


    return when {
        num == 100 -> asi
        num == 800 -> list[num / 100] + asi
        num == 900 -> list[num / 100] + asi
        num / 100 * 100 == num -> list[num / 100].dropLast(1) + asi
        num in 1..99 -> toGeorgianUntil99(num)
        num in 100..999 -> toGeorgianFrom100Until999(num)
        else -> "you shall not pass"
    }

}