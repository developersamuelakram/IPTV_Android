package com.example.mytvapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mytvapp.R
import com.example.mytvapp.modal.Channel

class ChannelAdapter : RecyclerView.Adapter<ChannelHolder>() {

    private var channelList = listOf<Channel>()
    private var onClickedInterface: onChannelClicked? = null
    private var selectedPosition = RecyclerView.NO_POSITION // Added for focus handling

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChannelHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.channelliststyle, parent, false)
        return ChannelHolder(view)
    }

    override fun getItemCount(): Int {
        return channelList.size
    }

    fun setList(channelList: List<Channel>) {
        this.channelList = channelList
    }

    override fun onBindViewHolder(holder: ChannelHolder, position: Int) {
        val channel = channelList[position]

        holder.channelImage.setImageResource(channel.channelIcon)
        holder.channelName.text = channel.channelName

        val isSelected = position == selectedPosition
        if (isSelected) {
            holder.itemView.setBackgroundResource(R.drawable.bg_selector)
        } else {
            holder.itemView.setBackgroundResource(0) // Clear background
        }

        holder.itemView.setOnClickListener {
            selectedPosition = position
            notifyDataSetChanged()
            onClickedInterface?.clickedOnChannel(channel, position, channelList)
        }
    }

    fun setListener(clickOnChannelClicked: onChannelClicked) {
        this.onClickedInterface = clickOnChannelClicked
    }



    fun restoreFocus(position: Int) {
        val previousPosition = selectedPosition
        selectedPosition = position
        notifyItemChanged(previousPosition)
        notifyItemChanged(selectedPosition)
        }



}

class ChannelHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnFocusChangeListener {
    val channelName: TextView = itemView.findViewById(R.id.channelName)
    val channelImage: ImageView = itemView.findViewById(R.id.channelImage)

    init {
        itemView.onFocusChangeListener = this
    }

    override fun onFocusChange(view: View?, hasFocus: Boolean) {
        if (hasFocus) {
            itemView.setBackgroundResource(R.drawable.bg_selector)
        } else {
            itemView.setBackgroundResource(0) // Clear background
        }
    }


}

interface onChannelClicked {
    fun clickedOnChannel(channel: Channel, position: Int, channelList: List<Channel>)
}

