/**
 * ownCloud Android client application
 *
 * @author David González Verdugo
 * Copyright (C) 2020 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.owncloud.android.dependecyinjection

import com.owncloud.android.domain.authentication.oauth.OIDCDiscoveryUseCase
import com.owncloud.android.domain.authentication.oauth.RegisterClientUseCase
import com.owncloud.android.domain.authentication.oauth.RequestTokenUseCase
import com.owncloud.android.domain.authentication.usecases.GetBaseUrlUseCase
import com.owncloud.android.domain.authentication.usecases.LoginBasicAsyncUseCase
import com.owncloud.android.domain.authentication.usecases.LoginOAuthAsyncUseCase
import com.owncloud.android.domain.authentication.usecases.SupportsOAuth2UseCase
import com.owncloud.android.domain.camerauploads.usecases.GetCameraUploadsConfigurationUseCase
import com.owncloud.android.domain.camerauploads.usecases.GetPictureUploadsConfigurationStreamUseCase
import com.owncloud.android.domain.camerauploads.usecases.GetVideoUploadsConfigurationStreamUseCase
import com.owncloud.android.domain.camerauploads.usecases.ResetPictureUploadsUseCase
import com.owncloud.android.domain.camerauploads.usecases.ResetVideoUploadsUseCase
import com.owncloud.android.domain.camerauploads.usecases.SavePictureUploadsConfigurationUseCase
import com.owncloud.android.domain.camerauploads.usecases.SaveVideoUploadsConfigurationUseCase
import com.owncloud.android.domain.capabilities.usecases.GetCapabilitiesAsLiveDataUseCase
import com.owncloud.android.domain.capabilities.usecases.GetStoredCapabilitiesUseCase
import com.owncloud.android.domain.capabilities.usecases.RefreshCapabilitiesFromServerAsyncUseCase
import com.owncloud.android.domain.files.GetUrlToOpenInWebUseCase
import com.owncloud.android.domain.server.usecases.GetServerInfoAsyncUseCase
import com.owncloud.android.domain.sharing.sharees.GetShareesAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.CreatePrivateShareAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.CreatePublicShareAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.DeleteShareAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.EditPrivateShareAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.EditPublicShareAsyncUseCase
import com.owncloud.android.domain.sharing.shares.usecases.GetShareAsLiveDataUseCase
import com.owncloud.android.domain.sharing.shares.usecases.GetSharesAsLiveDataUseCase
import com.owncloud.android.domain.sharing.shares.usecases.RefreshSharesFromServerAsyncUseCase
import com.owncloud.android.domain.user.usecases.GetStoredQuotaUseCase
import com.owncloud.android.domain.user.usecases.GetUserAvatarAsyncUseCase
import com.owncloud.android.domain.user.usecases.GetUserInfoAsyncUseCase
import com.owncloud.android.domain.user.usecases.RefreshUserQuotaFromServerAsyncUseCase
import org.koin.dsl.module

val useCaseModule = module {
    // Authentication
    factory { LoginBasicAsyncUseCase(get()) }
    factory { LoginOAuthAsyncUseCase(get()) }
    factory { SupportsOAuth2UseCase(get()) }
    factory { GetBaseUrlUseCase(get()) }

    // OAuth
    factory { OIDCDiscoveryUseCase(get()) }
    factory { RequestTokenUseCase(get()) }
    factory { RegisterClientUseCase(get()) }

    // Capabilities
    factory { GetCapabilitiesAsLiveDataUseCase(get()) }
    factory { GetStoredCapabilitiesUseCase(get()) }
    factory { RefreshCapabilitiesFromServerAsyncUseCase(get()) }

    // Sharing
    factory { GetShareesAsyncUseCase(get()) }
    factory { GetSharesAsLiveDataUseCase(get()) }
    factory { GetShareAsLiveDataUseCase(get()) }
    factory { RefreshSharesFromServerAsyncUseCase(get()) }
    factory { CreatePrivateShareAsyncUseCase(get()) }
    factory { EditPrivateShareAsyncUseCase(get()) }
    factory { CreatePublicShareAsyncUseCase(get()) }
    factory { EditPublicShareAsyncUseCase(get()) }
    factory { DeleteShareAsyncUseCase(get()) }

    // User
    factory { GetStoredQuotaUseCase(get()) }
    factory { GetUserInfoAsyncUseCase(get()) }
    factory { RefreshUserQuotaFromServerAsyncUseCase(get()) }
    factory { GetUserAvatarAsyncUseCase(get()) }

    // Server
    factory { GetServerInfoAsyncUseCase(get()) }

    // Camera Uploads
    factory { GetCameraUploadsConfigurationUseCase(get()) }
    factory { SavePictureUploadsConfigurationUseCase(get()) }
    factory { SaveVideoUploadsConfigurationUseCase(get()) }
    factory { ResetPictureUploadsUseCase(get()) }
    factory { ResetVideoUploadsUseCase(get()) }
    factory { GetPictureUploadsConfigurationStreamUseCase(get()) }
    factory { GetVideoUploadsConfigurationStreamUseCase(get()) }

    // Files
    factory { GetUrlToOpenInWebUseCase(get()) }
}
