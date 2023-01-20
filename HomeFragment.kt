package com.example.workoutapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.workoutapp.databinding.FragmentHomeBinding


class HomeFragment:Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?{
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){

        // Todo code
        binding.beginnerButton.setOnClickListener{
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToTrainFragment(10))
        }
        binding.advancedButton.setOnClickListener{
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToTrainFragment(50))
        }
        binding.xtremButton.setOnClickListener{
            findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToTrainFragment(100))
        }
    }
}