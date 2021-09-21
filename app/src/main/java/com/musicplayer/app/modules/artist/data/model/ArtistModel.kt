package com.musicplayer.app.modules.artist.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class ArtistModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRenaissance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRenaissance1: String? =
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
  public var txt23Albums: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNewReleases: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_new_releases)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
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

)
