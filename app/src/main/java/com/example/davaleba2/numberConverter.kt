package com.example.davaleba2

fun kavshiri(str: String): String { //20..99 ციფრებს აკავშირებს ერთმანეთს
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
        num in 0..20 -> list[num]
        num / 10 == 2 -> kavshiri(list[20]) + list[num % 10]
        num / 10 == 3 -> kavshiri(list[20]) + list[num % 10 + 10]
        num == 40 -> ormoci
        num / 10 == 4 -> kavshiri(ormoci) + list[num % 10]
        num / 10 == 5 -> kavshiri(ormoci) + list[num % 10 + 10]
        num == 60 -> samoci
        num / 10 == 6 -> kavshiri(samoci) + list[num % 10]
        num / 10 == 7 -> kavshiri(samoci) + list[num % 10 + 10]
        num == 80 -> otxmoci
        num / 10 == 8 -> kavshiri(otxmoci) + list[num % 10]
        num / 10 == 9 -> kavshiri(otxmoci) + list[num % 10 + 10]


        else -> "0"
    }
}


fun toGeorgianFrom100Until999(num: Int): String {
    return when {
        num / 100 == 1 -> asi.dropLast(1) + toGeorgianUntil99(num % 100)
        num / 100 in 2..7 -> list[num / 100].dropLast(1) + asi.dropLast(1) + toGeorgianUntil99(num % 100)
        num / 100 in 8..9 -> list[num / 100] + asi.dropLast(1) + toGeorgianUntil99(num % 100)


        else -> "0"
    }
}


fun numberConverter(num: Int): String {


    return when (num) {
        100 -> asi
        800 -> list[num / 100] + asi
        900 -> list[num / 100] + asi
        num / 100 * 100 -> list[num / 100].dropLast(1) + asi //ამოწმებს ასეულებს

        in 1..99 -> toGeorgianUntil99(num)
        in 100..999 -> toGeorgianFrom100Until999(num)
        1000 -> list[10].dropLast(1)+ asi
        else -> "wrong number"
    }

}