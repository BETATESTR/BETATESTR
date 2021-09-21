package com.musicplayer.app.modules.songmenufull.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.songmenufull.`data`.model.SongMenuFullModel

public class SongMenuFullVM : ViewModel() {
  public val songMenuFullModel: MutableLiveData<SongMenuFullModel> =
      MutableLiveData(SongMenuFullModel())
}
