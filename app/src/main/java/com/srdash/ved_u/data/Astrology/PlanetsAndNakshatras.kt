package com.srdash.ved_u.data.Astrology

val planetsEng = listOf<String>("Sun", "Moon", "Mars", "Mercury", "Jupiter", "Venus", "Saturn", "Rahu", "Ketu")
val planetsHi = listOf<String>("Surya", "Chandra", "Mangal", "Budh", "Guru", "Shukra", "Shani", "Rahu", "Ketu")

data class planets(
    val nameEng: String,
    val nameHi: String,
    val significance: List<String>,
    val represents: List<String>,
    val zodiacSign: String,
    val goodEffects: String,
    val badEffects: String
)

/*
Ashwini	            Ketu	    Aries ♈
Bharani	            Venus	    Aries ♈
Krittika	        Sun	        Aries ♈ / Taurus ♉
Rohini	            Moon	    Taurus ♉
Mrigashira	        Mars	    Taurus ♉ / Gemini ♊
Ardra	            Rahu	    Gemini ♊
Punarvasu	        Jupiter	    Gemini ♊ / Cancer ♋
Pushya	            Saturn	    Cancer ♋
Ashlesha	        Mercury	    Cancer ♋
Magha	            Ketu	    Leo ♌
Purva Phalguni	    Venus	    Leo ♌
Uttara Phalguni	    Sun	        Leo ♌ / Virgo ♍
Hasta	            Moon	    Virgo ♍
Chitra	            Mars	    Virgo ♍ / Libra ♎
Swati	            Rahu	    Libra ♎
Vishakha	        Jupiter	    Libra ♎ / Scorpio ♏
Anuradha	        Saturn	    Scorpio ♏
Jyeshtha	        Mercury	    Scorpio ♏
Moola	            Ketu	    Sagittarius ♐
Purva Ashadha	    Venus	    Sagittarius ♐
Uttara Ashadha	    Sun	        Sagittarius ♐ / Capricorn ♑
Shravana	        Moon	    Capricorn ♑
Dhanishta	        Mars	    Capricorn ♑ / Aquarius ♒
Shatabhisha	        Rahu	    Aquarius ♒
Purva Bhadrapada	Jupiter	    Aquarius ♒ / Pisces ♓
Uttara Bhadrapada	Saturn	    Pisces ♓
Revati	            Mercury	    Pisces ♓
 */
data class nakshatras(
    val name: String,
    val nameSanskrit: String,
    val symbol: String,
    val diety: String,
    val rulingPlanet: String,
    val zodiacSign: String,
    val goodEffects: String,
    val badEffects: String
)

