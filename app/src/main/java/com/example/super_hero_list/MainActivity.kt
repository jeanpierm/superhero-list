package com.example.super_hero_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.super_hero_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val superHeroes: List<SuperHero> = listOf(
        SuperHero(
            "Spiderman",
            "Peter Parker",
            "Marvel",
            "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"
        ),
        SuperHero(
            "Daredevil",
            "Matthew Michael Murdock",
            "Marvel",
            "https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"
        ),
        SuperHero(
            "Wolverine",
            "James Howlett",
            "Marvel",
            "https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"
        ),
        SuperHero(
            "Batman",
            "Bruce Wayne",
            "DC",
            "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"
        ),
        SuperHero(
            "Thor",
            "Thor Odinson",
            "Marvel",
            "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"
        ),
        SuperHero(
            "Flash",
            "Jay Garrick",
            "DC",
            "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"
        ),
        SuperHero(
            "Green Lantern",
            "Alan Scott",
            "DC",
            "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"
        ),
        SuperHero(
            "Wonder Woman",
            "Princess Diana",
            "DC",
            "https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view)

        initRecycler()
    }

    private fun initRecycler() {
        binding.rvSuperHero.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superHeroes)
        binding.rvSuperHero.adapter = adapter
    }
}