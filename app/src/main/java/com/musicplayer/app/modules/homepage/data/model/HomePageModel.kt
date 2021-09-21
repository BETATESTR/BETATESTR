package com.musicplayer.app.modules.homepage.`data`.model

import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.di.MyApp
import kotlin.String

public data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtListenToMusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_listen_to_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtWithoutRestric: String? =
      MyApp.getInstance().resources.getString(R.string.msg_without_restric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTrialVersion: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_trial_version)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtFreeFor3Mont: String? =
      MyApp.getInstance().resources.getString(R.string.msg_free_for_3_mont)
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