class AllPlanets{
    val test = planets(
        nameEng = "",
        nameHi = "",
        significance = listOf("", "", ""),
        represents = listOf("", "", ""),
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val sun = planets(
        nameEng = "Sun",
        nameHi = "Surya",
        significance = listOf("Soul", "Father", "Authority"),
        represents = listOf("Ego", "Leadership", "Health"),
        zodiacSign = "Leo",
        goodEffects = """
            Best Placements: Exalted in Aries ♈, Strong in Leo ♌ & Sagittarius ♐
            🔹 Career & Status: Authority, government positions, leadership roles
            🔹 Wealth & Finance: Success in politics, business, and government-related fields
            🔹 Personality & Health: Confidence, charisma, strong immune system
            🔹 Relationships: Respect from father, authoritative family status
            🔹 Spirituality: Wisdom, enlightenment, connection to divine energy
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Libra ♎, Afflicted by Saturn, Rahu, or Ketu
            🔻 Career & Status: Loss of reputation, failure in government jobs, weak leadership
            🔻 Wealth & Finance: Unstable income, excessive debts due to ego-driven decisions
            🔻 Personality & Health: Arrogance, anger issues, heart problems, weak eyesight
            🔻 Relationships: Conflicts with father, disrespect from society, marital ego issues
            🔻 Spirituality: False pride, lack of wisdom, difficulty accepting truth
        """.trimIndent()
    )
    val moon = planets(
        nameEng = "Moon",
        nameHi = "Chandra",
        significance = listOf("Mind", "emotions", "mother"),
        represents = listOf("Mood", "mental peace"),
        zodiacSign = "Cancer",
        goodEffects = """
            Best Placements: Exalted in Taurus ♉, Strong in Cancer ♋ & Pisces ♓
            🔹 Career & Status: Success in creativity, public relations, hospitality, and healing fields
            🔹 Wealth & Finance: Stable income, financial security
            🔹 Personality & Health: Emotional balance, calm mind, good intuition
            🔹 Relationships: Loving mother, caring and supportive spouse
            🔹 Spirituality: Deep emotional connection, psychic abilities
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Scorpio ♏, Afflicted by Rahu, Ketu, or Saturn
            🔻 Career & Status: Confusion in career, frequent job changes, lack of stability
            🔻 Wealth & Finance: Emotional overspending, loss due to bad financial decisions
            🔻 Personality & Health: Anxiety, depression, mood swings, sleep disorders
            🔻 Relationships: Unstable relationships, troubled mother-child bond
            🔻 Spirituality: Emotional instability, lack of devotion, difficulty in meditation
        """.trimIndent()
    )
    val mars = planets(
        nameEng = "Mars",
        nameHi = "Mangal",
        significance = listOf("Energy", "aggression", "passion"),
        represents = listOf("Courage", "war", "ambition"),
        zodiacSign = "Aries, Scorpio",
        goodEffects = """
            Best Placements: Exalted in Capricorn ♑, Strong in Aries ♈ & Scorpio ♏
            🔹 Career & Status: Military, engineering, sports, police, surgeons, competitive fields
            🔹 Wealth & Finance: Success in real estate, construction, and business
            🔹 Personality & Health: Physical strength, fearlessness, determination
            🔹 Relationships: Passionate love, protective nature, strong brotherly bonds
            🔹 Spirituality: Willpower for meditation, control over desires
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Cancer ♋, Afflicted by Saturn, Rahu, or Ketu
            🔻 Career & Status: Aggression in workplace, fights with colleagues, legal troubles
            🔻 Wealth & Finance: Loss due to impulsive investments, legal battles, debts
            🔻 Personality & Health: Anger issues, violence, injuries, high blood pressure
            🔻 Relationships: Marital conflicts, separation, fights with siblings
            🔻 Spirituality: Lack of patience, difficulty in controlling emotions
        """.trimIndent()
    )
    val mercury = planets(
        nameEng = "Mercury",
        nameHi = "Budh",
        significance = listOf("Intellect", "communication"),
        represents = listOf("Business", "speech", "intelligence"),
        zodiacSign = "Gemini, Virgo",
        goodEffects = """
            Best Placements: Exalted in Virgo ♍, Strong in Gemini ♊ & Aquarius ♒
            🔹 Career & Status: Writers, traders, businessmen, IT professionals, accountants
            🔹 Wealth & Finance: Strong financial intelligence, successful stock trading
            🔹 Personality & Health: Sharp intellect, good communication, problem-solving skills
            🔹 Relationships: Good social life, strong sibling bonds
            🔹 Spirituality: Logical understanding of philosophy and astrology
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Pisces ♓, Afflicted by Rahu or Ketu
            🔻 Career & Status: Poor decision-making, fraud, bad business partnerships
            🔻 Wealth & Finance: Financial losses due to deception or miscommunication
            🔻 Personality & Health: Speech disorders, nervous breakdowns, lack of focus
            🔻 Relationships: Misunderstandings, lack of trust, troubled sibling bonds
            🔻 Spirituality: Superficial knowledge, misinterpretation of sacred texts
        """.trimIndent()
    )
    val jupiter = planets(
        nameEng = "Jupiter",
        nameHi = "Guru",
        significance = listOf("Wisdom", "expansion", "luck"),
        represents = listOf("Knowledge", "spirituality", "prosperity"),
        zodiacSign = "Sagittarius, Pisces",
        goodEffects = """
            Best Placements: Exalted in Cancer ♋, Strong in Sagittarius ♐ & Pisces ♓
            🔹 Career & Status: Teachers, judges, spiritual gurus, financial advisors, CEOs
            🔹 Wealth & Finance: Abundance, inheritance, growth in wealth
            🔹 Personality & Health: Optimistic, wise, strong digestion, disease resistance
            🔹 Relationships: Happy marriage, blessed with good children, respected parents
            🔹 Spirituality: Deep spiritual knowledge, divine blessings, strong dharma
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Capricorn ♑, Afflicted by Rahu or Saturn
            🔻 Career & Status: Wrong career choices, struggles in education, fraud teachers
            🔻 Wealth & Finance: Bad financial decisions, loss in investments, blocked opportunities
            🔻 Personality & Health: Weight gain, diabetes, liver problems, lack of optimism
            🔻 Relationships: Trouble with children, bad marriage, toxic friendships
            🔻 Spirituality: Blind faith, following fake gurus, lack of true wisdom
        """.trimIndent()
    )
    val venus = planets(
        nameEng = "Venus",
        nameHi = "Shukra",
        significance = listOf("Love", "beauty", "luxury"),
        represents = listOf("Art", "romance", "wealth"),
        zodiacSign = "Taurus, Libra",
        goodEffects = """
            Best Placements: Exalted in Pisces ♓, Strong in Taurus ♉ & Libra ♎
            🔹 Career & Status: Fashion, film industry, entertainment, luxury business, artists
            🔹 Wealth & Finance: Success in luxury goods, cars, jewelry, hotels, fashion design
            🔹 Personality & Health: Attractive, charming, refined tastes, physical well-being
            🔹 Relationships: Romantic and loyal love life, happy marriage, pleasure in life
            🔹 Spirituality: Devotion, love for divine beauty, connection with arts
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Virgo ♍, Afflicted by Rahu, Ketu, or Saturn
            🔻 Career & Status: Career downfall due to vanity, unsuccessful in arts & luxury fields
            🔻 Wealth & Finance: Loss due to overspending, addiction to luxury, gambling
            🔻 Personality & Health: Infertility, kidney problems, sexual disorders
            🔻 Relationships: Cheating, extramarital affairs, divorce, troubled love life
            🔻 Spirituality: Attachment to material pleasures, lack of divine love
        """.trimIndent()
    )
    val saturn = planets(
        nameEng = "Saturn",
        nameHi = "Shani",
        significance = listOf("Karma", "discipline", "delays"),
        represents = listOf("Hardships", "patience", "success after struggle"),
        zodiacSign = "Capricorn, Aquarius",
        goodEffects = """
            Best Placements: Exalted in Libra ♎, Strong in Capricorn ♑ & Aquarius ♒
            🔹 Career & Status: Judiciary, law, engineering, management, politics, research
            🔹 Wealth & Finance: Stable financial growth, real estate, business empire
            🔹 Personality & Health: Patience, wisdom from experience, strong endurance
            🔹 Relationships: Loyal friends, strong parental bonds, long-term partnerships
            🔹 Spirituality: Deep meditation, detachment from materialism, mastery over karma
        """.trimIndent(),
        badEffects = """
            Weakness: Debilitated in Aries ♈, Afflicted by Rahu or Mars
            🔻 Career & Status: Job losses, slow growth, struggle in career
            🔻 Wealth & Finance: Debt problems, financial crisis, poverty
            🔻 Personality & Health: Chronic diseases, arthritis, joint pain, depression
            🔻 Relationships: Loneliness, lack of emotional support, delayed marriage
            🔻 Spirituality: Fear of karma, difficulty in meditation, feeling cursed
        """.trimIndent()
    )
    val rahu = planets(
        nameEng = "Rahu",
        nameHi = "Rahu",
        significance = listOf("Desires", "illusion", "foreign"),
        represents = listOf("Sudden gains/losses", "obsession"),
        zodiacSign = "None",
        goodEffects = """
            Best Placements: Strong in Taurus ♉ & Gemini ♊, Powerful in Virgo ♍ & Aquarius ♒
            🔹 Career & Status: Technology, artificial intelligence, social media, politics
            🔹 Wealth & Finance: Sudden wealth gains, success in foreign lands, cryptocurrency
            🔹 Personality & Health: Unique thinking, risk-taking ability, futuristic mindset
            🔹 Relationships: Charismatic personality, attracts influential people
            🔹 Spirituality: Karmic breakthroughs, mystical experiences, connection with hidden energies
        """.trimIndent(),
        badEffects = """
            Weakness: Bad placement in 7th, 8th, or 12th house, Afflicted by Saturn or Mars
            🔻 Career & Status: Scandals, political downfall, fraud cases
            🔻 Wealth & Finance: Loss in gambling, illegal earnings, unexpected downfall
            🔻 Personality & Health: Paranoia, drug addiction, uncontrolled desires
            🔻 Relationships: Fake friends, cheating in marriage, betrayal
            🔻 Spirituality: Black magic, false gurus, dangerous spiritual practices
        """.trimIndent()
    )
    val ketu = planets(
        nameEng = "Ketu",
        nameHi = "Ketu",
        significance = listOf("Moksha", "detachment", "past karma"),
        represents = listOf("Spirituality", "past life connections"),
        zodiacSign = "None",
        goodEffects = """
            Best Placements: Strong in Scorpio ♏ & Sagittarius ♐, Favorable in Pisces ♓
            🔹 Career & Status: Astrology, spirituality, research, medicine, psychology
            🔹 Wealth & Finance: Gains through inheritance, sudden windfalls
            🔹 Personality & Health: Deep thinker, visionary, intelligent but detached
            🔹 Relationships: Karmic connections, strong intuition about people
            🔹 Spirituality: Liberation (Moksha), powerful meditative abilities
        """.trimIndent(),
        badEffects = """
            Weakness: Bad placement in 1st, 4th, or 7th house, Afflicted by Saturn or Mars
            🔻 Career & Status: Lack of focus, job losses, sudden career downfall
            🔻 Wealth & Finance: Financial instability, loss in speculation, inability to save
            🔻 Personality & Health: Detachment from family, loneliness, spiritual confusion
            🔻 Relationships: Lack of emotional connection, sudden separation, isolation
            🔻 Spirituality: Extreme detachment, false spiritual enlightenment
        """.trimIndent()
    )
}
class AllNakshatras{
    val uses: String = """
        - Marriage Compatibility: Matching Nakshatras between partners helps in evaluating compatibility. This is known as "Guna Milan" or Kundli matching, based on ashta koot system.
        - Timing of Important Events (Muhurta): Nakshatras play a key role in electional astrology, determining auspicious timings for events like marriages, business ventures, religious ceremonies, and more.
        - Health & Remedies: Weak or afflicted Nakshatras can create health issues or life obstacles. Specific remedies, including the chanting of mantras, wearing gemstones, and rituals specific to the deity of the Nakshatra, can help alleviate such effects.
    """.trimIndent()
    val roles: String = """
        - Birth Chart Analysis: The Moon's position in a particular Nakshatra during birth helps determine an individual's mental tendencies, emotions, and instincts. It influences the person’s mindset, decision-making, and behaviors.
        - Planetary Dasha (Mahadasha & Antardasha): Nakshatras play a crucial role in the Dasha system, which predicts the sequence of life events. When a planet transits or is placed in a particular Nakshatra, it activates that planet’s dasha period, bringing forth the results associated with that Nakshatra.
        - Personality Insights: Each Nakshatra carries a distinct personality based on its associated deity and symbol. This gives an astrologer key insights into an individual’s natural inclinations, strengths, and challenges.
        - Relationship Compatibility: Nakshatras help determine compatibility in relationships. People born under specific Nakshatras are thought to be more or less compatible based on the interaction between their Nakshatras and deities.
    """.trimIndent()

    val demo = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Ashwini = nakshatras(
        name = "Ashwini",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            Energetic and dynamic
            Quick learners and problem-solvers
            Strong leadership abilities
            Healing potential and compassion
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Bharani = nakshatras(
        name = "Bharani",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Krittika = nakshatras(
        name = "Krittika",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Rohini = nakshatras(
        name = "Rohini",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Mrigashira = nakshatras(
        name = "Mrigashira",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Ardra = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Punarvasu = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Pushya = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Ashlesha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Magha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val PurvaPhalguni = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val UttaraPhalguni = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Hasta = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Chitra = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Swati = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Vishakha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Anuradha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Jyeshtha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Moola = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val PurvaAshadha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val UttaraAshadha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Shravana = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Dhanishta = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Shatabhisha = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val PurvaBhadrapada = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val UttaraBhadrapada = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
    val Revati = nakshatras(
        name = "",
        nameSanskrit = "",
        symbol = "",
        diety = "",
        rulingPlanet = "",
        zodiacSign = "",
        goodEffects = """
            
        """.trimIndent(),
        badEffects = """
            
        """.trimIndent()
    )
}