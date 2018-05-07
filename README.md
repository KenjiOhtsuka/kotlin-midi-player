# Simple Kotlin Midi Player Library

[![](https://jitpack.io/v/KenjiOhtsuka/kotlin-midi-player.svg)](https://jitpack.io/#KenjiOhtsuka/kotlin-midi-player)

## Usage

```
(MidiSystem.getSynthesizer()) {
    Player {
        channel = channels[0]
        tempo = Tempo.Grave

        arrayOf(
                Note.C4, Note.D4, Note.E4, Note.F4, Note.G4, Note.A4, Note.B4
        ).forEach { p(it) }

        arrayOf(Chord.C, Chord.G).
                forEach { p(it) }

        p(Note.C4, Note.E4, Note.G4)
    }

    Player {
        channel = channels[0]
        tempo = Tempo.Prestissimo

        p(Note.C4, Note.E4)
        p(Note.D4, Note.D4 + 3)
        p(Note.E4, Note.E4 + 3)
    }
}
```

## Gradle

```
repositories {
  maven { url 'https://jitpack.io' }
}
dependencies {
  compile 'com.github.KenjiOhtsuka:kotlin-midi-player:0.0.1'
}
```