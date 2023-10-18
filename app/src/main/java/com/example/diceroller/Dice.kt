package com.example.diceroller

class Dice(numSide: Int) {
    private var m_numSide: Int = numSide
    fun Roll(): Int {
        return (1..m_numSide).random()
    }
}