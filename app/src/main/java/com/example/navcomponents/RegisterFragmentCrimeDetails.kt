package com.example.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navcomponents.databinding.FragmentRegisterCrimeDetailsBinding

class RegisterFragmentCrimeDetails : Fragment(R.layout.fragment_register_crime_details) {
    private lateinit var binding:FragmentRegisterCrimeDetailsBinding
    private val args : RegisterFragmentCrimeDetailsArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentRegisterCrimeDetailsBinding.bind(view)

        binding.textViewName.text="${args.name}'s case"

        binding.btnCancel.setOnClickListener {
            binding.root.findNavController().popBackStack(R.id.homeCrimeFragment,false)
        }

    }
}