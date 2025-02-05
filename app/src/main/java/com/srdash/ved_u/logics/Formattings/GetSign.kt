package com.srdash.ved_u.logics.Formattings

fun waGetSign(date: Int, month: Int, year: Int): String {
    // Define the maximum days in each month
    val daysInMonth = mapOf(
        1 to 31, 2 to if (year % 4 == 0) 29 else 28, 3 to 31,
        4 to 30, 5 to 31, 6 to 30, 7 to 31, 8 to 31,
        9 to 30, 10 to 31, 11 to 30, 12 to 31
    )

    // Check if the month is valid
    if (month !in 1..12) return "Invalid Month! Enter a value between 1 and 12."

    // Check if the date is valid for the given month
    val maxDays = daysInMonth[month] ?: return "Invalid Month!"
    if (date !in 1..maxDays) return "Invalid Date! The month $month has only $maxDays days."

    // Determine the zodiac sign based on Western astrology
    return when (month) {
        1 -> if (date < 20) "Capricorn" else "Aquarius"
        2 -> if (date < 19) "Aquarius" else "Pisces"
        3 -> if (date < 21) "Pisces" else "Aries"
        4 -> if (date < 20) "Aries" else "Taurus"
        5 -> if (date < 21) "Taurus" else "Gemini"
        6 -> if (date < 21) "Gemini" else "Cancer"
        7 -> if (date < 23) "Cancer" else "Leo"
        8 -> if (date < 23) "Leo" else "Virgo"
        9 -> if (date < 23) "Virgo" else "Libra"
        10 -> if (date < 23) "Libra" else "Scorpio"
        11 -> if (date < 22) "Scorpio" else "Sagittarius"
        12 -> if (date < 22) "Sagittarius" else "Capricorn"
        else -> "Invalid month"
    }
}

fun vaGetSign(date: Int, month: Int, year: Int) : String{
    // Define the maximum days in each month
    val daysInMonth = mapOf(
        1 to 31, 2 to if (year % 4 == 0) 29 else 28, 3 to 31,
        4 to 30, 5 to 31, 6 to 30, 7 to 31, 8 to 31,
        9 to 30, 10 to 31, 11 to 30, 12 to 31
    )

    // Check if the month is valid
    if (month !in 1..12) return "Invalid Month! Enter a value between 1 and 12."

    // Check if the date is valid for the given month
    val maxDays = daysInMonth[month] ?: return "Invalid Month!"
    if (date !in 1..maxDays) return "Invalid Date! The month $month has only $maxDays days."

    // Determine the zodiac sign based on Western astrology
    return when (month) {
        4 -> if (date < 14) "Pisces" else "Aries"
        5 -> if (date < 15) "Aries" else "Taurus"
        6 -> if (date < 15) "Taurus" else "Gemini"
        7 -> if (date < 15) "Gemini" else "Cancer"
        8 -> if (date < 15) "Cancer" else "Leo"
        9 -> if (date < 15) "Leo" else "Virgo"
        10 -> if (date < 15) "Virgo" else "Libra"
        11 -> if (date < 15) "Libra" else "Scorpio"
        12 -> if (date < 15) "Scorpio" else "Sagittarius"
        1 -> if (date < 14) "Sagittarius" else "Capricorn"
        2 -> if (date < 14) "Capricorn" else "Aquarius"
        3 -> if (date < 14) "Aquarius" else "Pisces"
        else -> "Invalid month"
    }
}
