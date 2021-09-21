package com.musicplayer.app.modules.favorites.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Favorites1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtist: String? = MyApp.getInstance().resources.getString(R.string.lbl_artist)

)
