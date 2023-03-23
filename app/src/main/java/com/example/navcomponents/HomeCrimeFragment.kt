package com.example.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.navcomponents.databinding.FragmentHomeCrimeBinding

class HomeCrimeFragment : Fragment(R.layout.fragment_home_crime) {
    private lateinit var binding:FragmentHomeCrimeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding=FragmentHomeCrimeBinding.bind(view)
        val navController=binding.root.findNavController()

        binding.btnRegisterNewCrime.setOnClickListener{
            navController.navigate(HomeCrimeFragmentDirections.actionHomeCrimeFragmentToRegisterFragmentPersonalDetails())
        }
        binding.btnFindACrime.setOnClickListener{
            navController.navigate(HomeCrimeFragmentDirections.actionHomeCrimeFragmentToFragmentFindACrime())
        }
        binding.btnViewAllCrimes.setOnClickListener {
            navController.navigate(HomeCrimeFragmentDirections.actionHomeCrimeFragmentToFragmentViewAllCrime())
        }
    }

}