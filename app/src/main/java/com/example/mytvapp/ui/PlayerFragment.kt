package com.example.mytvapp.ui

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.PowerManager
import android.os.PowerManager.WakeLock
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mytvapp.R
import com.google.android.exoplayer2.C
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.audio.AudioAttributes
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory
import com.google.android.exoplayer2.ui.StyledPlayerView
import com.google.android.exoplayer2.util.MimeTypes


@Suppress("DEPRECATION")
class PlayerFragment : Fragment() {

    var playerView: StyledPlayerView? = null

    private var player: SimpleExoPlayer? = null





    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_player, container, false)
    }


    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as AppCompatActivity).supportActionBar?.hide()


        val bundle = arguments ?: Bundle()
        val mediaUrl = bundle.getString("link")



        playerView = view.findViewById(R.id.player)
        setUpPlayer()
        if (mediaUrl != null) {
            addMediaItem(mediaUrl)
        }



        playerView?.setKeepScreenOn(true)





    }

    private fun addMediaItem(mediaUrl: String) {

        //Creating a media item of HLS Type
        val mediaItem = MediaItem.Builder()
            .setUri(mediaUrl)
            .setMimeType(MimeTypes.APPLICATION_M3U8)
            .build()

        player?.setMediaItem(mediaItem)

        player?.prepare()
        player?.repeatMode = Player.REPEAT_MODE_ONE //repeating the video from start after it's over
        player?.play()
    }

    private fun  setUpPlayer(){

        //initializing exoplayer
        player = SimpleExoPlayer.Builder(requireContext()).build()

        //set up audio attributes
        val audioAttributes = AudioAttributes.Builder()
            .setUsage(C.USAGE_MEDIA)
            .setContentType(C.AUDIO_CONTENT_TYPE_MOVIE)
            .setFlags(C.FLAG_AUDIBILITY_ENFORCED)
            .setAllowedCapturePolicy(C.ALLOW_CAPTURE_BY_ALL)
            .build()
        player?.setAudioAttributes(audioAttributes, false)

        playerView?.player = player

        //hiding all the ui StyledPlayerView comes with
        playerView?.setShowNextButton(false)
        playerView?.setShowPreviousButton(false)

        //setting the scaling mode to scale to fit
        player?.videoScalingMode = C.VIDEO_SCALING_MODE_SCALE_TO_FIT
    }

    companion object {
        fun newInstance(url: String) = PlayerFragment()
            .apply {
                arguments = Bundle().apply {
                    putString("url", url)
                }
            }
    }

    override fun onResume() {
        super.onResume()
        playerView?.player?.play()
    }

    override fun onPause() {
        super.onPause()
        playerView?.player?.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        playerView?.player?.stop()
        playerView?.player?.release()



    }
}