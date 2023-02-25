package com.bettermyselfllc.recyclerviewstaggeredgridlayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bettermyselfllc.recyclerviewstaggeredgridlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        binding.recyclerView.apply {
            layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            adapter = FlowerAdapter(createFlowerList()) { flower, position ->
                Toast.makeText(
                    this@MainActivity,
                    "Clicked on Flower: ${flower.name}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun createFlowerList(): ArrayList<Flower> {
        return arrayListOf<Flower>(
            Flower(
                "Blue Bell",
                R.drawable.keep_calm
            ),
            Flower(
                "Calendula",
                R.drawable.lady
            ),
            Flower(
                "Iris",
                R.drawable.okay
            ),
            Flower(
                "Jasmine",
                R.drawable.rocking_panda
            ),
            Flower(
                "Lavender",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Lily",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Lotus",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "MaryGold",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Orchid",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Poppy",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Rose",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Rosemary Dahlia",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Sunflower",
                R.drawable.ic_launcher_background
            ),
            Flower(
                "Tulip",
                R.drawable.ic_launcher_background
            )
        )
    }
}
