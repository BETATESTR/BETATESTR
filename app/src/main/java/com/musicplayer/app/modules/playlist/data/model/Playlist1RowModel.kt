package com.musicplayer.app.modules.playlist.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Playlist1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtIvarSRevenge: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ivar_s_revenge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDanheim: String? = MyApp.getInstance().resources.getString(R.string.lbl_danheim)

)
