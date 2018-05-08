package com.improve_future.sound

class Tempo(value: Number, type: Tempo.Unit = Tempo.Unit.Time) {
    val millisecondInterval: Double
    val time: Double

    companion object {
        /** 24 bpm */
        val Larghissimo = Tempo(24)
        /** 28 bpm */
        val Adagissimo = Tempo(28)
        /** 31 bpm – sustained*/
        val Sostenuto = Tempo(31)
        /** 35 bpm - very slow*/
        val Grave = Tempo(35)
        /** 35 bpm – sustained */
        /**
         * 50 bpm
         *
         * broadly
         * Usually, 40–60 bpm
         */
        val Largo = Tempo(50)
        /**
         * 52 bpm
         *
         * slowly
         * usually, 45–60 bpm
         */
        val Lento = Tempo(52)
        /**
         * ToDo: Add Tempos
         *
            Larghetto – rather broadly (60–66 bpm)
            Adagio – slowly with great expression[8] (66–76 bpm)
            Adagietto – slower than andante (72–76 bpm) or slightly faster than adagio (70–80 bpm)
            Andante – at a walking pace (76–108 bpm)
            Andantino – slightly faster than andante (although, in some cases, it can be taken to mean slightly slower than andante) (80–108 bpm)
            Marcia moderato – moderately, in the manner of a march[9][10] (83–85 bpm)
            Andante moderato – between andante and moderato (thus the name) (92–112 bpm)
            Moderato – at a moderate speed (108–120 bpm)
            Allegretto – by the mid 19th century, moderately fast (112–120 bpm); see paragraph above for earlier usage
                Allegro moderato – close to, but not quite allegro (116–120 bpm)
            Allegro – fast, quickly, and bright (120–156 bpm) (molto allegro is slightly faster than allegro, but always in its range)
            Animato
            Agitato
            Veloce
            Mosso Vivo [11]
            Vivace – lively and fast (156–176 bpm)
            Vivacissimo – very fast and lively (172–176 bpm)
            Allegrissimo or Allegro vivace – very fast (172–176 bpm)
         */
        /**
         * 181 bpm
         *
         * very, very fast
         * Usually, 168–200 bpm
         */
        val Presto = Tempo(181)
        /**
         * 210 bpm
         *
         * Even faster than presto
         * Usually, 200 bpm and over
         */
        val Prestissimo = Tempo(210)
    }

    init {
        when (type) {
            Unit.Time -> {
                millisecondInterval = 60000.0 / value.toDouble()
                time = value.toDouble()
            }
            Unit.Millisecond -> {
                millisecondInterval = value.toDouble()
                time = 60 / millisecondInterval
            }
        }
    }

    enum class Unit {
        Time,
        Millisecond
    }
}