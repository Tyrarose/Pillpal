package com.pillpal.app.modules.profiletwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pillpal.app.R
import com.pillpal.app.appcomponents.base.BaseActivity
import com.pillpal.app.appcomponents.views.ImagePickerFragmentDialog
import com.pillpal.app.databinding.ActivityProfileTwoBinding
import com.pillpal.app.modules.druginteractionempty.ui.DrugInteractionEmptyActivity
import com.pillpal.app.modules.profiletwo.`data`.viewmodel.ProfileTwoVM
import kotlin.String
import kotlin.Unit

class ProfileTwoActivity : BaseActivity<ActivityProfileTwoBinding>(R.layout.activity_profile_two) {
  private val viewModel: ProfileTwoVM by viewModels<ProfileTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCameraOne.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.txtLanguage.setOnClickListener {
      val destIntent = DrugInteractionEmptyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageCameraThree.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.imageCamera.setOnClickListener {
        ImagePickerFragmentDialog().show(supportFragmentManager)
        { path ->//TODO HANDLE DATA
        }

            }
        binding.imageArrowleft.setOnClickListener {
          finish()
        }
        binding.imageCameraTwo.setOnClickListener {
          ImagePickerFragmentDialog().show(supportFragmentManager)
          { path ->//TODO HANDLE DATA
          }

              }
        }

        companion object {
          const val TAG: String = "PROFILE_TWO_ACTIVITY"


          fun getIntent(context: Context, bundle: Bundle?): Intent {
            val destIntent = Intent(context, ProfileTwoActivity::class.java)
            destIntent.putExtra("bundle", bundle)
            return destIntent
          }
        }
      }
