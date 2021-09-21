package com.musicplayer.app.modules.artists.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.artists.`data`.model.Artists1RowModel
import com.musicplayer.app.modules.artists.`data`.model.ArtistsModel
import kotlin.collections.MutableList

public class ArtistsVM : ViewModel() {
  public val artistsModel: MutableLiveData<ArtistsModel> = MutableLiveData(ArtistsModel())

  public val recyclerViewList: MutableLiveData<MutableList<Artists1RowModel>> =
      MutableLiveData(mutableListOf())
}
