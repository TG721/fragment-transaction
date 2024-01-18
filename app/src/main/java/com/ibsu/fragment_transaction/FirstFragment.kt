package com.ibsu.fragment_transaction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ibsu.fragment_transaction.databinding.FragmentFirstBinding
import timber.log.Timber


class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("log onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        Timber.i("log onCreateView")
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("log onViewCreated")

    binding.buttonNavigateToSecondFragment.setOnClickListener {
        requireActivity().supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, SecondFragment(), "fragmentTag")
            .addToBackStack(null)
            .commit()
    }

    }

    override fun onStart() {
        super.onStart()
        Timber.i("log onStart")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("log onResume")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("log onPause")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("log onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Timber.i("log onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("log onDestroy")
    }
}