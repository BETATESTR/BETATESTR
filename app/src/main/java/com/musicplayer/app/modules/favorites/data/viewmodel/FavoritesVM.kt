package com.musicplayer.app.modules.favorites.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.favorites.`data`.model.Favorites1RowModel
import com.musicplayer.app.modules.favorites.`data`.model.FavoritesModel
import kotlin.collections.MutableList

public class FavoritesVM : ViewModel() {
  public val favoritesModel: MutableLiveData<FavoritesModel> = MutableLiveData(FavoritesModel())

  public val recyclerViewList: MutableLiveData<MutableList<Favorites1RowModel>> =
      MutableLiveData(mutableListOf())
}
