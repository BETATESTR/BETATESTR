package com.musicplayer.app.modules.album.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.album.`data`.model.Album1RowModel
import com.musicplayer.app.modules.album.`data`.model.AlbumModel
import kotlin.collections.MutableList

public class AlbumVM : ViewModel() {
  public val albumModel: MutableLiveData<AlbumModel> = MutableLiveData(AlbumModel())

  public val recyclerViewList: MutableLiveData<MutableList<Album1RowModel>> =
      MutableLiveData(mutableListOf())
}
