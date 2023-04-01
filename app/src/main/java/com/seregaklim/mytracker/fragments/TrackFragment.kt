package com.seregaklim.mytracker.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.seregaklim.mytracker.databinding.TrackBinding


class TrackFragment : Fragment() {

        private lateinit var binding: TrackBinding
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View{
            binding=TrackBinding.inflate(inflater,container,false)
            // Inflate the layout for this fragment
            return binding.root
        }


        companion object {
            @JvmStatic
            fun newInstance() =  TrackFragment()
        }

    }
