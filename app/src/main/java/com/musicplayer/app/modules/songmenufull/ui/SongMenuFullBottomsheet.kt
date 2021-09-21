package com.musicplayer.app.modules.songmenufull.ui

import androidx.fragment.app.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.musicplayer.app.databinding.BottomsheetSongMenuFullBinding
import com.musicplayer.app.modules.songmenufull.`data`.viewmodel.SongMenuFullVM
import kotlin.String
import kotlin.Unit

public class SongMenuFullBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetSongMenuFullBinding>(R.layout.bottomsheet_song_menu_full)
    {
  private val viewModel: SongMenuFullVM by viewModels<SongMenuFullVM>()

  public override fun setUpClicks(): Unit {
  }

  public override fun onInitialized(): Unit {
    binding.songMenuFullVM = viewModel
  }

  public companion object {
    public const val TAG: String = "SONG_MENU_FULL_BOTTOMSHEET"
  }
}
