package com.musicplayer.app.modules.albums.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.albums.`data`.model.Albums1RowModel
import com.musicplayer.app.modules.albums.`data`.model.AlbumsModel
import kotlin.collections.MutableList

public class AlbumsVM : ViewModel() {
  public val albumsModel: MutableLiveData<AlbumsModel> = MutableLiveData(AlbumsModel())

  public val recyclerViewList: MutableLiveData<MutableList<Albums1RowModel>> =
      MutableLiveData(mutableListOf())
}
