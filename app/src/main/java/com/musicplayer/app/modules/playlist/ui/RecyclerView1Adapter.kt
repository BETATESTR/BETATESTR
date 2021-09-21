package com.musicplayer.app.modules.playlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowPlaylist2Binding
import com.musicplayer.app.modules.playlist.`data`.model.Playlist2RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerView1Adapter(
  public var list: List<Playlist2RowModel>
) : RecyclerView.Adapter<RecyclerView1Adapter.RowPlaylist2VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Playlist2RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPlaylist2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_playlist2,parent,false)
    return RowPlaylist2VH(view)
  }

  public override fun onBindViewHolder(holder: RowPlaylist2VH, position: Int): Unit {
    val playlist2RowModel = Playlist2RowModel()
    // TODO uncomment following line after integration with data source
    // val playlist2RowModel = list[position]
    holder.binding.playlist2RowModel = playlist2RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Playlist2RowModel
    ): Unit {
    }
  }

  public inner class RowPlaylist2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPlaylist2Binding = RowPlaylist2Binding.bind(itemView)
  }
}
