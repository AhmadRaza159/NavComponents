package com.example.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navcomponents.databinding.FragmentRegisterPersonalInfoBinding

class RegisterFragmentPersonalDetails : Fragment(R.layout.fragment_register_personal_info) {
    private lateinit var binding:FragmentRegisterPersonalInfoBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding= FragmentRegisterPersonalInfoBinding.bind(view)

        binding.btnNext.setOnClickListener {
            binding.root.findNavController().navigate(RegisterFragmentPersonalDetailsDirections.actionRegisterFragmentPersonalDetailsToRegisterFragmentCrimeDetails(binding.etName.text.toString(), binding.etAge.text.toString(), binding.etPhone.text.toString()))
        }

        binding.btnCancel.setOnClickListener {
            binding.root.findNavController().popBackStack()
        }
    }
}