/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.aboutme

import android.provider.ContactsContract


data class MyName(var name: String = "", var nickname: String = "",
                  var age: String = "",var birthday:String = "",
                  var course:String="", var phone_number:String = "",
                  var email:String = "",
                  var dream:String="",
                  var crush:String = "",
                    var message:String = "")
