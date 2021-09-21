package com.musicplayer.app.modules.albums.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityAlbumsBinding
import com.musicplayer.app.modules.albums.`data`.model.Albums1RowModel
import com.musicplayer.app.modules.albums.`data`.viewmodel.AlbumsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AlbumsActivity : BaseActivity<ActivityAlbumsBinding>(R.layout.activity_albums) {
  private val viewModel: AlbumsVM by viewModels<AlbumsVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Albums1RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Albums1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.albumsVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ALBUMS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AlbumsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
