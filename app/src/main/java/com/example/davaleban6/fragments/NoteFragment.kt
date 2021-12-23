package com.example.davaleban6.fragments

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.davaleban6.R

class NoteFragment : Fragment(R.layout.fragment_note) {
    private lateinit var editTextNote: EditText
    private lateinit var buttonAdd: Button
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val sharedPreferences = requireActivity().getSharedPreferences("pref", MODE_PRIVATE)
        val text = sharedPreferences.getString("jigari", "jumali")
        init()
        textView.text = text
        buttonAdd.setOnClickListener(){
            var note = editTextNote.text.toString()
            var text = textView.text.toString()
            var result = note + "\n" + text
            textView.text = result
            sharedPreferences.edit().putString("jigari", result).apply()
        }
    }

    private fun init(){
        editTextNote = requireView().findViewById(R.id.editTextNote)
        buttonAdd = requireView().findViewById(R.id.buttonAdd)
        textView = requireView().findViewById(R.id.textView)

    }


}