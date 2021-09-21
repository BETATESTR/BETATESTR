package com.musicplayer.app.modules.homepage.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.homepage.`data`.model.HomePage1RowModel
import com.musicplayer.app.modules.homepage.`data`.model.HomePageModel
import kotlin.collections.MutableList

public class HomePageVM : ViewModel() {
  public val homePageModel: MutableLiveData<HomePageModel> = MutableLiveData(HomePageModel())

  public val recyclerViewList: MutableLiveData<MutableList<HomePage1RowModel>> =
      MutableLiveData(mutableListOf())
}
