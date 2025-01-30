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
package com.vmadalin.easypermissions.helpers

import android.app.Activity
import android.content.Context
import androidx.core.app.ActivityCompat
import com.vmadalin.easypermissions.dialogs.RationaleDialog
import com.vmadalin.easypermissions.helpers.base.PermissionsHelper
import com.vmadalin.easypermissions.models.PermissionRequest

/**
 * Permissions helper for [Activity].
 */
internal class ActivityPermissionsHelper(
    host: Activity
) : PermissionsHelper<Activity>(host) {

    override var context: Context? = host

    override fun directRequestPermissions(requestCode: Int, perms: Array<out String>) {
        ActivityCompat.requestPermissions(host, perms, requestCode)
    }

    override fun shouldShowRequestPermissionRationale(perm: String): Boolean {
        return ActivityCompat.shouldShowRequestPermissionRationale(host, perm)
    }

    override fun showRequestPermissionRationale(permissionRequest: PermissionRequest) {
        RationaleDialog(host, permissionRequest).showDialog()
    }
}
