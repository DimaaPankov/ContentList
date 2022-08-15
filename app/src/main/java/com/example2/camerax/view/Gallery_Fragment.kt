package com.example2.camerax.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example2.camerax.R
import com.example2.camerax.databinding.FragmentGalleryBinding
import java.io.File

class Gallery_Fragment : Fragment() {

    val binding by lazy { FragmentGalleryBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val directory = File(requireContext().externalMediaDirs[0].absolutePath)
        val files = directory.listFiles() as Array<File>

        // array is reversed to ensure last taken photo appears first.
        val adapter = GalleryAdapter(files.reversedArray())
        binding.viewPager.adapter = adapter
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }


}