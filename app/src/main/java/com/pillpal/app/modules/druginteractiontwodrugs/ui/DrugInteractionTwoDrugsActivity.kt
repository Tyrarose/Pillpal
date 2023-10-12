package com.pillpal.app.modules.druginteractiontwodrugs.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityDrugInteractionTwoDrugsBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.druginteractiononendrug.ui.DrugInteractionOnenDrugActivity
import com.pillpal.app.modules.druginteractionresult.ui.DrugInteractionResultActivity
import com.pillpal.app.modules.druginteractiontwodrugs.`data`.viewmodel.DrugInteractionTwoDrugsVM
import kotlin.String
import kotlin.Unit

class DrugInteractionTwoDrugsActivity :
    BaseActivity<ActivityDrugInteractionTwoDrugsBinding>(R.layout.activity_drug_interaction_two_drugs)
    {
  private val viewModel: DrugInteractionTwoDrugsVM by viewModels<DrugInteractionTwoDrugsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugInteractionTwoDrugsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageMinusCircle.setOnClickListener {
      val destIntent = DrugInteractionOnenDrugActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnClear.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCheckInteractions.setOnClickListener {
      val destIntent = DrugInteractionResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DRUG_INTERACTION_TWO_DRUGS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrugInteractionTwoDrugsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
