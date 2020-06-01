package com.example.advancedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    private val colours = arrayListOf<ColourItem>()
    private val colourAdapter= ColourAdapter(colours, {colourItem -> onColourClick(colourItem) })
    private lateinit var viewModel: MainActivityViewModel

    private fun onColourClick(colourItem: ColourItem) {
        Snackbar.make(rvColours, "This colour is ${colourItem.name}", Snackbar.LENGTH_LONG).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initViewModel()
    }

    private fun initViews() {
        rvColours.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        rvColours.adapter = colourAdapter
    }

    private fun initViewModel() {
        TODO("Not yet implemented")
    }
}
