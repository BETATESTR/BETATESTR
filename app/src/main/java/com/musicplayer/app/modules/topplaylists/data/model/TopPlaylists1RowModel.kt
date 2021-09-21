package com.musicplayer.app.modules.topplaylists.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class TopPlaylists1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRenaissance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt843Tracks: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_843_tracks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt23Hours: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_hours)

)
