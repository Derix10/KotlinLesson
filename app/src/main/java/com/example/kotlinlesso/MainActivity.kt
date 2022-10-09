package com.example.kotlinlesso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() , AdapterAnimal.OnAnimalClickListener{
private var array  = ArrayList<Animal>()
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycle_view)
        var ani = Animal(3, "knngj")
        array.add(Animal(20,"Cacodu"))
        array.add(Animal(35,"Camel"))
        array.add(Animal(4,"Lemur"))
        array.add(Animal(3,"Monkey"))
        array.add(Animal(12,"Dog"))
        array.add(Animal(2,"Cat"))
        array.add(Animal(18,"Tiger"))
        array.add(Animal(5,"Wolf"))
        array.add(Animal(16,"Giraffe"))
        array.add(Animal(24,"Leopard"))
        val adapter = AdapterAnimal(array,this)

        recyclerView.adapter  = adapter
    }

    override fun onAnimalClick(animal: Animal) {
      showToast("Animal: ${animal.name}, Your age: ${animal.age}")
    }
}