package com.musicplayer.app.modules.profile.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtErlikBachman: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_erlik_bachman)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBachmanMailCo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_bachman_mail_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtMySubscription: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_my_subscription)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtValidUntilMay: String? =
      MyApp.getInstance().resources.getString(R.string.msg_valid_until_may)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtRestorePurchas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restore_purchas)
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
