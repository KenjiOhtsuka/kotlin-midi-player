package com.improve_future.sound

class Note(val pitch: Int = 60): Playable {
    companion object {
        val C4 = Note(60)
        val D4 = Note(62)
        val E4 = Note(64)
        val F4 = Note(65)
        val G4 = Note(67)
        val A4 = Note(69)
        val B4 = Note(71)
    }

    fun sharp(): Note {
        return Note(pitch + 1)
    }

    fun flat(): Note {
        return Note(pitch - 1)
    }
}

infix operator fun Note.plus(i: Int): Note {
    return Note(this.pitch + i)
}