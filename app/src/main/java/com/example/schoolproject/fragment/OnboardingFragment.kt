package com.example.schoolproject.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.schoolproject.R
import com.example.schoolproject.databinding.FragmentOnboardingBinding

class OnboardingFragment : Fragment() {
private lateinit var binding: FragmentOnboardingBinding

override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding= FragmentOnboardingBinding.inflate(layoutInflater)
    return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root.setOnClickListener{
            loadSignUpFragment()
        }
    }

    fun loadSignUpFragment() {
        val fragmentTransaction = parentFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container_view, SignUpFragment())
        fragmentTransaction.addToBackStack(null).commit()

    }

}