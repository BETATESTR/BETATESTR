package com.musicplayer.app.modules.songmenufull.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class SongMenuFullModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRenaissance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPodvalCaplella: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podval_caplella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt343: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAddToPlaylist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_to_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtArtist: String? = MyApp.getInstance().resources.getString(R.string.lbl_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtIDonTLikeIt: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_i_don_t_like_it)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSongLyrics: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_song_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDownload: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)

)
