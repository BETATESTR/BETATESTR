package com.musicplayer.app.modules.album.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowAlbum1Binding
import com.musicplayer.app.modules.album.`data`.model.Album1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Album1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAlbum1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Album1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAlbum1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_album1,parent,false)
    return RowAlbum1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAlbum1VH, position: Int): Unit {
    val album1RowModel = Album1RowModel()
    // TODO uncomment following line after integration with data source
    // val album1RowModel = list[position]
    holder.binding.album1RowModel = album1RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Album1RowModel
    ): Unit {
    }
  }

  public inner class RowAlbum1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAlbum1Binding = RowAlbum1Binding.bind(itemView)
  }
}
