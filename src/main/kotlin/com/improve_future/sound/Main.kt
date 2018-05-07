package com.improve_future.sound

import javax.sound.midi.*

operator fun Synthesizer.invoke(block: Synthesizer.() -> Unit) {
    this.open()
    this.block()
    this.close()
}

fun main(vararg args: String) {
    (MidiSystem.getSynthesizer()) {
        //get and load default instrument and channel lists
        //val instr: Array<Instrument> = defaultSoundbank.instruments;
        val mChannels: Array<MidiChannel> = getChannels();

        //midiSynth.loadInstrument(instr[0]);//load an instrument

        Player {
            channel = mChannels[0]
            tempo = Tempo.Grave

            arrayOf(
                    Note.C4, Note.D4, Note.E4, Note.F4, Note.G4, Note.A4, Note.B4
            ).forEach { p(it) }

            arrayOf(Chord.C, Chord.G).
                    forEach { p(it) }

            p(Note.C4, Note.E4, Note.G4)
        }

        Player {
            channel = mChannels[0]
            tempo = Tempo.Prestissimo

            p(Note.C4, Note.E4)
            p(Note.D4, Note.D4 + 3)
            p(Note.E4, Note.E4 + 3)
        }
    }
}
