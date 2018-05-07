package com.improve_future.sound

import javax.sound.midi.MidiChannel

class Player() {
    lateinit var channel: MidiChannel
    lateinit var tempo: Tempo

    constructor(
            channel: MidiChannel,
            tempo: Tempo,
            block: Player.() -> Unit
    ): this() {
        this.tempo = tempo
        this.channel = channel
        this.block()
    }

    constructor(block: Player.() -> Unit): this() {
        this.block()
    }

    fun p(vararg playable: Playable) {
        channel.run {
            playable.forEach {
                when (it) {
                    is Chord -> {
                        for (note in it.noteArray) {
                            channel.noteOn(note.pitch, 100)
                        }
                    }
                    is Note -> {
                        channel.noteOn(it.pitch, 100)
                    }
                }
            }
            Thread.sleep(tempo.millisecondInterval.toLong())
            channel.allNotesOff()
        }
    }
}