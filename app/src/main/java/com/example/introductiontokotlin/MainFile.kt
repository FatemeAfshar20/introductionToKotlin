package com.example.introductiontokotlin

import com.example.introductiontokotlin.model.UserKotlin

fun main() {

}

fun createUserKotlinDataClass(){
    val user1 = UserKotlin("Jane", "Doe")
    val user2 = UserKotlin("Jane", "Doe")
    val structurallyEqual = user1 == user2 // true
    val referentiallyEqual = user1 === user2 // false
}

fun createUserArguments(){

}