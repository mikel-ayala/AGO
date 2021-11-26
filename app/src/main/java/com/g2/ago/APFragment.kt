package com.g2.ago

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_a_p.*


class APFragment : Fragment() {
    val respuesta:String="emakume"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a_p, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        btnValidar.setOnClickListener{
            if(txtEmakume.text.toString().toLowerCase().equals(respuesta)){
                val mp:MediaPlayer? = MediaPlayer.create(requireContext(), R.raw.ondo)
                Toast.makeText(requireContext(), "Bien echo", Toast.LENGTH_SHORT).show()
                mp!!.start()
            }else{
                val mp:MediaPlayer? = MediaPlayer.create(requireContext(), R.raw.txarto)
                Toast.makeText(requireContext(), "Otra vez sera", Toast.LENGTH_SHORT).show()
                mp!!.start()
            }
        }
    }
}