package com.pillpal.app.modules.welcomethree.ui

import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityWelcomethreeBinding
import com.pillpal.app.modules.welcomethree.`data`.viewmodel.WelcomethreeVM
import kotlin.String
import kotlin.Unit

class WelcomethreeActivity :
    BaseActivity<ActivityWelcomethreeBinding>(R.layout.activity_welcomethree) {
  private val viewModel: WelcomethreeVM by viewModels<WelcomethreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcomethreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOMETHREE_ACTIVITY"

  }
}
