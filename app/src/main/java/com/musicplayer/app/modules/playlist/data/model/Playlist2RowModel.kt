package com.musicplayer.app.modules.playlist.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Playlist2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEntangled: String? = MyApp.getInstance().resources.getString(R.string.lbl_entangled)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLorn: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorn)

)
