package com.musicplayer.app.modules.list.`data`.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.musicplayer.app.modules.list.`data`.model.List1RowModel
import com.musicplayer.app.modules.list.`data`.model.ListModel
import kotlin.collections.MutableList

public class ListVM : ViewModel() {
  public val listModel: MutableLiveData<ListModel> = MutableLiveData(ListModel())

  public val recyclerViewList: MutableLiveData<MutableList<List1RowModel>> =
      MutableLiveData(mutableListOf())
}
