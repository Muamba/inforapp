/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package za.ac.cput.inforshare.ui.feed;

import java.util.List;

import za.ac.cput.inforshare.repository.db.model.Question;
import za.ac.cput.inforshare.ui.base.MvpView;

/**
 * Created by janisharali on 25/05/17.
 */

public interface FeedMvpView extends MvpView {
    void openLoginActivity();
    void openProfileActivity();

    void showAboutFragment();

    void updateUserName(String currentUserName);

    void updateUserEmail(String currentUserEmail);

    void updateUserProfilePic(String currentUserProfilePicUrl);

    void updateAppVersion();

    void closeNavigationDrawer();

    void lockDrawer();

    void unlockDrawer();

}
