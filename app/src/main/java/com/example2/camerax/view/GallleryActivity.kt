package com.example2.camerax.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example2.camerax.databinding.ActivityGallleryBinding
import java.io.File

class GallleryActivity : AppCompatActivity() {
    val binding by lazy { ActivityGallleryBinding.inflate(layoutInflater) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val directory = File(externalMediaDirs[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        // array is reversed to ensure last taken photo appears first.
        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }
}