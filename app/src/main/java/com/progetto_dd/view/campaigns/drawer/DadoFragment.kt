package com.progetto_dd.view.campaigns.drawer

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText
import com.progetto_dd.R


class DadoFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        rootView = inflater.inflate(R.layout.fragment_dado, container, false)

        val buttonD100: Button = rootView.findViewById(R.id.d100)
        val buttonD20: Button = rootView.findViewById(R.id.d20)
        val buttonD12: Button = rootView.findViewById(R.id.d12)
        val buttonD10: Button = rootView.findViewById(R.id.d10)
        val buttonD8: Button = rootView.findViewById(R.id.d8)
        val buttonD6: Button = rootView.findViewById(R.id.d6)
        val buttonD4: Button = rootView.findViewById(R.id.d4)
        val buttonD3: Button = rootView.findViewById(R.id.d3)
        val buttonD2: Button = rootView.findViewById(R.id.d2)
        val button9: Button = rootView.findViewById(R.id.bottone9)
        val button8: Button = rootView.findViewById(R.id.bottone8)
        val button7: Button = rootView.findViewById(R.id.bottone7)
        val button6: Button = rootView.findViewById(R.id.bottone6)
        val button5: Button = rootView.findViewById(R.id.bottone5)
        val button4: Button = rootView.findViewById(R.id.bottone4)
        val button3: Button = rootView.findViewById(R.id.bottone3)
        val button2: Button = rootView.findViewById(R.id.bottone2)
        val button1: Button = rootView.findViewById(R.id.bottone1)
        val button0: Button = rootView.findViewById(R.id.bottone0)
        val buttonminus: Button = rootView.findViewById(R.id.bottone_meno)
        val buttonplus: Button = rootView.findViewById(R.id.bottone_piu)
        val buttonBackspaceDado: ImageButton = rootView.findViewById(R.id.backspaceButtonDado)
        val buttonBackspaceModificatore: ImageButton = rootView.findViewById(R.id.backspaceButtonModificatore)
        val buttonRoll: Button = rootView.findViewById(R.id.roll)

        buttonD100.setOnClickListener { onButtonClick("d100") }
        buttonD20.setOnClickListener { onButtonClick("d20") }
        buttonD12.setOnClickListener { onButtonClick("d12") }
        buttonD10.setOnClickListener { onButtonClick("d10") }
        buttonD8.setOnClickListener { onButtonClick("d8") }
        buttonD6.setOnClickListener { onButtonClick("d6") }
        buttonD4.setOnClickListener { onButtonClick("d4") }
        buttonD3.setOnClickListener { onButtonClick("d3") }
        buttonD2.setOnClickListener { onButtonClick("d2") }
        buttonBackspaceDado.setOnClickListener { onBackspaceClick() }
        button9.setOnClickListener { onButtonClick2("9") }
        button8.setOnClickListener { onButtonClick2("8") }
        button7.setOnClickListener { onButtonClick2("7") }
        button6.setOnClickListener { onButtonClick2("6") }
        button5.setOnClickListener { onButtonClick2("5") }
        button4.setOnClickListener { onButtonClick2("4") }
        button3.setOnClickListener { onButtonClick2("3") }
        button2.setOnClickListener { onButtonClick2("2") }
        button1.setOnClickListener { onButtonClick2("1") }
        button0.setOnClickListener { onButtonClick2("0") }
        buttonminus.setOnClickListener { onButtonClick2("-") }
        buttonplus.setOnClickListener { onButtonClick2("+") }
        buttonBackspaceModificatore.setOnClickListener { onBackspaceClick2() }
        buttonRoll.setOnClickListener { onRollClick() }

        return rootView
    }

    private fun onButtonClick(buttonText: String) {
        val textDado: TextInputEditText = rootView.findViewById(R.id.textDado)
        val currentText = textDado.text.toString()
        if (currentText.isEmpty()) {
            textDado.setText("$currentText$buttonText")
        } else {
            textDado.setText("$currentText+$buttonText")
        }
    }


    private fun onButtonClick2(buttonText: String) {
        val textModificatore: TextInputEditText = rootView.findViewById(R.id.textModificatore)
        val currentText = textModificatore.text.toString()
        textModificatore.setText("$currentText$buttonText")
    }

    private fun onBackspaceClick() {
        val textDado: TextInputEditText = rootView.findViewById(R.id.textDado)
        val currentText = textDado.text.toString()
        if (currentText.isNotEmpty()) {
            val newText = when {
                currentText.endsWith("d") || currentText.endsWith("+") -> currentText.dropLast(1)
                else -> {
                    val lastIndexOfPlus = currentText.lastIndexOf("+")
                    val lastIndex = maxOf(lastIndexOfPlus)
                    if (lastIndex >= 0) {
                        currentText.substring(0, lastIndex)
                    } else {
                        ""
                    }
                }
            }
            textDado.setText(newText)
            textDado.setSelection(newText.length) // Imposta il cursore alla fine del testo
        }
    }


    private fun onBackspaceClick2() {
        val textModificatore: TextInputEditText = rootView.findViewById(R.id.textModificatore)
        val currentText = textModificatore.text.toString()
        if (currentText.isNotEmpty()) {
            val newText = currentText.substring(0, currentText.length - 1)
            textModificatore.setText(newText)
            textModificatore.setSelection(newText.length) // Imposta il cursore alla fine del testo
        }
    }

    private fun onRollClick() {
        val textDado: TextInputEditText = rootView.findViewById(R.id.textDado)
        val textModificatore: TextInputEditText = rootView.findViewById(R.id.textModificatore)
        val currentTextDado = textDado.text.toString()
        val currentTextModificatore = textModificatore.text.toString()

        if (currentTextDado.isEmpty() && currentTextModificatore.isEmpty()) {
            return
        } else if (currentTextModificatore.isNotEmpty() && currentTextModificatore.endsWith("+") || currentTextModificatore.endsWith(
                "-"
            )
        ) {
            Toast.makeText(
                context,
                "Il modificatore deve terminare con un numero",
                Toast.LENGTH_SHORT
            ).show()
            return
        } else if (currentTextModificatore.isNotEmpty() && currentTextDado.isEmpty()) {
            showNumericResult(valutaEspressione(currentTextModificatore))
            return
        } else if (currentTextDado.isNotEmpty() && currentTextModificatore.isEmpty()) {
            showRollResultNoModificatore(rollDice(currentTextDado), currentTextDado)
        } else {
            showRollResultWithModificatore(
                rollDice(currentTextDado),
                currentTextDado,
                valutaEspressione(currentTextModificatore)
            )
        }


    }

    fun rollDice(diceString: String): List<Int> {
        val diceRegex = Regex("(\\d+)?d(\\d+)")
        val diceMatches = diceRegex.findAll(diceString)

        val results = mutableListOf<Int>()

        for (match in diceMatches) {
            val numDice = match.groupValues[1]?.toIntOrNull() ?: 1
            val numSides = match.groupValues[2].toInt()

            repeat(numDice) {
                val rollResult = (1..numSides).random()
                results.add(rollResult)
            }
        }

        return results
    }

    fun valutaEspressione(string: String): Int {
        var risultato = 0
        var operatore = '+'
        var numero = ""

        for (char in string) {
            if (char.isDigit() || char == '.') {
                numero += char
            } else {
                val currentNumber = numero.toIntOrNull()
                if (currentNumber != null) {
                    when (operatore) {
                        '+' -> risultato += currentNumber
                        '-' -> risultato -= currentNumber
                    }
                }
                operatore = char
                numero = ""
            }
        }

        val lastNumber = numero.toIntOrNull()
        if (lastNumber != null) {
            when (operatore) {
                '+' -> risultato += lastNumber
                '-' -> risultato -= lastNumber
            }
        }

        return risultato
    }

    private fun showNumericResult(result: Int) {
        val message = "TOTALE: $result"
        val alertDialogBuilder = AlertDialog.Builder(requireContext())
        alertDialogBuilder.setMessage(message)
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    fun showRollResultNoModificatore(results: List<Int>, string: String) {
        val sum = results.sum()
        val formattedResults =
            results.map { "[$it]" } // Aggiunge le parentesi quadre ai singoli lanci
        val formattedResultsString =
            formattedResults.joinToString("+") // Unisce i lanci separati da "+"

        val dialogBuilder = context?.let { AlertDialog.Builder(it) }
        if (dialogBuilder != null) {
            val titleTextView = TextView(context)
            titleTextView.text = "$sum"
            titleTextView.gravity = Gravity.CENTER // Centra il titolo
            titleTextView.setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                80f
            ) // Imposta la dimensione del testo del titolo a 50
            titleTextView.setTextColor(Color.BLACK) // Imposta il colore del testo del titolo a nero

            dialogBuilder.setCustomTitle(titleTextView)

            val messageTextView = TextView(context)
            messageTextView.text =
                "$string : $formattedResultsString" // Aggiorna il messaggio con i risultati formattati
            messageTextView.gravity = Gravity.CENTER // Centra il messaggio
            messageTextView.setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                30f
            ) // Imposta la dimensione del testo del messaggio a 20

            dialogBuilder.setView(messageTextView)
            dialogBuilder.setPositiveButton("OK", null)
            dialogBuilder.show()
        }
    }

    fun showRollResultWithModificatore(results: List<Int>, string: String, int: Int) {
        val sum = results.sum()
        val modificatore = int
        val sumModificatore = sum + modificatore
        val formattedResults =
            results.map { "[$it]" } // Aggiunge le parentesi quadre ai singoli lanci
        val formattedResultsString =
            formattedResults.joinToString("+") // Unisce i lanci separati da "+"

        val dialogBuilder = context?.let { AlertDialog.Builder(it) }
        if (dialogBuilder != null) {
            val titleTextView = TextView(context)
            titleTextView.text = "$sumModificatore"
            titleTextView.gravity = Gravity.CENTER // Centra il titolo
            titleTextView.setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                80f
            ) // Imposta la dimensione del testo del titolo a 50
            titleTextView.setTextColor(Color.BLACK) // Imposta il colore del testo del titolo a nero

            dialogBuilder.setCustomTitle(titleTextView)

            val messageTextView = TextView(context)
            messageTextView.text =
                "$string : $formattedResultsString\n Modificatore : $modificatore" // Aggiorna il messaggio con i risultati formattati
            messageTextView.gravity = Gravity.CENTER // Centra il messaggio
            messageTextView.setTextSize(
                TypedValue.COMPLEX_UNIT_SP,
                30f
            ) // Imposta la dimensione del testo del messaggio a 20

            dialogBuilder.setView(messageTextView)
            dialogBuilder.setPositiveButton("OK", null)
            dialogBuilder.show()
        }
    }
}