package com.seregaklim.mytracker.utils

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.seregaklim.mytracker.R

// открывает указанные фрагменты
fun Fragment.openFragment (fragment: Fragment){
    (activity as AppCompatActivity).supportFragmentManager
        .beginTransaction()
      //анимация  (fade_in-начало, fade_out-конец)
        .setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out)
        .replace(R.id.placeHolder,fragment).commit()
}

// открывает указанные фрагменты
fun AppCompatActivity.openFragment (fragment: Fragment){
      supportFragmentManager
        .beginTransaction()
        //анимация  (fade_in-начало, fade_out-конец)
        .setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out)
        .replace(R.id.placeHolder,fragment).commit()
}



fun Fragment.showTost (s:String){
      Toast.makeText(activity,s,Toast.LENGTH_SHORT).show()
}

fun AppCompatActivity.showTost (s:String){
    Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
}