package com.progetto_dd.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.progetto_dd.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        firebaseAuth = FirebaseAuth.getInstance()

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val user = firebaseAuth.currentUser
        if (user != null) {
            // Ottiene l'indirizzo email dell'utente corrente e lo imposta nella vista
            val email = user.email
            binding.mailUtente.text = email

            // Conta il numero di personaggi creati dall'utente corrente e imposta il valore nella vista
            getCountOfCharactersForCurrentUser(user.uid,
                onSuccess = { count ->
                    binding.personaggiCreati.text = count.toString()
                },
                onFailure = { exception ->
                    throw IllegalArgumentException("Personaggi non trovati")
                }
            )

            // Conta la razza più frequente tra i personaggi dell'utente corrente e imposta il valore nella vista
            countMostFrequentRaceForUser(user.uid,
                onSuccess = { race ->
                    binding.razzaPref.text = race
                },
                onFailure = { exception ->
                    throw IllegalArgumentException("Personaggi non trovati")
                }
            )

            // Conta la classe più frequente tra i personaggi dell'utente corrente e imposta il valore nella vista
            countMostFrequentClassForUser(user.uid,
                onSuccess = { charClass ->
                    binding.classePref.text = charClass
                },
                onFailure = { exception ->
                    throw IllegalArgumentException("Personaggi non trovati")
                }
            )

            // Conta il numero di partecipazioni alle campagne dell'utente corrente e imposta il valore nella vista
            countOccurrencesOfUserId(user.uid,
                onSuccess = { totalCount ->
                    binding.campagneInCorso.text = totalCount.toString()
                },
                onFailure = { exception ->
                    throw IllegalArgumentException("Personaggi non trovati")
                }
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun getCountOfCharactersForCurrentUser(userId: String, onSuccess: (Int) -> Unit, onFailure: (Exception) -> Unit) {
        // Ottiene un'istanza di FirebaseFirestore
        val firestore = FirebaseFirestore.getInstance()
        // Ottiene il riferimento alla collezione "personaggi"
        val collectionRef = firestore.collection("personaggi")

        collectionRef
            .whereEqualTo("utenteId", userId) // Filtra i documenti con "utenteId" uguale a userId
            .get()
            .addOnSuccessListener { querySnapshot ->
                val count = querySnapshot.size() // Ottiene il numero di documenti nel risultato della query
                onSuccess(count) // Richiama la funzione onSuccess passando il numero di personaggi
            }
            .addOnFailureListener { exception ->
                onFailure(exception) // Richiama la funzione onFailure passando l'eccezione
            }
    }



    fun countMostFrequentRaceForUser(userId: String, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
        // Ottiene un'istanza di FirebaseFirestore
        val firestore = FirebaseFirestore.getInstance()
        // Ottiene il riferimento alla collezione "personaggi"
        val collectionRef = firestore.collection("personaggi")

        collectionRef
            .whereEqualTo("utenteId", userId) // Filtra i documenti con "utenteId" uguale a userId
            .get()
            .addOnSuccessListener { querySnapshot ->
                val raceCountMap = mutableMapOf<String, Int>()

                // Conta il numero di occorrenze di ogni razza
                for (document in querySnapshot) {
                    val race = document.getString("razza")
                    if (race != null) {
                        val count = raceCountMap.getOrDefault(race, 0)
                        raceCountMap[race] = count + 1
                    }
                }

                // Trova la razza con il conteggio più alto
                var mostFrequentRace = ""
                var maxCount = 0

                for ((race, count) in raceCountMap) {
                    if (count > maxCount) {
                        mostFrequentRace = race
                        maxCount = count
                    }
                }

                // Controlla se ci sono pareggi
                val frequentRaces = raceCountMap.filter { it.value == maxCount }.keys
                mostFrequentRace = if (frequentRaces.size > 1) "Nessuna" else mostFrequentRace

                onSuccess(mostFrequentRace) // Richiama la funzione onSuccess passando la razza più frequente
            }
            .addOnFailureListener { exception ->
                onFailure(exception) // Richiama la funzione onFailure passando l'eccezione
            }
    }


    fun countMostFrequentClassForUser(userId: String, onSuccess: (String) -> Unit, onFailure: (Exception) -> Unit) {
        // Ottiene un'istanza di FirebaseFirestore
        val firestore = FirebaseFirestore.getInstance()
        // Ottiene il riferimento alla collezione "personaggi"
        val collectionRef = firestore.collection("personaggi")

        collectionRef
            .whereEqualTo("utenteId", userId) // Filtra i documenti con "utenteId" uguale a userId
            .get()
            .addOnSuccessListener { querySnapshot ->
                val classCountMap = mutableMapOf<String, Int>()

                // Conta il numero di occorrenze di ogni classe
                for (document in querySnapshot) {
                    val charClass = document.getString("classe")
                    if (charClass != null) {
                        val count = classCountMap.getOrDefault(charClass, 0)
                        classCountMap[charClass] = count + 1
                    }
                }

                // Trova la classe con il conteggio più alto
                var mostFrequentClass = ""
                var maxCount = 0

                for ((charClass, count) in classCountMap) {
                    if (count > maxCount) {
                        mostFrequentClass = charClass
                        maxCount = count
                    }
                }

                // Controlla se ci sono pareggi
                val frequentClasses = classCountMap.filter { it.value == maxCount }.keys
                mostFrequentClass = if (frequentClasses.size > 1) "Nessuna" else mostFrequentClass

                onSuccess(mostFrequentClass) // Richiama la funzione onSuccess passando la classe più frequente
            }
            .addOnFailureListener { exception ->
                onFailure(exception) // Richiama la funzione onFailure passando l'eccezione
            }
    }


    fun countOccurrencesOfUserId(userId: String, onSuccess: (Int) -> Unit, onFailure: (Exception) -> Unit) {
        // Ottiene un'istanza di FirebaseFirestore
        val firestore = FirebaseFirestore.getInstance()
        // Ottiene il riferimento alla collezione "campagne"
        val collectionRef = firestore.collection("campagne")

        collectionRef
            .whereArrayContains("partecipanti", userId) // Filtra i documenti in cui "partecipanti" contiene userId
            .get()
            .addOnSuccessListener { querySnapshotPartecipanti ->
                val countPartecipanti = querySnapshotPartecipanti.size()

                collectionRef
                    .whereEqualTo("masterId", userId) // Filtra i documenti con "masterId" uguale a userId
                    .get()
                    .addOnSuccessListener { querySnapshotMaster ->
                        val countMaster = querySnapshotMaster.size()

                        val totalCount = countPartecipanti + countMaster
                        onSuccess(totalCount) // Richiama la funzione onSuccess passando il conteggio totale
                    }
                    .addOnFailureListener { exception ->
                        onFailure(exception) // Richiama la funzione onFailure passando l'eccezione
                    }
            }
            .addOnFailureListener { exception ->
                onFailure(exception) // Richiama la funzione onFailure passando l'eccezione
            }
    }
}