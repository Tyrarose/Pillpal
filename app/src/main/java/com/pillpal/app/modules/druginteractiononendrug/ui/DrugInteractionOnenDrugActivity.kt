package com.pillpal.app.modules.druginteractiononendrug.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityDrugInteractionOnenDrugBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.druginteractiononendrug.`data`.viewmodel.DrugInteractionOnenDrugVM
import com.pillpal.app.modules.druginteractiontwodrugs.ui.DrugInteractionTwoDrugsActivity
import kotlin.String
import kotlin.Unit

class DrugInteractionOnenDrugActivity :
    BaseActivity<ActivityDrugInteractionOnenDrugBinding>(R.layout.activity_drug_interaction_onen_drug)
    {
  private val viewModel: DrugInteractionOnenDrugVM by viewModels<DrugInteractionOnenDrugVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugInteractionOnenDrugVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnLoadExample.setOnClickListener {
      val destIntent = DrugInteractionTwoDrugsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnClear.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageMinusCircle.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DRUG_INTERACTION_ONEN_DRUG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrugInteractionOnenDrugActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
