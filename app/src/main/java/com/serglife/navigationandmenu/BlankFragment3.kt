package com.serglife.navigationandmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.navigation.fragment.findNavController
import com.serglife.navigationandmenu.databinding.FragmentBlank3Binding


class BlankFragment3 : Fragment() {
    private lateinit var binding:FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentBlank3Binding.inflate(layoutInflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonThree.setOnClickListener {
            findNavController().navigate(BlankFragment3Directions.actionBlankFragment3ToBlankFragment4())
        }



        binding.buttonAnim.setOnClickListener {

            binding.tvAnim.startAnimation(AnimationUtils.loadAnimation(context, R.anim.hyperspace_jump))
        }
    }

}