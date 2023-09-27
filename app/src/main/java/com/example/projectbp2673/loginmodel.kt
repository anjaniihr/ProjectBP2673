package com.example.projectbp2673

class LoginModel {
    //variabel
    var username = ""
    var password = ""

    //method/fc
    fun loginCheck():Boolean{
        if(username.equals("anjani") && password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}