package com.musicplayer.app.modules.topplaylists.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.topplaylists.`data`.model.TopPlaylists1RowModel
import com.musicplayer.app.modules.topplaylists.`data`.model.TopPlaylistsModel
import kotlin.collections.MutableList

public class TopPlaylistsVM : ViewModel() {
  public val topPlaylistsModel: MutableLiveData<TopPlaylistsModel> =
      MutableLiveData(TopPlaylistsModel())

  public val recyclerViewList: MutableLiveData<MutableList<TopPlaylists1RowModel>> =
      MutableLiveData(mutableListOf())
}
