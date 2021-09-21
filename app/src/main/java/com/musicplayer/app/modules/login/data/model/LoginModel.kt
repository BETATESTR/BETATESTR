package com.musicplayer.app.modules.login.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtForgotYourLog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_log)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCreateAccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  public var etPasswordValue: String? = null
)
