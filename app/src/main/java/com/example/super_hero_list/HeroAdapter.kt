package com.example.super_hero_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.super_hero_list.databinding.ItemSuperHeroBinding
import com.squareup.picasso.Picasso

class HeroAdapter(private val superHeroes: List<SuperHero>) :
    RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater
            .inflate(R.layout.item_super_hero, parent, false))
    }

    override fun getItemCount(): Int = superHeroes.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHeroes[position])
    }

    class HeroHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemSuperHeroBinding.bind(view)

        fun render(superHero: SuperHero) {
            binding.textRealName.text = superHero.realName
            binding.textSuperHeroName.text = superHero.superHeroName
            binding.textPublisher.text = superHero.publisher
            Picasso.get().load(superHero.imageUrl).into(binding.imgHero)
            view.setOnClickListener {
                Toast.makeText(
                    view.context,
                    "Has seleccionado a ${superHero.superHeroName}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}