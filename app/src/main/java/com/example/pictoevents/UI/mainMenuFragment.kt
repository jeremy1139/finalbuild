package com.example.pictoevents.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.pictoevents.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [mainMenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class mainMenuFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.activity_main_add_button).setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_fragment_add_option)
        }
        view.findViewById<Button>(R.id.activity_main_calendar_button).setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_calendarFragment2)
        }
        view.findViewById<Button>(R.id.activity_main_files_button).setOnClickListener {
            findNavController().navigate(R.id.action_mainMenuFragment_to_filesFragment2)
        }
    }
}