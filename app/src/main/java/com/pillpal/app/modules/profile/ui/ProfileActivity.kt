package com.pillpal.app.modules.profile.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.databinding.ActivityProfileBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.profile.`data`.viewmodel.ProfileVM
import com.pillpal.app.modules.profiletwo.ui.ProfileTwoActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class ProfileActivity :
  BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
    setUpSearchViewPrivacypolicyListener()
  }

  override fun setUpClicks(): Unit {
    binding.etNotification.setOnClickListener {
      val destIntent = ProfileTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLanguage.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewPrivacypolicyListener(): Unit {
    binding.searchViewPrivacypolicy.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "PROFILE_ACTIVITY"

    }
  }
