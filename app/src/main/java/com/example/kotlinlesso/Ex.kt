package com.example.kotlinlesso

import android.content.Context
import android.widget.Toast

fun Context.showToast(arg:String){
    Toast.makeText(this,arg, Toast.LENGTH_LONG).show()
}