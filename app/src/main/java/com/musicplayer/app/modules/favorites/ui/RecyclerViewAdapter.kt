package com.musicplayer.app.modules.favorites.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowFavorites1Binding
import com.musicplayer.app.modules.favorites.`data`.model.Favorites1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Favorites1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowFavorites1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Favorites1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFavorites1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_favorites1,parent,false)
    return RowFavorites1VH(view)
  }

  public override fun onBindViewHolder(holder: RowFavorites1VH, position: Int): Unit {
    val favorites1RowModel = Favorites1RowModel()
    // TODO uncomment following line after integration with data source
    // val favorites1RowModel = list[position]
    holder.binding.favorites1RowModel = favorites1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Favorites1RowModel
    ): Unit {
    }
  }

  public inner class RowFavorites1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowFavorites1Binding = RowFavorites1Binding.bind(itemView)
  }
}
