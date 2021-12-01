package com.g2.ago

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.g2.ago.databinding.FragmentFotosBinding
import kotlinx.android.synthetic.main.fragment_fotos.*


class FotosFragment : Fragment() {
    lateinit var binding: FragmentFotosBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentFotosBinding.inflate(layoutInflater)
        fotos()
        return binding.root
    }

    private fun fotos() {
        when(Sharedapp.puntopartida.Partida){
            "0"->{
                when(Sharedapp.puntojuego.Juego){
                    "1"->{

                    }
                    "2"-> {

                    }
                }
            }
            "1"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.portua1argazkia)
                    }
                    "2"->{
                        imagen.setImageResource(R.drawable.portua2argazkia)
                    }
                    "3"->{
                        imagen.setImageResource(R.drawable.portua3argazkia)
                    }
                }
            }
            "2"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.kofradia1argazkia)
                    }
                    "2"->{

                    }
                    "3"->{

                    }
                }
            }
            "3"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.sotera1argazkia)
                    }
                    "2"->{
                        imagen.setImageResource(R.drawable.sotera2argazkia)
                    }
                    "3"->{

                    }
                    "4"->{
                        imagen.setImageResource(R.drawable.sotera3izaskunetxaniz)
                    }
                }
            }
            "4"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.kioskoa1argazkia)
                    }
                    "2"->{

                    }
                    "3"->{

                    }
                }
            }
            "5"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.udaletxea1argazkia)
                    }
                    "2"->{
                        imagen.setImageResource(R.drawable.udaletxea2argazkia)
                    }
                    "3"->{

                    }
                    "4"->{

                    }
                }
            }
            "6"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.auzoa1argazkia)
                    }
                    "2"->{
                        imagen.setImageResource(R.drawable.auzoa2argazkia)
                    }
                    "3"->{

                    }
                    "4"->{

                    }
                }
            }
            "7"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{
                        imagen.setImageResource(R.drawable.sardinera1argazkia)
                    }
                    "2"->{
                        imagen.setImageResource(R.drawable.sardinera2argazkia)
                    }
                    "3"->{

                    }
                    "4"->{

                    }

                }
            }
            "8"->{
                when(Sharedapp.puntojuego.PuntoJuego.toString()){
                    "1"->{

                    }
                    "3"->{

                    }
                    "2"->{

                    }

                }
            }

        }
    //
    }

}