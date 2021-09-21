package com.musicplayer.app.modules.artists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowArtists1Binding
import com.musicplayer.app.modules.artists.`data`.model.Artists1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Artists1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowArtists1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Artists1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowArtists1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_artists1,parent,false)
    return RowArtists1VH(view)
  }

  public override fun onBindViewHolder(holder: RowArtists1VH, position: Int): Unit {
    val artists1RowModel = Artists1RowModel()
    // TODO uncomment following line after integration with data source
    // val artists1RowModel = list[position]
    holder.binding.artists1RowModel = artists1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Artists1RowModel
    ): Unit {
    }
  }

  public inner class RowArtists1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowArtists1Binding = RowArtists1Binding.bind(itemView)
  }
}
