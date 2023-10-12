package com.pillpal.app.modules.calendardateempty.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pillpal.app.R
import com.pillpal.app.databinding.RowListtwentyBinding
import com.pillpal.app.modules.calendardateempty.`data`.model.ListtwentyRowModel
import kotlin.Int
import kotlin.collections.List

class ListtwentyAdapter(
  var list: List<ListtwentyRowModel>
) : RecyclerView.Adapter<ListtwentyAdapter.RowListtwentyVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtwentyVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtwenty,parent,false)
    return RowListtwentyVH(view)
  }

  override fun onBindViewHolder(holder: RowListtwentyVH, position: Int) {
    val listtwentyRowModel = ListtwentyRowModel()
    // TODO uncomment following line after integration with data source
    // val listtwentyRowModel = list[position]
    holder.binding.listtwentyRowModel = listtwentyRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtwentyRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListtwentyRowModel
    ) {
    }
  }

  inner class RowListtwentyVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtwentyBinding = RowListtwentyBinding.bind(itemView)
  }
}
