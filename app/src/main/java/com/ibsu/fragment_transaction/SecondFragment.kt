package com.ibsu.fragment_transaction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ibsu.fragment_transaction.databinding.FragmentSecondBinding
import timber.log.Timber


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

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
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Timber.i("log onViewCreated")

        binding.buttonNavigateToFirstFragment.setOnClickListener {
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, FirstFragment(), "fragmentTag")
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