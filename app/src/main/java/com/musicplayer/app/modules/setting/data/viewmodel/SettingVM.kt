package com.musicplayer.app.modules.setting.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.setting.`data`.model.Setting1RowModel
import com.musicplayer.app.modules.setting.`data`.model.SettingModel
import kotlin.collections.MutableList

public class SettingVM : ViewModel() {
  public val settingModel: MutableLiveData<SettingModel> = MutableLiveData(SettingModel())

  public val recyclerViewList: MutableLiveData<MutableList<Setting1RowModel>> =
      MutableLiveData(mutableListOf())
}
