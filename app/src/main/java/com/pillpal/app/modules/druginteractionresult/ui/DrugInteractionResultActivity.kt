package com.pillpal.app.modules.druginteractionresult.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityDrugInteractionResultBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.druginteractionresult.`data`.viewmodel.DrugInteractionResultVM
import kotlin.String
import kotlin.Unit

class DrugInteractionResultActivity :
    BaseActivity<ActivityDrugInteractionResultBinding>(R.layout.activity_drug_interaction_result) {
  private val viewModel: DrugInteractionResultVM by viewModels<DrugInteractionResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugInteractionResultVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DRUG_INTERACTION_RESULT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrugInteractionResultActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
