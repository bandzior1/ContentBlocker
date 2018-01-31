/**
 This file is part of Adguard Content Blocker (https://github.com/AdguardTeam/ContentBlocker).
 Copyright © 2016 Performix LLC. All rights reserved.

 Adguard Content Blocker is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by the
 Free Software Foundation, either version 3 of the License, or (at your option)
 any later version.

 Adguard Content Blocker is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

 You should have received a copy of the GNU General Public License along with
 Adguard Content Blocker.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.adguard.android.service;

import com.adguard.commons.enums.FilteringQuality;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

/**
 * Service that stores application preferences
 */
public interface PreferencesService {

    /**
     * @return true if filters autoupdate is enabled
     */
    boolean isAutoUpdateFilters();

    /**
     * @param value true if filters autoupdate is enabled
     */
    void setAutoUpdateFilters(boolean value);

    /**
     * @return true if update over wifi only is enabled
     */
    boolean isUpdateOverWifiOnly();

    /**
     * @return True if we have shown the onboarding screen
     */
    boolean isOnboardingShown();

    /**
     * Save the flag determining that we have shown onboarding screen
     * @param value True if shown
     */
    void setOnboardingShown(boolean value);

    /**
     * @return Whitelisted domains
     */
    Set<String> getWhiteList();

    /**
     * Adds whitelisted domain
     *
     * @param item Domain to add
     */
    void addToWhitelist(String item);

    /**
     * Clears whitelist
     */
    void clearWhiteList();

    /**
     * Removes whitelisted domain
     *
     * @param item Domain to remove
     */
    void removeWhiteListItem(String item);

    /**
     * @return User filter rules
     */
    Set<String> getUserRules();

    /**
     * Adds new rule to user filter
     *
     * @param item Rule to add
     */
    void addUserRuleItem(String item);

    /**
     * Removes rule from the user filter
     *
     * @param item Rule to remove
     */
    void removeUserRuleItem(String item);

    /**
     * Clears user filter
     */
    void clearUserRules();

    /**
     * Add batch of user rules.
     *
     * @param items collection of rules
     */
    void addUserRuleItems(Collection<String> items);

    /**
     * @param time Last time updates where checked
     */
    void setLastUpdateCheck(long time);

    /**
     * @return Last time updates where checked
     */
    Date getLastUpdateCheck();

    /**
     * @param referrerString Referrer value (got from INSTALL_REFERRER receiver)
     */
    void setReferrer(String referrerString);

    /**
     * @return Referrer value (got from INSTALL_REFERRER receiver)
     */
    String getReferrer();

    /**
     * @return Device speed rank
     */
    int getDeviceSpeedRank();

    /**
     * Gets url from which user imported his rules
     *
     * @return last imported url
     */
    String getLastImportUrl();

    /**
     * Saves url from which user imported his rules
     *
     * @param url last url from which user has imported some rules
     */
    void setLastImportUrl(String url);

    /**
     * Set whether we should show useful ads
     */
    void setShowUsefulAds(boolean value);
    /**
     * Whether we should show useful ads
     */
    boolean isShowUsefulAds();

    void setFilterRuleCount(int ruleCount);

    int getFilterRuleCount();

    void incBrowserConnectedCount();

    int getBrowserConnectedCount();

    boolean isShowAboutOtherProduct();

    void setShowAboutOtherProduct(boolean value);
}
