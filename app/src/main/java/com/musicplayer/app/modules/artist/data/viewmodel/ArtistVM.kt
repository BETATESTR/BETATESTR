package com.musicplayer.app.modules.artist.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.artist.`data`.model.ArtistModel

public class ArtistVM : ViewModel() {
  public val artistModel: MutableLiveData<ArtistModel> = MutableLiveData(ArtistModel())
}
