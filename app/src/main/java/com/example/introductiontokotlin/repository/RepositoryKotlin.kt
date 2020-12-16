package com.example.introductiontokotlin.repository
import com.example.introductiontokotlin.model.UserKotlin

object RepositoryKotlin {
    var listOfUser= mutableListOf<UserKotlin>()

    init{
        listOfUser= mutableListOf()
        val user1=UserKotlin("Jane","")
        val user2=UserKotlin("John",null)
        val user3=UserKotlin("Anne","Doe")
        listOfUser.add(user1)
        listOfUser.add(user2)
        listOfUser.add(user3)
    }

    fun getUsers() : MutableList<UserKotlin>? {
        return listOfUser
    }

    fun getFormattedUserName() : List<String>{
        var names= mutableListOf<String>()

        for(i in 0..listOfUser.size){
            val user= listOfUser[i]
            val (firstName,LastName)=user
            val name= "$firstName   $LastName"

            names.add(name)
        }

        return names
    }
}