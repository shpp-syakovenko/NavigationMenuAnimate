package com.serglife.navigationandmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.serglife.navigationandmenu.databinding.FragmentBlank2Binding


class BlankFragment2 : Fragment() {

    private lateinit var binding: FragmentBlank2Binding
    private val args by navArgs<BlankFragment2Args>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentBlank2Binding.inflate(layoutInflater, container, false)
            .also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvName.text = args.name
        binding.tvSecondName.text = args.secondName
        binding.tvAge.text = args.age.toString()


        binding.buttonTwo.setOnClickListener {
            findNavController().navigate(BlankFragment2Directions.actionBlankFragment2ToNavigationNewGraph())
        }


    }


}