package com.musicplayer.app.modules.favorites.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class FavoritesModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtFavourites: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_favourites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDidYouLikeIt: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_did_you_like_it)
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
  public var txtTracks: String? = MyApp.getInstance().resources.getString(R.string.lbl_tracks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPlaylists: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDownload: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
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
