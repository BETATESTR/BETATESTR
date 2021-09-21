package com.musicplayer.app.modules.playlist.ui

import android.view.View
import androidx.core.view.GravityCompat
import androidx.fragment.app.viewModels
import com.musicplayer.app.R
import com.musicplayer.app.appcomponents.base.BaseBottomsheetDialogFragment
import com.musicplayer.app.databinding.BottomsheetPlaylistBinding
import com.musicplayer.app.modules.playlist.`data`.model.Playlist1RowModel
import com.musicplayer.app.modules.playlist.`data`.model.Playlist2RowModel
import com.musicplayer.app.modules.playlist.`data`.viewmodel.PlaylistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class PlaylistBottomsheet :
    BaseBottomsheetDialogFragment<BottomsheetPlaylistBinding>(R.layout.bottomsheet_playlist) {
  private val viewModel: PlaylistVM by viewModels<PlaylistVM>()

  public override fun setUpClicks(): Unit {
  }

  private fun toggleDrawer(): Unit {
    if (!binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
                binding.drawerLayout.openDrawer(GravityCompat.START)
            }
            else {
                binding.drawerLayout.closeDrawer(GravityCompat.START)
            }
  }

  public fun onClickRecyclerView(
    view: View,
    position: Int,
    item: Playlist1RowModel
  ): Unit {
    when(view.id) {


    }
  }

  public fun onClickRecyclerView1(
    view: View,
    position: Int,
    item: Playlist2RowModel
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
                override fun onItemClick(view:View, position:Int, item : Playlist1RowModel) {
                    onClickRecyclerView(view, position, item)
                }
            }
            )
    viewModel.recyclerViewList.observe(requireActivity()) {
                recyclerViewAdapter.updateData(it)
            }
    val recyclerView1Adapter =
                    RecyclerView1Adapter(viewModel.recyclerView1List.value?:mutableListOf())
    binding.recyclerView1.adapter = recyclerView1Adapter
    recyclerView1Adapter.setOnItemClickListener(
            object : RecyclerView1Adapter.OnItemClickListener {
                override fun onItemClick(view:View, position:Int, item : Playlist2RowModel) {
                    onClickRecyclerView1(view, position, item)
                }
            }
            )
    viewModel.recyclerView1List.observe(requireActivity()) {
                recyclerView1Adapter.updateData(it)
            }
    binding.playlistVM = viewModel
  }

  public companion object {
    public const val TAG: String = "PLAYLIST_BOTTOMSHEET"
  }
}
