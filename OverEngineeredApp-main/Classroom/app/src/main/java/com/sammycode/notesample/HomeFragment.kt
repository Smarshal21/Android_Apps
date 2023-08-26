package com.sammycode.notesample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.sammycode.notesample.databinding.FragmentHomeBinding
import com.sammycode.notesample.databinding.FragmentMainBinding
import com.sammycode.notesample.ui.note.NoteAdapter

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.hometonotes.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mainFragment)
        }
        binding.videotoroom.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_videoConferenceFragment)
        }
    }
}