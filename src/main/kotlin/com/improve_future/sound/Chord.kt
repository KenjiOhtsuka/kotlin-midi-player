package com.improve_future.sound

class Chord(var noteArray: Array<Note> = arrayOf()): Playable {
    companion object {
        val C = Chord(
                arrayOf<Note>(
                        Note(),
                        Note() + 4,
                        Note() + 7
                )
        )
        val Db = C + 1
        val D = C + 2
        val Eb = C + 3
        val E = C + 4
        val F = C + 5
        val Gb = C + 6
        val G = C + 7
        val Ab = C + 9
        val A = C + 10
        val Bb = C + 11
        val B = C + 12
    }
}

infix operator fun Chord.plus(i: Int): Chord {
    return Chord(this.noteArray.map { it + i }.toTypedArray())
}