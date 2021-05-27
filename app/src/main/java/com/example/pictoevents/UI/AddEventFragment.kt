package com.example.pictoevents.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController

import com.example.pictoevents.R
import com.example.pictoevents.UI.AddEvent.DialogDatePickerFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AddEventFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AddEventFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddEventFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //line 40-53 left unchanged, but should be changed to support repository
        val titleText = view.findViewById<EditText>(R.id.title)

        //val startText = view.findViewById<TextView>(R.id.start)
        val startDateText = view.findViewById<TextView>(R.id.startDateText)
        val startDate = view.findViewById<Button>(R.id.startDate)
        val startTimeText = view.findViewById<TextView>(R.id.startTimeText)
        val startTime = view.findViewById<Button>(R.id.startTime)

        //val endText = view.findViewById<TextView>(R.id.end)
        val endDateText = view.findViewById<TextView>(R.id.endDateText)
        val endDate = view.findViewById<Button>(R.id.endDate)
        val endTimeText = view.findViewById<TextView>(R.id.endTimeText)
        val endTime = view.findViewById<Button>(R.id.endTime)

        //TODO: add action to transition to fragment_confirmation
    }

    fun showDatePickerDialog(v: View) {
        var datePickerFragment: DialogDatePickerFragment = DialogDatePickerFragment()
        DialogDatePickerFragment().show(childFragmentManager, "datePicker")
    }

}
