package com.progetto_dd.view.characters.crea

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.progetto_dd.R
import com.progetto_dd.databinding.FragmentRaceInfoBinding
import com.progetto_dd.memory.personaggio.PersonaggioViewModel

class RaceInfoFragment : Fragment() {

    private var _binding: FragmentRaceInfoBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: PersonaggioViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRaceInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Inizializza il viewmodel
        viewModel = ViewModelProvider(requireActivity()).get(PersonaggioViewModel::class.java)

        // Inizializza la razza selezionata dall'utente dal viewmodel
        val razza = viewModel.razzaPersonaggio.value

        if (razza != null) {
            when(razza){
                "Elfo"-> binding.raceInfoText.text = getString(R.string.Elfo_info)
                "Umano"-> binding.raceInfoText.text = getString(R.string.Umano_info)
                "Nano"-> binding.raceInfoText.text = getString(R.string.Nano_info)
            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}