package com.pillpal.app.modules.druginteractionempty.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityDrugInteractionEmptyBinding
import com.pillpal.app.modules.calendardateempty.ui.CalendarDateEmptyActivity
import com.pillpal.app.modules.profiletwo.ui.ProfileTwoActivity
import com.pillpal.app.modules.druginteractiontwodrugs.ui.DrugInteractionTwoDrugsActivity
import com.pillpal.app.modules.druginteractionempty.`data`.viewmodel.DrugInteractionEmptyVM
import kotlin.String
import kotlin.Unit

class DrugInteractionEmptyActivity :
    BaseActivity<ActivityDrugInteractionEmptyBinding>(R.layout.activity_drug_interaction_empty) {
  private val viewModel: DrugInteractionEmptyVM by viewModels<DrugInteractionEmptyVM>()


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.drugInteractionEmptyVM = viewModel
  }

  override fun setUpClicks(): Unit {

    binding.btnLoadExample.setOnClickListener {
      val destIntent = DrugInteractionTwoDrugsActivity.getIntent(this, null)

      startActivity(destIntent)
    }

    binding.imageHome.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)

      startActivity(destIntent)
    }

    binding.imageCalendar.setOnClickListener {
      val destIntent = CalendarDateEmptyActivity.getIntent(this, null)

      startActivity(destIntent)
    }

    binding.imageUser.setOnClickListener {
      val destIntent = ProfileTwoActivity.getIntent(this, null)

      startActivity(destIntent)
    }
  }


  companion object {
    const val TAG: String = "DRUG_INTERACTION_EMPTY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DrugInteractionEmptyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
