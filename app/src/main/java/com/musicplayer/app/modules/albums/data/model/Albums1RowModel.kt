package com.musicplayer.app.modules.albums.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class Albums1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlowerPower: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_flower_power)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRayCharles: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ray_charles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2018: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)

)
