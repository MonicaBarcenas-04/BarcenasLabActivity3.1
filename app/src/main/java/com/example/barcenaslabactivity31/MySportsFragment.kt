package com.example.barcenaslabactivity31

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.barcenaslabactivity31.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private var _binding: FragmentMySportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMySportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sportsList = listOf(
            SportItem(getString(R.string.sport_soccer), R.id.action_nav_mysports_to_soccerFragment),
            SportItem(getString(R.string.sport_basketball), R.id.action_nav_mysports_to_basketballFragment),
            SportItem(getString(R.string.sport_tennis), R.id.action_nav_mysports_to_tennisFragment),
            SportItem(getString(R.string.sport_cricket), R.id.action_nav_mysports_to_cricketFragment)
        )

        binding.recyclerViewSports.adapter = SportsAdapter(sportsList)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
