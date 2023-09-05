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
                "https://cbsn-us.cbsnstream.cbsnews.com/out/v1/55a8648e8f134e82a470f83d562deeca/master.m3u8"
            ),
            Channel(
                "PBS", R.drawable.pbs,
                "https://pbs-samsunguk.amagi.tv/playlist.m3u8"
            ),
            Channel(
                "KBS",
                R.drawable.kbs,
                "https://kbsworld-ott.akamaized.net/hls/live/2002341/kbsworld/master.m3u8"
            ),
            Channel(
                "NHK Japan",
                R.drawable.nhk,
                "https://nhkwlive-ojp.akamaized.net/hls/live/2003459/nhkwlive-ojp-en/index.m3u8"
            ),
            Channel(
                "DW",
                R.drawable.dw,
                "https://dwamdstream102.akamaized.net/hls/live/2015525/dwstream102/index.m3u8"
            ),


            Channel(
                "TNT SPORTS", R.drawable.tntsports,
                "https://buc01.quest123.top:8088/live/webcricn04/playlist.m3u8?id=114607&pk=7a6da509ed84a029aaacd1a8071ebf05592185efada4335c2e5ddb756d90453e6d6a2aec65f3d50abefbac992a0cfe06188f4d4904ac273e6c8ad1db805aa9f7"
            ),


            Channel(
                "SKY CRICKET", R.drawable.skycricket,
                "https://buc02.quest123.top:8088/live/webcrice08/playlist.m3u8?id=116153&pk=7a6da509ed84a029aaacd1a8071ebf05592185efada4335c2e5ddb756d90453e044a67f3cc58cc718f514f38986fea875ee14c9a86eb472d401688e1ea472d8b"
            ),


            Channel(
                "CNA", R.drawable.cna,
                "https://d2e1asnsl7br7b.cloudfront.net/7782e205e72f43aeb4a48ec97f66ebbe/index.m3u8"
            ),

            Channel(
                "NASA", R.drawable.nasa, "" +
                        "https://uplynkcontent.sinclairstoryline.com/channel/ddd76fdc1c0a456ba537e4f48e827d3e.m3u8"
            ),

            Channel(
                "Al Jazeera",
                R.drawable.aljazeera,
                "https://live-hls-v3-aje.getaj.net/AJE-V3/index.m3u8"
            ),

            Channel(
                "CGTN",
                R.drawable.cgnt,
                "https://news.cgtn.com/resource/live/document/cgtn-doc.m3u8"
            ),

            // BACKUP CGTTN  https://livedoc.cgtn.com/500d/prog_index.m3u8


            Channel(
                "BEIN SPORTS", R.drawable.beinsports,
                "https://awstapmadstreaming.akamaized.net/hls/live/2095955/testd8b9/level_2.m3u8"
            ),

            Channel(
                "LIVE NOW",
                R.drawable.foxliveow,
                "https://fox-foxnewsnow-samsungus.amagi.tv/playlist720p.m3u8"
            ),




            Channel(
                "TEN SPORTS",
                R.drawable.ten,
                "https://tapmadlive.akamaized.net/tapmadold/tensports.smil/chunklist_w1716823830_b748000_slEng.m3u8"
            ),

            Channel(
                "Sky Mix", R.drawable.skycricket,
                "https://buc01.quest123.top:8088/live/webcricp01/playlist.m3u8?vidictid=196014716800&id=113431&pk=7a6da509ed84a029aaacd1a8071ebf05592185efada4335c2e5ddb756d90453e501c5d095635667ca51edb0680e50221b1a9122eb6b50f63b9ce295fd7658a4f"
            ),

            Channel(
                "Sony 1", R.drawable.sonytenone,
                "https://mhdtvworld.me/delta/toffeelive/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/sony_ten1_hd_160/sony_ten1_hd_160.m3u8?bitrate=512000&channel=sony_ten1_hd_160&gp_id="
            ),

            Channel(
                "Sony 5", R.drawable.sonytenfive,
                "https://mhdtvworld.me/delta/toffeelive/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/sony_six_hd_160/sony_six_hd_160.m3u8?bitrate=512000&channel=sony_six_hd_160&gp_id="
            ),

            Channel("SONY TV", R.drawable.sony, "https://cdn-tv.co.in/toffee/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/sony_entertainment_160/sony_entertainment_160.m3u8?bitrate=512000&channel=sony_entertainment_160&gp_id="),


            //
            // discovery investigation backup https://mhdtvworld.me/delta/discovery/api/Investigation_Discovery_Hindi.m3u8

            Channel(
                "INVESTIGATION", R.drawable.discoveryinvestigation,
                "https://food-dlvr-ott.akamaized.net/primary/3/d31abde936de4fa884fbd91054dacad3/index_12_0.m3u8"
            ),


            // discovery back up  "https://mhdtvworld.me/delta/discovery/api/Discovery_Hindi.m3u8"
            // https://food-dlvr-ott.akamaized.net/primary/4/686a061683e44b518cdf57677e352ef3/index_20.m3u8
            Channel("DISCOVERY", R.drawable.discovery, "https://food-dlvr-ott.akamaized.net/primary/4/686a061683e44b518cdf57677e352ef3/index_20.m3u8"
                ),



            //



            Channel(
                "NAT GEO",
                R.drawable.nationalgeo,
                "https://cdn-tv.co.in/toffee/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/ngc_sd_160/ngc_sd_160.m3u8?bitrate=512000&channel=ngc_sd_160&gp_id="
            ),

            Channel(
                "NAT WILD",
                R.drawable.natgeowild,
                "https://cdn-tv.co.in/toffee/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/ngc_wild_160/ngc_wild_160.m3u8?bitrate=512000&channel=ngc_wild_160&gp_id="
            ),

            // discovery scienece


            Channel(
                "HISTORY",
                R.drawable.history,
                "https://cdn-tv.co.in/toffee/playlist.php?https://bldcmprod-cdn.toffeelive.com/cdn/live/slang/history_tv_160/history_tv_160.m3u8?bitrate=512000&channel=history_tv_160&gp_id="
            ),


            Channel(
                "RT",
                R.drawable.rt_do,
                "https://rt-rtd.rttv.com/live/rtdoc/playlist_4500Kb.m3u8"
            ),

            Channel(
                "BBC FOUR", R.drawable.bbcfour,
                "https://timeline-samsung-uk.amagi.tv/playlist720-p.m3u8"
            ),


            Channel(
                "CBN", R.drawable.cbn,
                " https://bcovlive-a.akamaihd.net/re8d9f611ee4a490a9bb59e52db91414d/us-east-1/734546207001/playlist.m3u8"
            ),


            Channel(
                "REAL STORIES", R.drawable.realstories,
                "https://lds-realstories-plex.amagi.tv/playlist.m3u8"
            ),


            Channel(
                "ABC", R.drawable.abc,
                "https://content.uplynk.com/channel/3324f2467c414329b3b0cc5cd987b6be.m3u8"
            ),

            Channel("TLC", R.drawable.tlc, "https://mhdtvworld.me/delta/discovery/api/TLC.m3u8")
        )




        channelList.value = channels


        return channelList


    }


}