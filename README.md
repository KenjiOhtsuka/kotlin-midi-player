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

`Tempo` can be instantiated as follows

* `Tempo(60.0)` : represents 60 bpm.
* `Tempo(1000.0, Tempo.Unit.Millisecond)` : make quater note length 1000 milliseconds.


`p(Note.C4)` means play C4 note, as quater note.

`Note.C4 + 2` is `Note.D4`,
`Note.E4 + 2` is `Note.F4`.

`p(Chord.C)` means play C chord, as quater notes.

## Gradle

```
repositories {
  maven { url 'https://jitpack.io' }
}
dependencies {
  compile 'com.github.KenjiOhtsuka:kotlin-midi-player:0.0.2'
}
```
