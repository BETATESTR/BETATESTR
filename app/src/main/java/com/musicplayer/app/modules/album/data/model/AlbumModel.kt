package com.musicplayer.app.modules.album.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class AlbumModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWunderKing: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wunder_king)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWunderKing1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wunder_king)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLbl: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt2018: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUrgentSiege: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_urgent_siege)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDamnedAnthem: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_damned_anthem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTop: String? = MyApp.getInstance().resources.getString(R.string.lbl_top)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavorites: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)

)
