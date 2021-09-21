package com.musicplayer.app.modules.list.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowList1Binding
import com.musicplayer.app.modules.list.`data`.model.List1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<List1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowList1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<List1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowList1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_list1,parent,false)
    return RowList1VH(view)
  }

  public override fun onBindViewHolder(holder: RowList1VH, position: Int): Unit {
    val list1RowModel = List1RowModel()
    // TODO uncomment following line after integration with data source
    // val list1RowModel = list[position]
    holder.binding.list1RowModel = list1RowModel
  }

  public override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: List1RowModel
    ): Unit {
    }
  }

  public inner class RowList1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowList1Binding = RowList1Binding.bind(itemView)
  }
}
