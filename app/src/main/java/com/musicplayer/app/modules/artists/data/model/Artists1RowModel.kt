package com.musicplayer.app.modules.artists.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Artists1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtLorn: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorn)
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
  public var txt23Albums: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_albums)

)
