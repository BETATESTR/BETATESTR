package com.musicplayer.app.modules.profile.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.profile.`data`.model.ProfileModel

public class ProfileVM : ViewModel() {
  public val profileModel: MutableLiveData<ProfileModel> = MutableLiveData(ProfileModel())
}
