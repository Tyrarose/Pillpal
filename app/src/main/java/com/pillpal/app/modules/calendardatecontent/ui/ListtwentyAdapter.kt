package com.pillpal.app.modules.calendardatecontent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pillpal.app.R
import com.pillpal.app.databinding.RowListtwenty1Binding
import com.pillpal.app.modules.calendardatecontent.`data`.model.Listtwenty1RowModel
import kotlin.Int
import kotlin.collections.List

class ListtwentyAdapter(
  var list: List<Listtwenty1RowModel>
) : RecyclerView.Adapter<ListtwentyAdapter.RowListtwenty1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtwenty1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtwenty1,parent,false)
    return RowListtwenty1VH(view)
  }

  override fun onBindViewHolder(holder: RowListtwenty1VH, position: Int) {
    val listtwenty1RowModel = Listtwenty1RowModel()
    // TODO uncomment following line after integration with data source
    // val listtwenty1RowModel = list[position]
    holder.binding.listtwenty1RowModel = listtwenty1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listtwenty1RowModel>) {
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
      item: Listtwenty1RowModel
    ) {
    }
  }

  inner class RowListtwenty1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtwenty1Binding = RowListtwenty1Binding.bind(itemView)
  }
}
