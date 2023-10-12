package com.pillpal.app.modules.welcometwo.ui

import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityWelcometwoBinding
import com.pillpal.app.modules.welcometwo.`data`.viewmodel.WelcometwoVM
import kotlin.String
import kotlin.Unit

class WelcometwoActivity : BaseActivity<ActivityWelcometwoBinding>(R.layout.activity_welcometwo) {
  private val viewModel: WelcometwoVM by viewModels<WelcometwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.welcometwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WELCOMETWO_ACTIVITY"

  }
}
