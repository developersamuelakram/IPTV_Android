package com.example.mytvapp.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mytvapp.R
import com.example.mytvapp.modal.Channel

class ChannelViewModel : ViewModel() {


    val channelList = MutableLiveData<List<Channel>>()


    init {
        channelList()
    }


    fun channelList(): LiveData<List<Channel>> {


        val channels = listOf(
            Channel(
                "CNN", R.drawable.cnn,
                "https://cnn-cnninternational-1-eu.rakuten.wurl.tv/playlist.m3u8"

            ),
            Channel(
                "CBS", R.drawable.cbs,
                ""
            ),
            Channel(
                "PBS", R.drawable.pbs,
                ""
            ),
            Channel(
                "KBS",
                R.drawable.kbs,
                ""
            ),
            Channel(
                "NHK Japan",
                R.drawable.nhk,
                ""
            ),
            Channel(
                "DW",
                R.drawable.dw,
                ""
            ),


            Channel(
                "TNT SPORTS", R.drawable.tntsports,
                ""
            ),


            Channel(
                "SKY CRICKET", R.drawable.skycricket,
                ""
            ),


            Channel(
                "CNA", R.drawable.cna,
                ""
            ),

            Channel(
                "NASA", R.drawable.nasa, "" +
                        ""
            ),

            Channel(
                "Al Jazeera",
                R.drawable.aljazeera,
                ""
            ),

            Channel(
                "CGTN",
                R.drawable.cgnt,
                ""
            ),

            // BACKUP CGTTN  https://livedoc.cgtn.com/500d/prog_index.m3u8


            Channel(
                "BEIN SPORTS", R.drawable.beinsports,
                ""
            ),

            Channel(
                "LIVE NOW",
                R.drawable.foxliveow,
                ""
            ),




            Channel(
                "TEN SPORTS",
                R.drawable.ten,
                ""
            ),

            Channel(
                "Sky Mix", R.drawable.skycricket,
                ""
            ),

            Channel(
                "Sony 1", R.drawable.sonytenone,
                ""
            ),

            Channel(
                "Sony 5", R.drawable.sonytenfive,
                ""
            ),

            Channel("SONY TV", R.drawable.sony, ""),



            Channel(
                "INVESTIGATION", R.drawable.discoveryinvestigation,
                ""
            ),


            Channel("DISCOVERY", R.drawable.discovery, ""
                ),



            //



            Channel(
                "NAT GEO",
                R.drawable.nationalgeo,
                ""
            ),

            Channel(
                "NAT WILD",
                R.drawable.natgeowild,
                ""
            ),

            // discovery scienece


            Channel(
                "HISTORY",
                R.drawable.history,
                ""
            ),


            Channel(
                "RT",
                R.drawable.rt_do,
                ""
            ),

            Channel(
                "BBC FOUR", R.drawable.bbcfour,
                "https://timeline-samsung-uk.amagi.tv/playlist720-p.m3u8"
            ),


            Channel(
                "CBN", R.drawable.cbn,
                " "
            ),


            Channel(
                "REAL STORIES", R.drawable.realstories,
                ""
            ),


            Channel(
                "ABC", R.drawable.abc,
                ""
            ),

            Channel("TLC", R.drawable.tlc, "")
        )




        channelList.value = channels


        return channelList


    }


}
