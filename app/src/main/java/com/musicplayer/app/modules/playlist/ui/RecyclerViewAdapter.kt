package com.musicplayer.app.modules.playlist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowPlaylist1Binding
import com.musicplayer.app.modules.playlist.`data`.model.Playlist1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Playlist1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowPlaylist1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Playlist1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPlaylist1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_playlist1,parent,false)
    return RowPlaylist1VH(view)
  }

  public override fun onBindViewHolder(holder: RowPlaylist1VH, position: Int): Unit {
    val playlist1RowModel = Playlist1RowModel()
    // TODO uncomment following line after integration with data source
    // val playlist1RowModel = list[position]
    holder.binding.playlist1RowModel = playlist1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Playlist1RowModel
    ): Unit {
    }
  }

  public inner class RowPlaylist1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowPlaylist1Binding = RowPlaylist1Binding.bind(itemView)
  }
}
