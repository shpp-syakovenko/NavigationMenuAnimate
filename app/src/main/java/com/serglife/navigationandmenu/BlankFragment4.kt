package com.serglife.navigationandmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.serglife.navigationandmenu.databinding.FragmentBlank3Binding
import com.serglife.navigationandmenu.databinding.FragmentBlank4Binding

class BlankFragment4 : Fragment() {
    private lateinit var binding: FragmentBlank4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentBlank4Binding.inflate(layoutInflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFour.setOnClickListener {

        }
    }

}