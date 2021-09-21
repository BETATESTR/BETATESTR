package com.musicplayer.app.modules.albums.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowAlbums1Binding
import com.musicplayer.app.modules.albums.`data`.model.Albums1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Albums1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowAlbums1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Albums1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAlbums1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_albums1,parent,false)
    return RowAlbums1VH(view)
  }

  public override fun onBindViewHolder(holder: RowAlbums1VH, position: Int): Unit {
    val albums1RowModel = Albums1RowModel()
    // TODO uncomment following line after integration with data source
    // val albums1RowModel = list[position]
    holder.binding.albums1RowModel = albums1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Albums1RowModel
    ): Unit {
    }
  }

  public inner class RowAlbums1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowAlbums1Binding = RowAlbums1Binding.bind(itemView)
  }
}
