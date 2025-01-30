/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vmadalin.easypermissions.components

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vmadalin.easypermissions.R
import com.vmadalin.easypermissions.annotations.AfterPermissionGranted
import com.vmadalin.easypermissions.annotations.Mockable
import com.vmadalin.easypermissions.EasyPermissions

@Mockable
class TestAppCompatActivity :
    AppCompatActivity(),
    EasyPermissions.PermissionCallbacks,
    EasyPermissions.RationaleCallbacks {

    companion object {
        const val REQUEST_CODE = 2
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        theme.applyStyle(R.style.Theme_AppCompat, true)
        super.onCreate(savedInstanceState)
    }

    override fun onPermissionsGranted(requestCode: Int, perms: List<String>) {}

    override fun onPermissionsDenied(requestCode: Int, perms: List<String>) {}

    override fun onRationaleAccepted(requestCode: Int) {}

    override fun onRationaleDenied(requestCode: Int) {}

    @AfterPermissionGranted(REQUEST_CODE)
    fun afterPermissionGranted() {}
}
