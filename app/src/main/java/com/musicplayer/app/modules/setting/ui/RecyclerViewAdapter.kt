package com.musicplayer.app.modules.setting.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.musicplayer.app.R
import com.musicplayer.app.databinding.RowSetting1Binding
import com.musicplayer.app.modules.setting.`data`.model.Setting1RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerViewAdapter(
  public var list: List<Setting1RowModel>
) : RecyclerView.Adapter<RecyclerViewAdapter.RowSetting1VH>() {
  private var clickListener: OnItemClickListener? = null

  public fun updateData(newData: List<Setting1RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSetting1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_setting1,parent,false)
    return RowSetting1VH(view)
  }

  public override fun onBindViewHolder(holder: RowSetting1VH, position: Int): Unit {
    val setting1RowModel = Setting1RowModel()
    // TODO uncomment following line after integration with data source
    // val setting1RowModel = list[position]
    holder.binding.setting1RowModel = setting1RowModel
  }

  public override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // list.size

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Setting1RowModel
    ): Unit {
    }
  }

  public inner class RowSetting1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowSetting1Binding = RowSetting1Binding.bind(itemView)
  }
}
