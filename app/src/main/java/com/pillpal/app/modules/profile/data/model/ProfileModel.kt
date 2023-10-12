package com.pillpal.app.modules.profile.`data`.model

import com.pillpal.app.R
import com.pillpal.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_p_llpal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYung: String? = MyApp.getInstance().resources.getString(R.string.lbl_yung)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFilly: String? = MyApp.getInstance().resources.getString(R.string.lbl_filly)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAge: String? = MyApp.getInstance().resources.getString(R.string.lbl_age)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_28)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignOut: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNotificationValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTermsofservicValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etCommunityguideValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSupportValue: String? = null
)
