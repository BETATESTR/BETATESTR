package com.musicplayer.app.modules.list.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class List1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt1: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBurning: String? = MyApp.getInstance().resources.getString(R.string.lbl_burning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPodvalCaplella: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podval_caplella)

)
