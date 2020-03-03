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

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.android.aboutme.databinding.ActivityMainBinding


/**
 * Main Activity of the AboutMe app. This app demonstrates:
 *     * LinearLayout with TextViews, ImageView, Button, EditText, and ScrollView
 *     * ScrollView to display scrollable text
 *     * Getting user input with an EditText.
 *     * Click handler for a Button to retrieve text from an EditText and set it in a TextView.
 *     * Setting the visibility status of a view.
 *     * Data binding between MainActivity and activity_main.xml. How to remove findViewById,
 *       and how to display data in views using the data binding object.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myName: MyName = MyName()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.doneButton.setOnClickListener {
            addNickname(it)
        }

    }

    /**
     * Click handler for the Done button.
     * Demonstrates how data binding can be used to make code much more readable
     * by eliminating calls to findViewById and changing data in the binding object.
     */
    private fun addNickname(view: View) {
        binding. apply {
            myName?.nickname = nicknameEdit.text.toString()
            myName?.name = nameEdit.text.toString()
            myName?.age = ageEdit.text.toString()
            myName?.birthday = birthdayEdit3.text.toString()
            myName?.phone_number = phoneEdit.text.toString()
            myName?.email = emailEdit.text.toString()
            myName?.course = courseEdit.text.toString()
            myName?.dream = dreamEdit.text.toString()
            myName?.crush = crushEdit.text.toString()
            myName?.message = messageEdit.text.toString()
            invalidateAll()
            nameEdit.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            ageEdit.visibility = View.GONE
            birthdayEdit3.visibility = View.GONE
            phoneEdit.visibility = View.GONE
            emailEdit.visibility = View.GONE
            courseEdit.visibility = View.GONE
            dreamEdit.visibility = View.GONE
            crushEdit.visibility = View.GONE
            messageEdit.visibility = View.GONE

            nameLabel.visibility = View.GONE
            nicknameLabel.visibility = View.GONE
            ageLabel.visibility = View.GONE
            birthdayLabel.visibility = View.GONE
            phoneLabel.visibility = View.GONE
            emailLabel.visibility = View.GONE
            courseLabel.visibility = View.GONE
            dreamLabel.visibility = View.GONE
            crushLabel.visibility = View.GONE
            messageLabel.visibility = View.GONE

            helloText.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
            nameText.visibility = View.VISIBLE
            ageText.visibility = View.VISIBLE
            thanksText.visibility = View.VISIBLE
        }

        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
