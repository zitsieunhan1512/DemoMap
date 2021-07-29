package com.example.myapplication

import java.util.*

fun main() {
    print("Enter the word to guess: ")
    val key = readLine()
    if (key == null) {
        println("No word given, game ended.")
        return
    }
    Process(key)
}

fun Process(subKey: String) {
    for (i in 1..100) {
        println()
    }
    val letters = subKey.toLowerCase(Locale.ROOT).toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var failCount = 0
    while (letters != correctGuesses) {
        print("enter the char: ")
        val firstCharacter = readLine()
        if (firstCharacter?.toCharArray()?.size != 1) continue
        if (firstCharacter == null) continue
        firstCharacter.toLowerCase()
        if (subKey.toLowerCase().contains(firstCharacter)) {
            correctGuesses.add(firstCharacter[0])
        } else {
            failCount += 1
        }
        printExploreText(subKey, failCount, correctGuesses)
    }

    if (failCount < 100) println(" YOU WIN! \n The answer is '$subKey' \n FAILS: $failCount ")
    else println("YOU LOSE! \n The answer is '$subKey' \n FAILS: $failCount ")
}

fun printExploreText(subKey: String, subFailCount: Int, subCorrectGuesses: Collection<Char>) {
    for (character in subKey) {
        if (subCorrectGuesses.contains(character)) {
            print(character)
        } else {
            print('_')
        }
    }
    println()
    println("FailCount: $subFailCount")
}




