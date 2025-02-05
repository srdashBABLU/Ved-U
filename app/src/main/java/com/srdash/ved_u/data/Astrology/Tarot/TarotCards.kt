package com.srdash.ved_u.data.Astrology.Tarot

import com.srdash.ved_u.R
import kotlin.math.min

val cardTypes = listOf<String>("Major Arcana", "Minor Arcana")

val majorArcana = listOf(
    "The Fool", "The Magician", "The High Priestess", "The Empress", "The Emperor",
    "The Hierophant", "The Lovers", "The Chariot", "Strength", "The Hermit",
    "Wheel of Fortune", "Justice", "The Hanged Man", "Death", "Temperance",
    "The Devil", "The Tower", "The Star", "The Moon", "The Sun",
    "Judgement", "The World"
)

val Wands = listOf(
    "Ace of Wands", "Two of Wands", "Three of Wands", "Four of Wands", "Five of Wands",
    "Six of Wands", "Seven of Wands", "Eight of Wands", "Nine of Wands", "Ten of Wands",
    "Page of Wands", "Knight of Wands", "Queen of Wands", "King of Wands"
)
val Cups = listOf(
    "Ace of Cups", "Two of Cups", "Three of Cups", "Four of Cups", "Five of Cups",
    "Six of Cups", "Seven of Cups", "Eight of Cups", "Nine of Cups", "Ten of Cups",
    "Page of Cups", "Knight of Cups", "Queen of Cups", "King of Cups"
)
val Swords = listOf(
    "Ace of Swords", "Two of Swords", "Three of Swords", "Four of Swords", "Five of Swords",
    "Six of Swords", "Seven of Swords", "Eight of Swords", "Nine of Swords", "Ten of Swords",
    "Page of Swords", "Knight of Swords", "Queen of Swords", "King of Swords"
)
val Pentacles = listOf(
    "Ace of Pentacles", "Two of Pentacles", "Three of Pentacles", "Four of Pentacles", "Five of Pentacles",
    "Six of Pentacles", "Seven of Pentacles", "Eight of Pentacles", "Nine of Pentacles", "Ten of Pentacles",
    "Page of Pentacles", "Knight of Pentacles", "Queen of Pentacles", "King of Pentacles"
)

val minorArcana = listOf(Wands, Cups, Swords, Pentacles)

val majorArcanaImages = listOf(
    R.drawable._0_thefool,
    R.drawable._1_themagician,
    R.drawable._2_thehighpriestess,
    R.drawable._3_theempress,
    R.drawable._4_theemperor,
    R.drawable._5_thehierophant,
    R.drawable._6_thelovers,
    R.drawable._7_thechariot,
    R.drawable._8_strength,
    R.drawable._9_thehermit,
    R.drawable._0_wheeloffortune,
    R.drawable._1_justice,
    R.drawable._2_thehangedman,
    R.drawable._3_death,
    R.drawable._4_temperance,
    R.drawable._5_thedevil,
    R.drawable._6_thetower,
    R.drawable._7_thestar,
    R.drawable._8_themoon,
    R.drawable._9_thesun,
    R.drawable._0_judgement,
    R.drawable._1_theworld
)

val WandsImages = listOf(
    R.drawable.wands01,
    R.drawable.wands02,
    R.drawable.wands03,
    R.drawable.wands04,
    R.drawable.wands05,
    R.drawable.wands06,
    R.drawable.wands07,
    R.drawable.wands08,
    R.drawable.wands09,
    R.drawable.wands10,
    R.drawable.wands11,
    R.drawable.wands12,
    R.drawable.wands13,
    R.drawable.wands14
)
val CupsImages = listOf(
    R.drawable.cups01,
    R.drawable.cups02,
    R.drawable.cups03,
    R.drawable.cups04,
    R.drawable.cups05,
    R.drawable.cups06,
    R.drawable.cups07,
    R.drawable.cups08,
    R.drawable.cups09,
    R.drawable.cups10,
    R.drawable.cups11,
    R.drawable.cups12,
    R.drawable.cups13,
    R.drawable.cups14
)
val SwordsImages = listOf(
    R.drawable.swords01,
    R.drawable.swords02,
    R.drawable.swords03,
    R.drawable.swords04,
    R.drawable.swords05,
    R.drawable.swords06,
    R.drawable.swords07,
    R.drawable.swords08,
    R.drawable.swords09,
    R.drawable.swords10,
    R.drawable.swords11,
    R.drawable.swords12,
    R.drawable.swords13,
    R.drawable.swords14
)
val PentaclesImages = listOf(
    R.drawable.pentacles01,
    R.drawable.pentacles02,
    R.drawable.pentacles03,
    R.drawable.pentacles04,
    R.drawable.pentacles05,
    R.drawable.pentacles06,
    R.drawable.pentacles07,
    R.drawable.pentacles08,
    R.drawable.pentacles09,
    R.drawable.pentacles10,
    R.drawable.pentacles11,
    R.drawable.pentacles12,
    R.drawable.pentacles13,
    R.drawable.pentacles14
)

val minorArcanaImages = listOf(WandsImages, CupsImages, SwordsImages, PentaclesImages)
