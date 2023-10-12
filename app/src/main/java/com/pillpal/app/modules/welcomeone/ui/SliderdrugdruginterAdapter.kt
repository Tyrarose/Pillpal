package com.pillpal.app.modules.welcomeone.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.pillpal.app.databinding.SlideritemWelcomeone1Binding
import com.pillpal.app.modules.welcomeone.`data`.model.ImageSliderSliderdrugdruginterModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderdrugdruginterAdapter(
  val dataList: ArrayList<ImageSliderSliderdrugdruginterModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderdrugdruginterModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemWelcomeone1Binding) {
      binding.imageSliderSliderdrugdruginterModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemWelcomeone1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
