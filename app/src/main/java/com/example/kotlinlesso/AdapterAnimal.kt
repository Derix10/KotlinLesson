package com.example.kotlinlesso

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterAnimal(private val data: ArrayList<Animal>,val listener: OnAnimalClickListener) : RecyclerView.Adapter<AdapterAnimal.AnimalHolder>() {

    inner class AnimalHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private var textName: TextView
        private var textAge: TextView

        init {
            textName = itemView.findViewById(R.id.textname)
            textAge = itemView.findViewById(R.id.textage)
        }

        fun bind(animal:Animal,listener:OnAnimalClickListener) {
            itemView.setOnClickListener(){
                  listener.onAnimalClick(animal)
            }
            val item = data[adapterPosition]
            textName.text = item.name
            textAge.text = item.age.toString()
        }

    }
    interface OnAnimalClickListener {
        fun onAnimalClick(animal: Animal)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalHolder {
        return AnimalHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_name, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AnimalHolder, position: Int) {
        holder.bind(data[position],listener)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}