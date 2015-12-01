/*
 * Copyright 2015 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.rxsharedpreferences;

import android.content.SharedPreferences;

import java.util.Set;

import rx.Observable;

/**
 * Created by henrytao on 11/22/15.
 */
public class RxSharedPreferences {

  protected final BooleanPreference mBooleanPreference;

  protected final FloatPreference mFloatPreference;

  protected final IntegerPreference mIntegerPreference;

  protected final LongPreference mLongPreference;

  protected final SharedPreferences mSharedPreferences;

  protected final StringPreference mStringPreference;

  private final StringSetPreference mStringSetPreference;

  public RxSharedPreferences(SharedPreferences sharedPreferences) {
    if (sharedPreferences == null) {
      throw new RuntimeException("SharedPreferences can not be null");
    }
    mSharedPreferences = sharedPreferences;
    mBooleanPreference = new BooleanPreference(mSharedPreferences);
    mFloatPreference = new FloatPreference(mSharedPreferences);
    mIntegerPreference = new IntegerPreference(mSharedPreferences);
    mLongPreference = new LongPreference(mSharedPreferences);
    mStringPreference = new StringPreference(mSharedPreferences);
    mStringSetPreference = new StringSetPreference(mSharedPreferences);
  }

  public Boolean getBoolean(String key, Boolean defValue) {
    return mBooleanPreference.get(key, defValue);
  }

  public Float getFloat(String key, Float defValue) {
    return mFloatPreference.get(key, defValue);
  }

  public Integer getInt(String key, Integer defValue) {
    return mIntegerPreference.get(key, defValue);
  }

  public Long getLong(String key, Long defValue) {
    return mLongPreference.get(key, defValue);
  }

  public String getString(String key, String defValue) {
    return mStringPreference.get(key, defValue);
  }

  public Set<String> getStringSet(String key, Set<String> defValue) {
    return mStringSetPreference.get(key, defValue);
  }

  public Observable<Boolean> observeBoolean(String key, Boolean defValue) {
    return mBooleanPreference.observe(key, defValue);
  }

  public Observable<Float> observeFloat(String key, Float defValue) {
    return mFloatPreference.observe(key, defValue);
  }

  public Observable<Integer> observeInt(String key, Integer defValue) {
    return mIntegerPreference.observe(key, defValue);
  }

  public Observable<Long> observeLong(String key, Long defValue) {
    return mLongPreference.observe(key, defValue);
  }

  public Observable<String> observeString(String key, String defValue) {
    return mStringPreference.observe(key, defValue);
  }

  public Observable<Set<String>> observeStringSet(String key, Set<String> defValue) {
    return mStringSetPreference.observe(key, defValue);
  }

  public void putBoolean(String key, Boolean value) {
    mBooleanPreference.put(key, value);
  }

  public void putBooleanInBackground(String key, Boolean value) {
    mBooleanPreference.putInBackground(key, value);
  }

  public void putFloat(String key, Float value) {
    mFloatPreference.put(key, value);
  }

  public void putFloatInBackground(String key, Float value) {
    mFloatPreference.putInBackground(key, value);
  }

  public void putInt(String key, Integer value) {
    mIntegerPreference.put(key, value);
  }

  public void putIntInBackground(String key, Integer value) {
    mIntegerPreference.putInBackground(key, value);
  }

  public void putLong(String key, Long value) {
    mLongPreference.put(key, value);
  }

  public void putLongInBackground(String key, Long value) {
    mLongPreference.putInBackground(key, value);
  }

  public void putString(String key, String value) {
    mStringPreference.put(key, value);
  }

  public void putStringInBackground(String key, String value) {
    mStringPreference.putInBackground(key, value);
  }

  public void putStringSet(String key, Set<String> value) {
    mStringSetPreference.put(key, value);
  }

  public void putStringSetInBackground(String key, Set<String> value) {
    mStringSetPreference.putInBackground(key, value);
  }
}
