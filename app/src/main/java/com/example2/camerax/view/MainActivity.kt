package com.example2.camerax.view

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.example2.camerax.R
import com.example2.camerax.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {


    private
    val binding by lazy{ ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }



    override fun onBackPressed() {
        Navigation.findNavController(this,
            R.id.nav_host_fragment).navigate(R.id.action_gallery_Fragment_to_mainFragment)
    }
}