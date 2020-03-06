package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.view.*

class FourthFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_fourth, container, false)

        view.button.setOnClickListener {
            //            findNavController().navigate(R.id.action_third_to_first)
            findNavController().popBackStack(R.id.firstFragment, false) //スタック積み続けるのを避けるにはこちら
        }

        return view
    }
}