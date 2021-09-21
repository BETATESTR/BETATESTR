package com.musicplayer.app.modules.appnavigation.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt17Album: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt16Albums: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt15Login: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt14Artist: String? = MyApp.getInstance().resources.getString(R.string.lbl_14_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt13Artists: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_13_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt12Profile: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_12_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt11Favorites: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_11_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt10Setting: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_10_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt8List: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt7TopPlaylis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_7_top_playlis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt1HomePage: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_1_home_page)

)
