package com.example.mytvapp.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mytvapp.R
import com.example.mytvapp.adapter.ChannelAdapter
import com.example.mytvapp.adapter.onChannelClicked
import com.example.mytvapp.databinding.FragmentHomieBinding
import com.example.mytvapp.modal.Channel
import com.example.mytvapp.mvvm.ChannelViewModel


class HomeFragment : Fragment(), onChannelClicked {



    private lateinit var viewModel : ChannelViewModel
    private lateinit var adapter : ChannelAdapter
    private lateinit var binding: FragmentHomieBinding
    private var selectedChannelPosition = RecyclerView.NO_POSITION // Initialize with NO_POSITION

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_homie, container, false)

        return binding.root    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(ChannelViewModel::class.java)



        adapter = ChannelAdapter()

        viewModel.channelList().observe(viewLifecycleOwner, Observer {


            adapter.setList(it)

            Log.e("TVAPP", it.toString())
            binding.rvChannel.adapter = adapter



        })

        adapter.setListener(this)








    }

    override fun clickedOnChannel(channel: Channel, position: Int, channelist: List<Channel>) {

        val channelLink = channel.channelLink
        val bundle = Bundle()
        bundle.putString("link", channelLink)

        selectedChannelPosition = position
        view?.findNavController()?.navigate(R.id.action_homie_to_playerFragment2, bundle)




    }


    override fun onResume() {
        super.onResume()

        adapter.restoreFocus(selectedChannelPosition)

        binding.rvChannel?.post {
            // Request focus on the selected item
            binding.rvChannel?.layoutManager?.findViewByPosition(selectedChannelPosition)?.requestFocus()
        }


    }

}