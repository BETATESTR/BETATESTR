package com.musicplayer.app.modules.playlist.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class PlaylistModel(
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFlashbacks: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_flashbacks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEmika: String? = MyApp.getInstance().resources.getString(R.string.lbl_emika)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRenaissance: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPodvalCaplella1: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podval_caplella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNow: String? = MyApp.getInstance().resources.getString(R.string.lbl_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSurtr: String? = MyApp.getInstance().resources.getString(R.string.lbl_surtr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDavidGarciaDi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_david_garcia_di)

)
