package com.musicplayer.app.modules.artist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityArtistBinding
import com.musicplayer.app.modules.artist.`data`.viewmodel.ArtistVM
import kotlin.String
import kotlin.Unit

public class ArtistActivity : BaseActivity<ActivityArtistBinding>(R.layout.activity_artist) {
  private val viewModel: ArtistVM by viewModels<ArtistVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.artistVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ARTIST_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArtistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
