package com.musicplayer.app.modules.setting.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Setting1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txt4Db: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt60Hz: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_hz)

)
