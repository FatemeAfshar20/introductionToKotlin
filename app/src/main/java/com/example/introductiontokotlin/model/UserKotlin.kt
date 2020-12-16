package com.example.introductiontokotlin.model

class UserKotlin(firstName:String?,lastName:String?) {
     operator fun component1(): String {
               return firstName
     }

     operator fun component2():String{
          return lastName
     }

     var firstName=""
     var lastName=""
}