package com.pillpal.app.modules.profiletwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pillpal.app.modules.profiletwo.`data`.model.ProfileTwoModel
import org.koin.core.KoinComponent

class ProfileTwoVM : ViewModel(), KoinComponent {
  val profileTwoModel: MutableLiveData<ProfileTwoModel> = MutableLiveData(ProfileTwoModel())

  var navArguments: Bundle? = null
}
