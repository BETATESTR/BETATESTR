package com.musicplayer.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityAppNavigationBinding
import com.musicplayer.app.modules.album.ui.AlbumActivity
import com.musicplayer.app.modules.albums.ui.AlbumsActivity
import com.musicplayer.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.musicplayer.app.modules.artist.ui.ArtistActivity
import com.musicplayer.app.modules.artists.ui.ArtistsActivity
import com.musicplayer.app.modules.favorites.ui.FavoritesActivity
import com.musicplayer.app.modules.homepage.ui.HomePageActivity
import com.musicplayer.app.modules.list.ui.ListActivity
import com.musicplayer.app.modules.login.ui.LoginActivity
import com.musicplayer.app.modules.profile.ui.ProfileActivity
import com.musicplayer.app.modules.setting.ui.SettingActivity
import com.musicplayer.app.modules.topplaylists.ui.TopPlaylistsActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun setUpClicks(): Unit {
    binding.linear5.setOnClickListener {

      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear8.setOnClickListener {

      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear12.setOnClickListener {

      val destIntent = TopPlaylistsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear4.setOnClickListener {

      val destIntent = AlbumsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear13.setOnClickListener {

      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear3.setOnClickListener {

      val destIntent = AlbumActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear11.setOnClickListener {

      val destIntent = ListActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear9.setOnClickListener {

      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear10.setOnClickListener {

      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear6.setOnClickListener {

      val destIntent = ArtistActivity.getIntent(this, null)
      startActivity(destIntent)

    }
    binding.linear7.setOnClickListener {

      val destIntent = ArtistsActivity.getIntent(this, null)
      startActivity(destIntent)

    }
  }

  public override fun onInitialized(): Unit {
    binding.appNavigationVM = viewModel
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
