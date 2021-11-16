package com.serglife.navigationandmenu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.serglife.navigationandmenu.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {

    lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return FragmentBlankBinding.inflate(layoutInflater).also { binding = it }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonOne.setOnClickListener {
            findNavController().navigate(
                BlankFragmentDirections.actionBlankFragmentToBlankFragment2(
                    name = "Roma",
                    secondName = "Zagorskiy",
                31
                )
            )
        }
    }

}