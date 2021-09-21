package com.musicplayer.app.modules.homepage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowHomePage1Binding
import com.musicplayer.app.modules.homepage.`data`.model.HomePage1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<HomePage1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowHomePage1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<HomePage1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHomePage1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_home_page1,parent,false)
    return RowHomePage1VH(view)
  }

  public override fun onBindViewHolder(holder: RowHomePage1VH, position: Int): Unit {
    val homePage1RowModel = HomePage1RowModel()
    // TODO uncomment following line after integration with data source
    // val homePage1RowModel = list[position]
    holder.binding.homePage1RowModel = homePage1RowModel
  }

  public override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: HomePage1RowModel
    ): Unit {
    }
  }

  public inner class RowHomePage1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowHomePage1Binding = RowHomePage1Binding.bind(itemView)
  }
}
