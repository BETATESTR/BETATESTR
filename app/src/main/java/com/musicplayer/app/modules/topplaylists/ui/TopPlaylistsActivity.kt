package com.musicplayer.app.modules.topplaylists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityTopPlaylistsBinding
import com.musicplayer.app.modules.topplaylists.`data`.model.TopPlaylists1RowModel
import com.musicplayer.app.modules.topplaylists.`data`.viewmodel.TopPlaylistsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class TopPlaylistsActivity :
    BaseActivity<ActivityTopPlaylistsBinding>(R.layout.activity_top_playlists) {
  private val viewModel: TopPlaylistsVM by viewModels<TopPlaylistsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: TopPlaylists1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public override fun onInitialized(): Unit {
    val recyclerViewAdapter =
                        RecyclerViewAdapter(viewModel.recyclerViewList.value?:mutableListOf())
    binding.recyclerView.adapter = recyclerViewAdapter
    recyclerViewAdapter.setOnItemClickListener(
                object : RecyclerViewAdapter.OnItemClickListener {
                    override fun onItemClick(view:View, position:Int, item : TopPlaylists1RowModel)
        {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.topPlaylistsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "TOP_PLAYLISTS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopPlaylistsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
