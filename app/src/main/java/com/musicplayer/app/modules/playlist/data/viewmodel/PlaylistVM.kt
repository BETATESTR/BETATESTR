package com.musicplayer.app.modules.playlist.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.playlist.`data`.model.Playlist1RowModel
import com.musicplayer.app.modules.playlist.`data`.model.Playlist2RowModel
import com.musicplayer.app.modules.playlist.`data`.model.PlaylistModel
import com.musicplayer.app.modules.songmenufull.`data`.model.BottomsheetSongMenuFullModel
import kotlin.collections.MutableList

public class PlaylistVM : ViewModel() {
  public val playlistModel: MutableLiveData<PlaylistModel> = MutableLiveData(PlaylistModel())

  public var includedModel: MutableLiveData<BottomsheetSongMenuFullModel> =
      MutableLiveData(BottomsheetSongMenuFullModel())

  public val recyclerViewList: MutableLiveData<MutableList<Playlist1RowModel>> =
      MutableLiveData(mutableListOf())

  public val recyclerView1List: MutableLiveData<MutableList<Playlist2RowModel>> =
      MutableLiveData(mutableListOf())
}
