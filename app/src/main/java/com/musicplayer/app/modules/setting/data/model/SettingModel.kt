package com.musicplayer.app.modules.setting.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtEqualizer: String? = MyApp.getInstance().resources.getString(R.string.lbl_equalizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMySettings: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDefault: String? = MyApp.getInstance().resources.getString(R.string.lbl_default)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClubMusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_club_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtClassicalMusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_classical_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDanceMusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_dance_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLowFrequencyG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_low_frequency_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLowFrequencyG1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_low_frequency_g)

)
