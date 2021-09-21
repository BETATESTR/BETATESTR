package com.musicplayer.app.modules.album.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseActivity
import com.musicplayer.app.databinding.ActivityAlbumBinding
import com.musicplayer.app.modules.album.`data`.model.Album1RowModel
import com.musicplayer.app.modules.album.`data`.viewmodel.AlbumVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class AlbumActivity : BaseActivity<ActivityAlbumBinding>(R.layout.activity_album) {
  private val viewModel: AlbumVM by viewModels<AlbumVM>()

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Album1RowModel
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
                    override fun onItemClick(view:View, position:Int, item : Album1RowModel) {
                        onClickRecyclerView(view, position, item)
                    }
                }
                )
    viewModel.recyclerViewList.observe(this) {
                    recyclerViewAdapter.updateData(it)
                }
    binding.albumVM = viewModel
  }

  public companion object {
    public const val TAG: String = "ALBUM_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AlbumActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
