package com.pillpal.app.modules.welcomeone.ui

import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityWelcomeoneBinding
import com.pillpal.app.modules.welcomeone.`data`.model.ImageSliderSliderdrugdruginterModel
import com.pillpal.app.modules.welcomeone.`data`.viewmodel.WelcomeoneVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class WelcomeoneActivity : BaseActivity<ActivityWelcomeoneBinding>(R.layout.activity_welcomeone) {
  private val imageSliderSliderdrugdruginterItems: ArrayList<ImageSliderSliderdrugdruginterModel> =
      arrayListOf()


  private val viewModel: WelcomeoneVM by viewModels<WelcomeoneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderdrugdruginterAdapter =
    SliderdrugdruginterAdapter(imageSliderSliderdrugdruginterItems,true)
    binding.imageSliderSliderdrugdruginter.adapter = sliderdrugdruginterAdapter
    binding.imageSliderSliderdrugdruginter.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroupThirty.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroupThirty.updateIndicatorCounts(binding.imageSliderSliderdrugdruginter.indicatorCount)
    binding.welcomeoneVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderdrugdruginter.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderdrugdruginter.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOMEONE_ACTIVITY"

  }
}
