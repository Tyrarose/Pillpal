package com.pillpal.app.modules.calendardatecontent.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pillpal.app.R
import com.pillpal.app.databinding.RowListweightBinding
import com.pillpal.app.modules.calendardatecontent.`data`.model.ListweightRowModel
import kotlin.Int
import kotlin.collections.List

class ListweightAdapter(
  var list: List<ListweightRowModel>
) : RecyclerView.Adapter<ListweightAdapter.RowListweightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListweightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listweight,parent,false)
    return RowListweightVH(view)
  }

  override fun onBindViewHolder(holder: RowListweightVH, position: Int) {
    val listweightRowModel = ListweightRowModel()
    // TODO uncomment following line after integration with data source
    // val listweightRowModel = list[position]
    holder.binding.listweightRowModel = listweightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListweightRowModel>) {
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
      item: ListweightRowModel
    ) {
    }
  }

  inner class RowListweightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListweightBinding = RowListweightBinding.bind(itemView)
    init {
      binding.imageVolume.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListweightRowModel())
      }
    }
  }
}
